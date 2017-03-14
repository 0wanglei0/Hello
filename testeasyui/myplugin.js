(function($){     
    $.fn.extend({     
        cancelChosed : function(opt) {
            opt.next().next().remove();
            opt.next().remove();
            opt.remove();
        },
        // 获取选中的checkbox的值显示在combo中
        getChose: function(params) {
            var getCombo = params.comboId;
            var getCheckbox = params.checkboxId;
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
        },
        // 创建下拉框
        createCombo : function(params) {
            var getCombo = params.comboId;
            var getDisplay = params.selectId;
            $(getCombo).combo({
                required: true,
                editable: false
            });
            $(getDisplay).appendTo($(getCombo).combo('panel'));

        }
    });
})(jQuery);