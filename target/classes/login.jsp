<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script>
    function login () {
        var username = $("#username").val().trim();
        var password = $("#password").val().trim();
        var userInfo = {
            username:username, password:password
        }

        $.ajax({
            type: 'POST',
            url: '/doLogin',
            data: {userInfo: JSON.stringify(userInfo)},
            dataType: 'text',
            error: function () {
                window.alert("系统错误");
            },
            success: function (data) {
                if (data == "success"){
                    window.location.href = "../index";
                }else if(data == "fail"){
                    window.alert("账号密码错误");
                }
            }
        })
    }
</script>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form>
                <div class="form-group">
                    <label for="username">账号</label><input class="form-control" id="username" name="username"/>
                </div>
                <div class="form-group">
                    <label for="password">密码</label><input type="password" class="form-control" id="password" name="password"/>
                </div>
                <button type="button" onclick="login()" class="btn btn-default">登录</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>