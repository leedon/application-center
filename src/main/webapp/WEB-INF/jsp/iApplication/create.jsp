<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="../template/header.jsp" %>

<script>
    function createApplication() {
        console.log($("#applicationCreateForm").serialize())
        $.ajax({
            type: 'post',
            cache: false,
            url: '/application/center/create',
            data: $("#applicationCreateForm").serialize(),
            error: function (request) {
                alert("form submit error, please retry or contact system admin.")
            },
            success: function (data) {
                console.log(data);
                if (data.code == 0) {
                    window.location.href = "/application/center/list";
                } else {
                    alert(data.msg + "\n" + data.data);
                }
            }
        });
    }
</script>


<hr class="featurette-divider">
<h3>创建应用</h3>

<form role="form" style="position: relative; left:20%;" id="applicationCreateForm">
    <div class="form-group">
        <label for="applicationName">应用名称:</label>
        <input type="text" class="form-control" maxlength="20" size="30px" name="name" id="applicationName">
    </div>
    <div class="form-group">
        <label for="applicationCode">应用编号:</label>
        <input type="text" class="form-control" maxlength="20" size="30px" name="code" id="applicationCode">
    </div>
    <div class="form-group">
        <label for="emailGroup">邮件组:</label>
        <input type="email" class="form-control" maxlength="20" size="30px" name="emailGroup" id="emailGroup">
    </div>
    <div class="form-group">
        <label for="teamCode">团队编号:</label>
        <input type="text" class="form-control" maxlength="100" size="30px" name="teamCode" id="teamCode">
    </div>
    <div class="form-group">
        <label for="applicationHead">应用负责人:</label>
        <span class="label label-info">负责人之间使用/分割</span>
        <input type="text" class="form-control" size="30px" name="developers" id="applicationHead">
    </div>
    <button type="button" class="btn btn-default" onclick="createApplication()">Submit</button>
</form>


<%@ include file="../template/footer.jsp" %>