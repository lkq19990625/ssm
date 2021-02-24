<%@page contentType="text/html; charset=utf-8" %>
<%@include file="../include/header.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!--主要区域开始-->
        <div id="main">
            <!--保存操作后的提示信息：成功或者失败-->
            <div id="save_result_info" class="save_success"></div><!--保存失败，角色名称重复！-->
            <form action="${pageContext.request.contextPath}/role/insertRole.do" enctype="multipart/form-data" method="post" class="main_form">
                <div class="text_info clearfix"><span>角色名称：</span></div>
                <div class="input_info">
                    <input type="text" class="width200" name="rname"/>
                    <span class="required">*</span>
                    <div class="validate_msg_medium">不能为空，且为20长度的字母、数字和汉字的组合</div>
                </div>
                <div class="text_info clearfix"><span>角色图片：</span></div>
                <div class="input_info">
                    <input type="file" class="width200" name="by001"/>
                    <span class="required">*</span>
<%--                    <div class="validate_msg_medium">不能为空，且为20长度的字母、数字和汉字的组合</div>--%>
                </div>
                <div class="text_info clearfix"><span>设置权限：</span></div>
                <div class="input_info_high">
                    <div class="input_info_scroll">
                        <ul>
                            <c:forEach items="${lp}" var="priv">
                                <li><input type="checkbox" name="privs" value="${priv.pid}"/>${priv.name}</li>
                            </c:forEach>
                        </ul>
                    </div>
                    <span class="required">*</span>
                    <div class="validate_msg_tiny">至少选择一个权限</div>
                </div>
                <div class="button_info clearfix">
                    <input type="button" value="保存" class="btn_save" id="save" />
                    <input type="button" value="取消" class="btn_save" />
                </div>
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">

        </div>
<script type="text/javascript">
    $(function () {
        $("#save").click(function () {
            $(".main_form").submit();
        })
        var msg = '${state}';
        if(msg === '1'){
            $("#save_result_info").text("添加成功");
            $("#sava_result_info").attr("class","save_success");
            $("#save_result_info").css("display","block");
            setTimeout('$("#save_result_info").css("display","none");',3000);
        }else if(msg === '2'){
            $("#save_result_info").text("添加失败");
            $("#sava_result_info").attr("class","save_fail");
            $("#save_result_info").css("display","block");
            setTimeout('$("#save_result_info").css("display","none");',3000);
        }
    })
</script>
