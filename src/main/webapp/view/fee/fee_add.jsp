<%@ include file="../include/header.jsp" %>
<!--主要区域开始-->
<div id="main">
    <div id="save_result_info" class="save_success"></div>
    <form action="${pageContext.request.contextPath}/fee/feeAddList.do" method="post" class="main_form">
        <div class="text_info clearfix"><span>资费名称：</span></div>
        <div class="input_info">
            <input type="text" class="width300" name="fname" value=""/>
            <span class="required">*</span>
            <div class="validate_msg_short">50长度的字母、数字、汉字和下划线的组合</div>
        </div>
        <div class="text_info clearfix"><span>资费类型：</span></div>
        <div class="input_info fee_type">
            <input type="radio" name="radFeeType" id="monthly" onclick="feeTypeChange(1);" />
            <label for="monthly">包月</label>
            <input type="radio" name="radFeeType" checked="checked" id="package" onclick="feeTypeChange(2);" />
            <label for="package">套餐</label>
            <input type="radio" name="radFeeType" id="timeBased" onclick="feeTypeChange(3);" />
            <label for="timeBased">计时</label>
        </div>
        <div class="text_info clearfix"><span>基本时长：</span></div>
        <div class="input_info">
            <input type="text" value=""  name="ftime" class="width100" />
            <span class="info">小时</span>
            <span class="required">*</span>
            <div class="validate_msg_long">1-600之间的整数</div>
        </div>
        <div class="text_info clearfix"><span>基本费用：</span></div>
        <div class="input_info">
            <input type="text" value=""  name="fcout" class="width100" />
            <span class="info">元</span>
            <span class="required">*</span>
            <div class="validate_msg_long error_msg">0-99999.99之间的数值</div>
        </div>
        <div class="text_info clearfix"><span>单位费用：</span></div>
        <div class="input_info">
            <input type="text" value=""  name="fcounts" class="width100" />
            <span class="info">元/小时</span>
            <span class="required">*</span>
            <div class="validate_msg_long error_msg">0-99999.99之间的数值</div>
        </div>
        <div class="text_info clearfix"><span>资费说明：</span></div>
        <div class="input_info_high">
            <textarea class="width300 height70" name="by001"></textarea>
            <div class="validate_msg_short error_msg">100长度的字母、数字、汉字和下划线的组合</div>
        </div>
        <div class="button_info clearfix">
            <input type="button" value="保存" class="btn_save" id="add_btn" />
            <input type="button" value="取消" class="btn_save" />
        </div>
    </form>
</div>
<!--主要区域结束-->
<div id="footer">

</div>
<script language="javascript" type="text/javascript">
    //保存结果的提示
    $(function () {
        $("#add_btn").click(function () {
            $(".main_form").submit();
        })
        var msg = '${state}';
        if(msg == 1){
            $("#save_result_info").text("添加成功");
            $("#save_result_info").attr("class","save_success");
            $("#save_result_info").css("display","block");
            setTimeout('$("#save_result_info").css("display","none");',2300);
        }else if(msg == 0){
            $("#save_result_info").text("添加失败");
            $("#save_result_info").attr("class","save_fail");
            $("#save_result_info").css("display","block");
            setTimeout('$("#save_result_info").css("display","none");',2300);
        }
    })

    //切换资费类型
    function feeTypeChange(type) {
        var inputArray = document.getElementById("main").getElementsByTagName("input");
        if (type == 1) {
            inputArray[4].readonly = true;
            inputArray[4].value = "";
            inputArray[4].className += " readonly";
            inputArray[5].readonly = false;
            inputArray[5].className = "width100";
            inputArray[6].readonly = true;
            inputArray[6].className += " readonly";
            inputArray[6].value = "";
        }
        else if (type == 2) {
            inputArray[4].readonly = false;
            inputArray[4].className = "width100";
            inputArray[5].readonly = false;
            inputArray[5].className = "width100";
            inputArray[6].readonly = false;
            inputArray[6].className = "width100";
        }
        else if (type == 3) {
            inputArray[4].readonly = true;
            inputArray[4].value = "";
            inputArray[4].className += " readonly";
            inputArray[5].readonly = true;
            inputArray[5].value = "";
            inputArray[5].className += " readonly";
            inputArray[6].readonly = false;
            inputArray[6].className = "width100";
        }
    }
</script>
</body>
</html>
