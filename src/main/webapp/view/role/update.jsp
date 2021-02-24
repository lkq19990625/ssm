<%@page contentType="text/html; charset=utf-8" %>
<%@include file="../include/header.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <script language="javascript" type="text/javascript">
            $(function () {
                var msg = '${state}';
                if(msg === '1'){
                    $("#save_result_info").text("修改成功");
                    $("#save_result_info").attr("class","save_success");
                    $("#save_result_info").css("display","block");
                    setTimeout('$("#save_result_info").css("display","none");',3000);
                }else if(msg === '2'){
                    $("#save_result_info").text("修改失败");
                    $("#sava_result_info").attr("class","save_fail");
                    $("#save_result_info").css("display","block");
                    setTimeout('$("#save_result_info").css("display","none");',3000);
                }
            })
        </script>
    <body onload="startTimes()">
        <h1 id="error">
            <div id="save_result_info" class="save_success" ></div>
            <a class="main.jsp" href="${pageContext.request.contextPath}/role/roleList.do">返回</a>
        </h1>
    </body>
</html>
