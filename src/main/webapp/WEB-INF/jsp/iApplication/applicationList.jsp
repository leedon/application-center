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
            $.ajax({
                type: 'get',
                cache: false,
                dataType: 'json',
                url: '/application/center/application/list',
                success: function (data) {
                    var applicationVos = data.data;
                    for(var i = 0; i< applicationVos.length; i++){
                        var data = applicationVos[i]
                        $("table tbody").append(
                                "<tr>" +
                                    "<td>" + data.name +  "</td><td>" + data.code + "</td>" +
                                    "<td>" + data.emailGroup + "</td>" +
                                    "<td>" +
                                        "<a href=\"/application/center/render/preview/" + data.code +"\" role=\"button\">详情</a> " +
                                        "<a href=\"/application/center/render/modify/"+ data.code + "\" role=\"button\">修改</a>" +
                                    "</td>" +
                                "</tr>");
                    }
                }
            })
        })

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

    <footer>
        <p class="pull-right"><a href="#">Back to top</a></p>

        <p>&copy; 2014 Company, Inc. &middot; <a href="#">Privacy</a> &middot; <a href="#">Terms</a></p>
    </footer>

</div>
<!-- /.container -->



</body>
</html>
