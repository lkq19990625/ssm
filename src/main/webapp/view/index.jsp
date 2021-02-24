<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <title></title>
        <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/css/global.css" />
        <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/css/global_color.css" />
        <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    </head>
    <body class="index">
        <!--导航区域开始-->
        <div id="index_navi">
            <ul id="menu">
                <c:forEach items="${sessionScope.admin.lp}" var="priv">
                    <li><a href="${priv.purl}" class="${priv.pclass}_off"></a></li>
                </c:forEach>
            </ul>
        </div>
    </body>
    <script type="text/javascript">
        $(function () {
            $(".index_off").attr("class","index_on");
        })
    </script>
</html>
