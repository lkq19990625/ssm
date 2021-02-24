<%--
  Created by IntelliJ IDEA.
  User: 李克强
  Date: 2021/1/4
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html; charset=utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/css/global.css" />
    <link type="text/css" rel="stylesheet" media="all" href="${pageContext.request.contextPath}/css/global_color.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.js"></script>
    <script type="text/javascript">
        $(function (){
            $("#update").click(function (){
                $("#form").submit();
            })
        })
    </script>
</head>
<body>
<!--Logo区域开始-->
<div id="header">
    <img src="../../images/logo.png" alt="logo" class="left"/>
    <span>当前用户为：${admin.aname}</span>
    <a href="${pageContext.request.contextPath}/admin/exitLogin.do">[退出]</a>
</div>
<!--Logo区域结束-->
<!--导航区域开始-->
<div id="navi">
    <ul id="menu">
        <c:forEach items="${admin.lp}" var="pri">
            <li><a href="${pri.purl}" class="${pri.pclass}_off"></a></li>
        </c:forEach>
    </ul>
</div>
<!--导航区域结束-->
