<%@ include file="../include/header.jsp" %>
<!--主要区域开始-->
<div id="main">
    <form action="" method="">
        <!--排序-->
        <div class="search_add">
            <div>
                <input type="button" value="月租" class="sort_asc" onclick="sort(this);" />
                <input type="button" value="基费" class="sort_asc" onclick="sort(this);" />
                <input type="button" value="时长" class="sort_asc" onclick="sort(this);" />
            </div>
            <input type="button" value="增加" class="btn_add" onclick="location.href='${pageContext.request.contextPath}/fee/feeList.do';" />
        </div>
        <!--启用操作的操作提示-->
        <div id="operate_result_info" class="operate_success">
            <img src="${pageContext.request.contextPath}/images/close.png" onclick="this.parentNode.style.display='none';" />
            删除成功！
        </div>
        <!--数据区域：用表格展示数据-->
        <div id="data">
            <table id="datalist">
                <tr>
                    <th>资费ID</th>
                    <th class="width100">资费名称</th>
                    <th>基本时长</th>
                    <th>基本费用</th>
                    <th>单位费用</th>
                    <th>创建时间</th>
                    <th>开通时间</th>
                    <th class="width50">状态</th>
                    <th class="width200"></th>
                </tr>
                <c:forEach items="${fr}" var="fee">
                    <tr>
                        <td>${fee.id}</td>
                        <td>${fee.fname}</td>
                        <td>${fee.ftime}</td>
                        <td>${fee.fcout}</td>
                        <td>${fee.fcounts}</td>
                        <td>${fee.createtime}</td>
                        <td>${fee.updatetime}</td>
                        <c:if test="${fee.state==1}">
                            <td>暂停</td>
                            <td>
                                <input type="button" value="启用" class="btn_start" onclick="startFee();" />
                                <input type="button" value="修改" class="btn_modify" onclick="location.href='fee_modi.jsp';" />
                                <input type="button" value="删除" class="btn_delete" onclick="deleteFee();" />
                            </td>
                        </c:if>
                        <c:if test="${fee.state==0}">
                            <td>开通</td>
                        </c:if>
                    </tr>
                </c:forEach>
            </table>
            <p>业务说明：<br />
                1、创建资费时，状态为暂停，记载创建时间；<br />
                2、暂停状态下，可修改，可删除；<br />
                3、开通后，记载开通时间，且开通后不能修改、不能再停用、也不能删除；<br />
                4、业务账号修改资费时，在下月底统一触发，修改其关联的资费ID（此触发动作由程序处理）
            </p>
        </div>
        <!--分页-->
        <div id="pages">
            <a href="#">上一页</a>
            <a href="#" class="current_page">1</a>
            <a href="#">2</a>
            <a href="#">3</a>
            <a href="#">4</a>
            <a href="#">5</a>
            <a href="#">下一页</a>
        </div>
    </form>
</div>
<!--主要区域结束-->
<div id="footer">

</div>
<script language="javascript" type="text/javascript">
    //排序按钮的点击事件
    function sort(btnObj) {
        if (btnObj.className == "sort_desc")
            btnObj.className = "sort_asc";
        else
            btnObj.className = "sort_desc";
    }

    //启用
    function startFee() {
        var r = window.confirm("确定要启用此资费吗？资费启用后将不能修改和删除。");
        document.getElementById("operate_result_info").style.display = "block";
    }
    //删除
    function deleteFee() {
        var r = window.confirm("确定要删除此资费吗？");
        document.getElementById("operate_result_info").style.display = "block";
    }
</script>
</body>
</html>
