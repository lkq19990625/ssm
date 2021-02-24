<%@page contentType="text/html; charset=utf-8" %>
<%@include file="../include/header.jsp"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!--主要区域开始-->
        <div id="main">
            <form action="" method="">
                <!--查询-->
                <div class="search_add">
                    <input type="button" value="增加" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/priv/getAllPrivs.do';" />
                </div>
                <!--删除的操作提示-->
                <div id="operate_result_info" class="operate_success">
                    <img src="../../images/close.png" onclick="this.parentNode.style.display='none';" />
                    删除成功！
                </div> <!--删除错误！该角色被使用，不能删除。-->
                <!--数据区域：用表格展示数据-->
                <div id="data">
                    <table id="datalist">
                        <tr>
                            <th>角色 ID</th>
                            <th>角色名称</th>
                            <th>角色图标</th>
                            <th class="width600">拥有的权限</th>
                            <th class="td_modi"></th>
                        </tr>
                            <c:forEach items="${pageInfo.list}" var="role">
                        <tr>

                            <td>${role.id}</td>
                            <td>${role.rname}</td>
                            <td><img src="${role.by001 }" width="40" height="40"/></td>
                            <td>${role.list}</td>
                            <td>
                                <input type="button" value="修改" class="btn_modify" onclick="updateRole('${role.id}','${role.rname}','${role.pid}');"/>
                                <input type="button" value="删除" class="btn_delete" onclick="deleteRole('${role.id}');" />
                            </td>
                        </tr>
                        </c:forEach>
                    </table>
                </div>
                <!--分页-->
                <div id="pages">
        	        当前页码:${pageInfo.pageNum}<a href="#" class="current_page"></a>总页数:${pageInfo.pages}
                    <c:if test="${!pageInfo.isFirstPage}">
                        <a href="${pageContext.request.contextPath}/role/roleList.do">首页</a>
                        <a href="${pageContext.request.contextPath}/role/roleList.do?pageNum=${pageInfo.prePage}">上一页</a>
                    </c:if>
                    <c:if test="${!pageInfo.isLastPage}">
                        <a href="${pageContext.request.contextPath}/role/roleList.do?pageNum=${pageInfo.nextPage}">下一页</a>
                        <a href="${pageContext.request.contextPath}/role/roleList.do?pageNum=${pageInfo.pages}">尾页</a>
                    </c:if>
                    总记录数：${pageInfo.total}
                </div>
            </form>
        </div>
        <!--主要区域结束-->
        <div id="footer">

        </div>

    <script language="javascript" type="text/javascript">
        function deleteRole(rid) {
            var r = window.confirm("确定要删除此角色吗？");
            if (r){
                location.href="/role/deleteRole.do?rid="+rid;
            }
        }
        function updateRole(rid,rname,pid) {
            location.href="/role/getRole.do?rid="+rid+"&rname="+rname+"&pid="+pid;
        }
        $(function () {
            var msg = '${state}';
            if(msg === '1'){
                $("#operate_result_info").text("删除成功");
                $("#operate_result_info").attr("class","operate_success");
                $("#operate_result_info").css("display","block");
                setTimeout('$("#operate_result_info").css("display","none");',3000);
            }else if(msg === '2'){
                $("#operate_result_info").text("删除失败");
                $("#operate_result_info").attr("class","operate_fail");
                $("#operate_result_info").css("display","block");
                setTimeout('$("#operate_result_info").css("display","none");',3000);
            }
        })
    </script>
