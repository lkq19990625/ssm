<%@page contentType="text/html; charset=utf-8" %>
<%@include file="../include/header.jsp"%>
<script type="text/javascript">
    $(function(){
        $("#btn_save").click(function(){
            $.ajax({
                url : '${pageContext.request.contextPath}/admin/updateInformation.do',
                data: $(".main_form").serialize(),
                success: function(${updateInformation}){
                    $("#save_result_info").text(${updateInformation});
                    $("#save_result_info").css("display","block");
                    setTimeout("$('#save_result_info').css('display','none')",3000);
                }
            });
        });
    })
</script>
    <body>
        <!--主要区域开始-->
        <div id="main">            
            <!--保存操作后的提示信息：成功或者失败-->
            <div id="save_result_info" class="save_success"></div><!--保存失败，数据并发错误！-->
            <form action="${pageContext.request.contextPath}/admin/updateInformation.do" method="post" class="main_form">
                <div class="text_info clearfix"><span>管理员账号：</span></div>
                <div class="input_info"><input type="text" readonly="readonly" class="readonly" value="${admin.acname}" name="acname"/></div>
                <div class="text_info clearfix"><span>角色：</span></div>
                <div class="input_info">
                    <input type="text" readonly="readonly" class="readonly width400" value="${admin.roleList}" />
                </div>
                <div class="text_info clearfix"><span>姓名：</span></div>
                <div class="input_info">
                    <input type="text" value="${admin.aname}" name="aname"/>
                    <span class="required">*</span>
                    <div class="validate_msg_long error_msg">20长度以内的汉字、字母的组合</div>
                </div>
                <div class="text_info clearfix"><span>电话：</span></div>
                <div class="input_info">
                    <input type="text" class="width200" value="${admin.atel}" name="atel"/>
                    <div class="validate_msg_medium">电话号码格式：手机或固话</div>
                </div>
                <div class="text_info clearfix"><span>Email：</span></div>
                <div class="input_info">
                    <input type="text" class="width200" value="${admin.aemail}" name="aemail"/>
                    <div class="validate_msg_medium">50长度以内，符合 email 格式</div>
                </div>
                <div class="text_info clearfix"><span>创建时间：</span></div>
                <div class="input_info"><input type="text" readonly="readonly" class="readonly" value="${admin.createTime}"/></div>
                <div class="button_info clearfix">
                    <input type="button" value="保存" class="btn_save" id="btn_save" />
                    <input type="button" value="取消" class="btn_save" />
                    <input type="hidden" name="id" value="${admin.id }">
                </div>
            </form>  
        </div>
        <!--主要区域结束-->
        <div id="footer">
          
        </div>
    </body>
<script language="javascript" type="text/javascript">
    //保存成功的提示信息
    function showResultDiv(flag) {
        var divResult = document.getElementById("save_result_info");
        if (flag)
            divResult.style.display = "block";
        else
            divResult.style.display = "none";
    }
    $(function () {
        $(".information_off").attr("class","information_on");
    })
</script>
