<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" href="../../favicon.ico">

    <title>Application-Center</title>

    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/carousel.css" rel="stylesheet">

    <script src="/js/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>

    <script>
        $(document).ready(function () {
            var applicationCode = window.location.pathname.split("/").reverse()[0]
            $("#ServerListTabA").bind("click", serverInfo(applicationCode))
            $("#UrlAclTabA").bind("click", urlList(applicationCode))
        })

        function serverInfo(applicationCode) {
            $.ajax({
                type:'get',
                cache: false,
                dataType: 'json',
                url: '/application/center/server/query/' + applicationCode,
                success : function (data) {
                    var serverInfo = data.data
                    for(var i = 0; i< serverInfo.length; i++) {
                        var data = serverInfo[i]
                        $("#serverTbody").append(
                                "<tr>" +
                                "<td>" + data.environmentType + "</td>" +
                                "<td>" + data.serverName + "</td>" +
                                "<td>" + data.serverIp + "</td>" +
                                "<td>" + data.serverPort +"</td>" +
                                "<td>####</td>" +
                                "</tr>")
                    }
                },
                error : function (data) {
                    alert("查询服务器信息出错")
                }
            })
        }

        function urlList(applicationCode){
            $.ajax({
                type:'get',
                cache: false,
                dataType: 'json',
                url: '/application/center/acl/query/' + applicationCode,
                success : function (data) {
                    var serverInfo = data.data
                    for(var i = 0; i< serverInfo.length; i++) {
                        var data = serverInfo[i]
                        $("#urlTbody").append(
                                "<tr>" +
                                "<td>" + data.url + "</td>" +
                                "<td>" + data.state + "</td>" +
                                "<td>" + data.authorizedApplication + "</td>" +
                                "<td>" + data.authorizedIp +"</td>" +
                                "<td>####</td>" +
                                "</tr>")
                    }
                },
                error : function (data) {
                    alert("查询应用的acl信息出错")
                }
            })
        }
    </script>
</head>
<body>

<div class="navbar-wrapper">
    <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <a class="navbar-brand" href="/">Application-Center</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li><a href="/application/center/list">iApplication</a></li>
                        <li><a href="#">iConfig</a></li>
                        <li><a href="#about">About</a></li>
                        <li><a href="#contact">Contact</a></li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                               aria-haspopup="true" aria-expanded="false">More <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Action</a></li>
                                <li role="separator" class="divider"></li>
                                <li class="dropdown-header">Nav header</li>
                                <li><a href="#">Separated link</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
            </div>
        </nav>

    </div>
</div>

<div class="container marketing">
    <hr class="featurette-divider">
    <h3>应用详情</h3>

    <div class="tabbable"> <!-- Only required for left/right tabs -->
        <ul class="nav nav-tabs">
            <li id="ServerListTabA" class="active"><a href="#ServerListTab" data-toggle="tab">服务器列表</a></li>
            <li><a id="UrlAclTabA" href="#UrlAclTab" data-toggle="tab">URL访问控制</a></li>
            <li><a href="#LogCollectTab" data-toggle="tab">日志收集列表</a></li>
            <li><a href="#OperateLogTab" data-toggle="tab">操作记录</a></li>
        </ul>
        <div class="tab-content">
            <div class="tab-pane active" id="ServerListTab">
                <br/>
                <table class = "table table-hover table-bordered">
                    <thead>
                    <tr>
                        <th>环境</th>
                        <th>服务器名称</th>
                        <th>IP</th>
                        <th>应用端口</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody id="serverTbody">
                    </tbody>
                </table>
            </div>
            <div class="tab-pane" id="UrlAclTab">
                <br/>
                <a href="#"><p class="text-info">新增URL访问控制</p></a>
                <table class="table table-hover table-bordered">
                    <thead>
                    <tr>
                        <th>URL</th>
                        <th>状态</th>
                        <th>授权应用</th>
                        <th>授权IP</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody id="urlTbody">
                    </tbody>
                </table>
            </div>
            <div class="tab-pane" id="LogCollectTab">
                <br/>
                <table class="table table-hover table-bordered">
                    <thead>
                    <tr>
                        <th>日志文件名称</th>
                        <th>模式</th>
                        <th>目录</th>
                        <th>收集状态</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>
            </div>
            <div class="tab-pane" id="OperateLogTab">
                <br/>
                <table class="table table-hover table-bordered">
                    <thead>
                    <tr>
                        <th>操作人</th>
                        <th>操作时间</th>
                        <th>操作详情</th>
                    </tr>
                    </thead>
                    <tbody>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>

        <p>&copy; 2014 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
    </footer>

</div>
<!-- /.container -->


</body>
</html>
