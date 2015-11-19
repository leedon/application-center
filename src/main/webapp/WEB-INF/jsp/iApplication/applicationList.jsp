<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../template/header.jsp" %>

<script>

    $(document).ready(function () {
        $.ajax({
            type: 'get',
            cache: false,
            dataType: 'json',
            url: '/application/center/application/list',
            success: function (data) {
                var applicationVos = data.data;
                for (var i = 0; i < applicationVos.length; i++) {
                    var data = applicationVos[i]
                    $("table tbody").append(
                            "<tr>" +
                            "<td>" + data.name + "</td><td>" + data.code + "</td>" +
                            "<td>" + data.emailGroup + "</td>" +
                            "<td>" +
                            "<a href=\"/application/center/render/detail/" + data.code + "\" role=\"button\">详情</a> " +
                            "<a href=\"/application/center/render/preview/" + data.code + "\" role=\"button\">预览</a> " +
                            "<a href=\"/application/center/render/modify/" + data.code + "\" role=\"button\">修改</a>" +
                            "</td>" +
                            "</tr>");
                }
            }
        })
    })

</script>

<hr class="featurette-divider">
<h3>应用列表</h3>
<di>
    <form class="form-inline">
        <div class="input-append">
            <input class="span2" id="appendedInputButtons" type="text">
            <button class="btn btn-primary" type="submit">搜索</button>
            <a class="btn btn-primary" type="button" href="/application/center/render/create">创建应用</a>
        </div>
    </form>
</di>

<table class="table table-hover table-bordered">
    <thead>
    <tr>
        <th>应用名称</th>
        <th>应用编号</th>
        <th>邮件组</th>
        <th>操作</th>
    </tr>
    </thead>
    <tbody>
    </tbody>
</table>


<%@ include file="../template/footer.jsp" %>