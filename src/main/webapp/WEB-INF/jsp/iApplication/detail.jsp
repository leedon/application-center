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
            <li class="active"><a href="#ServerListTab" data-toggle="tab">服务器列表</a></li>
            <li><a href="#UrlAclTab" data-toggle="tab">URL访问控制</a></li>
            <li><a href="#LogCollectTab" data-toggle="tab">日志收集列表</a></li>
            <li><a href="#OperateLogTab" data-toggle="tab">操作记录</a></li>
        </ul>
        <div class="tab-content">
            <div class="tab-pane active" id="ServerListTab">
                <p>Howdy, I'm in Section 2.</p>
            </div>
            <div class="tab-pane" id="UrlAclTab">
                <p>Howdy, I'm in Section 2.</p>
            </div>
            <div class="tab-pane" id="LogCollectTab">
                <p>Howdy, I'm in Section 2.</p>
            </div>
            <div class="tab-pane" id="OperateLogTab">
                <p>Howdy, I'm in Section 2.</p>
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
