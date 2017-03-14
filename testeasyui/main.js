$(function() {
    $(this).createCombo({
        comboId : "#cc",
        selectId : "#sp"
    });
    // 下拉框内checkbox点击事件
    $('#sp input').click(function() {
        // combo中checkbox选中的情况
        if ($(this).is(':checked')) {
            var v = $(this).val();
            var s = $(this).next('span').text();
            // 获取选中的checkbox的值显示在combo中
            $(this).getChose({
                comboId : "#cc",
                checkboxId : "#sp input"
            });
            // 动态添加div中显示信息
            $("#test").append("<input type='checkbox' value='" + v + "' checked><span>" + s + "</span><br/>");
            return;
        }

        // combo中checkbox取消的情况
        // 获取选中的checkbox的值显示在combo中
        $(this).getChose({
            comboId : "#cc",
            checkboxId : "#sp input"
        });
        // 删除下面div中的显示信息
        for (var k = 0; k < $("#test").find("span").length; k++) {
            var direct = $("#test").find("span").eq(k).prev();
            if (direct.val() == $(this).val()) {
                direct.attr("checked", false);
                // 删除元素
                $(this).cancelChosed(direct);
            }
        }
    });

    // 对于动态添加的元素添加点击事件  （知识点: 直接使用.click不可用  无法获得元素）
    $(document).on("click", "#test input", function() {
        $(this).attr("checked", false);
        // 设置combo内的checkbox未选中状态
        for (var l = 0; l < $("#sp").find("input").length; l++) {
            var redirect = $("#sp").find("input").eq(l);
            if (redirect.val() == $(this).val()) {
                redirect.attr("checked", false);
                // 重新获取选中的checkbox的值显示在combo中
                $(this).getChose({
                    comboId : "#cc",
                    checkboxId : "#sp input"
                });
            }
        }
        // 删除div中信息
        $("#test").cancelChosed($(this));
    });
});
