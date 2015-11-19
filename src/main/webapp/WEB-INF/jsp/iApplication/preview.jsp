<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../template/header.jsp" %>


<script>

    $(document).ready(function () {
        var applicationCode = window.location.pathname.split("/").reverse()[0];
        $.ajax({
            type: 'get',
            cache: false,
            dataType: 'json',
            url: '/application/center/detail/' + applicationCode,
            success: function (data) {
                $("#applicationName").val(data.data.name)
                $("#applicationCode").val(data.data.code)
                $("#emailGroup").val(data.data.emailGroup)
                $("#teamCode").val(data.data.teamCode)
                $("#applicationHead").val(data.data.developers)
            }
        })
    })

</script>

<hr class="featurette-divider">
<h3>预览应用</h3>

<form role="form" style="position: relative; left:20%;" id="applicationPreviewForm">
    <div class="form-group">
        <label for="applicationName">应用名称:</label>
        <input type="text" class="form-control" maxlength="20" size="30px" name="name" id="applicationName" readonly>
    </div>
    <div class="form-group">
        <label for="applicationCode">应用编号:</label>
        <input type="text" class="form-control" maxlength="20" size="30px" name="code" id="applicationCode" readonly>
    </div>
    <div class="form-group">
        <label for="emailGroup">邮件组:</label>
        <input type="email" class="form-control" maxlength="20" size="30px" name="emailGroup" id="emailGroup" readonly>
    </div>
    <div class="form-group">
        <label for="teamCode">团队编号:</label>
        <input type="text" class="form-control" maxlength="100" size="30px" name="teamCode" id="teamCode">
    </div>
    <div class="form-group">
        <label for="applicationHead">应用负责人:</label>
        <span class="label label-info">负责人之间使用/分割</span>
        <input type="text" class="form-control" size="30px" name="developers" id="applicationHead" readonly>
    </div>
</form>

<%@ include file="../template/footer.jsp" %>