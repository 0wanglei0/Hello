(function($){
	var ComboLike = function($dom, options){
		this.baseDom = $dom;
		this.url = options.url;
		this.comId = options.comboId;
		this.displayId = options.displayId;

		this.addCheckBox(this.url, this.comId);
		this.createCombo(this.baseDom, this.comId);
		this.startup(this.baseDom, this.comId, this.displayId);
	}

	ComboLike.prototype = {

			constructor: ComboLike,

			// 解析模板，构建dom
			addCheckBox :function () {
				var url = arguments[0];
				var comId = arguments[1];

				$.getJSON(url, function (json, textStatus) {  
					for (var i = 0; i < json.lang.length; i++) {  
						$(comId).find('.addCheckbox').append('<input type="checkbox" name="lang" value="' + json.lang[i].key + '">' + "<span>" + json.lang[i].value + "</span><br />");
					}
				});
			},

			// 创建下拉框
			createCombo : function() {
				var getSelect = arguments[0];
				var getCombo = arguments[1];
				$(getSelect).combo({
					required: true,
					editable: false
				});
				$(getCombo).appendTo($(getSelect).combo('panel'));
			},

			// 事件绑定等处理
			startup: function(){
				// 下拉框内checkbox点击事件
				var comboId = arguments[1];
				var comboInput = arguments[1] + " input";
				var selectId = "#" + arguments[0].attr('id');
				var displayId = arguments[2];
				var displayChk = arguments[2] + " input";
				$(document).on("click", comboInput, function() {
					// combo中checkbox选中的情况
					if ($(this).is(':checked')) {
						var v = $(this).val();
						var s = $(this).next('span').text();
						// 获取选中的checkbox的值显示在combo中
						$(selectId).ComboLike("getChose", comboInput);
						// 动态添加div中显示信息
						$(displayId).append("<input type='checkbox' value='" + v + "' checked><span>" + s + "</span><br/>");
						return;
					}

					// combo中checkbox取消的情况
					// 获取选中的checkbox的值显示在combo中
					$(selectId).ComboLike("getChose", comboInput);
					// 删除下面div中的显示信息
					for (var k = 0; k < $(displayId).find("span").length; k++) {
						var direct = $(displayId).find("span").eq(k).prev();
						if (direct.val() == $(this).val()) {
							direct.attr("checked", false);
							// 删除元素
							$(selectId).ComboLike("cancelChosed", direct);
						}
					}
				});

				// 对于动态添加的元素添加点击事件  （知识点: 直接使用.click不可用  无法获得元素）
				$(document).on("click", displayChk, function() {
					$(this).attr("checked", false);
					// 设置combo内的checkbox未选中状态
					for (var l = 0; l < $(comboId).find("input").length; l++) {
						var redirect = $(comboId).find("input").eq(l);
						if (redirect.val() == $(this).val()) {
							redirect.attr("checked", false);
							// 重新获取选中的checkbox的值显示在combo中
							$(selectId).ComboLike("getChose", comboInput);
						}
					}
					// 删除div中信息
					$(selectId).ComboLike("cancelChosed", $(this));
				});
			},

			// 暴露的api接口
			api: {
				// 删除取消选中项信息
				cancelChosed : function() {
					var opt = arguments[0][0];
					opt.next().next().remove();
					opt.next().remove();
					opt.remove();
				},

				// 获取选中的checkbox的值显示在combo中
				getChose: function() {
					var getCombo = "#" + arguments[0][1];
					var getCheckbox = arguments[0][0];
					var text = "";
					var arr = new Array();
					var j = 0;
					// 将选中状态的checkbox后面的span的值存入数组
					for (var i = 0; i < $(getCheckbox).length; i++) {
						if ($(getCheckbox).eq(i).is(":checked")) {
							arr[j] = $(getCheckbox).eq(i).next('span').text();
							j++;
						}
					}
					// 拼接 需要显示在combo中的字符串
					if (arr.length > 0) {
						for (var i = 0; i < arr.length - 1; i++) {
							text += arr[i] + ',';
						}
						text += arr[arr.length - 1];
					}
					$(getCombo).combo('setText', text);
				}
			}
	}

	$.fn.ComboLike = function(options){
		var _this = this;
		var _arguments = arguments;
		var comboObj = _this.data("combolike");
		// 调用组件的api方法
		if(typeof options === 'string'){
			var args = Array.prototype.slice.call(_arguments);
			var thisId = _this.attr('id');
			args.push(thisId);
			var methodName = args.shift();
			comboObj.api[methodName].call(comboObj, args);
		}

		if(comboObj){
			// 组件已经创建，无需二次创建
			return;
		}else {
			// 创建组件

			options = $.extend({}, $.fn.ComboLike.defaults, options);
			comboObj = new ComboLike(_this, options);
			_this.data("combolike", comboObj);
		}
	};

	$.fn.ComboLike.defaults = {
			url: 'checkbox.json',
			comboId: "#sp",
			displayId: "#test"
	};
})(jQuery);