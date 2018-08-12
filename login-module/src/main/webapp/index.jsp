<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
    <title>登陆</title>
    <link rel="stylesheet" href="vendors/bootstrap/css/bootstrap.min.css" >
    <link href="module/css/index.css" rel="stylesheet">
</head>
<body class="text-center">

    <form class="form-signin"  method="POST" action="user/login">
        <h1 class="h3 mb-3 font-weight-normal">Visitor Sign In</h1>
        <label for="inputAccount" class="sr-only">Account</label>
        <input type="text" id="inputAccount" name="accountId" class="form-control" placeholder="Account" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" name="password" class="form-control" placeholder="Password" required>
        <input type="submit" id="submit" class="btn btn-lg btn-primary btn-block" onclick="return check()" /> <br />
        <p class="mt-5 mb-3 text-muted">合伙人培训部周作业</p>
        <p class="mt-5 mb-3 text-muted">&copy; 2018-2019</p>
    </form>

    <script type="text/javascript" src="vendors/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="module/js/common/common.js"></script>
    <script type="text/javascript" src="module/js/index.js"></script>
    <script type="text/javascript">
        function check() {
            var account = $("#inputAccount").val();
            var password = $("#inputPassword").val();
            var loginResult = loginCheck(account, password);
            if(loginResult === true) {
                return true;
            }
            alert("账号或密码不允许为空！");
            return false;
        };
    </script>
</body>
</html>