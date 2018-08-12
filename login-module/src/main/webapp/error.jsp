<%--
  Created by IntelliJ IDEA.
  User: 15129
  Date: 2018/8/2
  Time: 11:36
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>错误页面</title>
    <link href="vendors/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="vendors/nprogress/nprogress.css" rel="stylesheet">
    <link href="module/css/custom.min.css" rel="stylesheet">
</head>

<body class="nav-md">
    <div class="container body">
        <div class="main_container">
            <!-- page content -->
            <div class="col-md-12">
                <div class="col-middle">
                    <div class="text-center text-center">
                        <h1 class="error-number">400</h1>
                        <h2>操作失败</h2>
                        <p>请检查相关操作是否正确! &nbsp&nbsp&nbsp&nbsp&nbsp   <a href="#">点击回到登陆界面</a>
                        </p>
                        <div class="mid_center">
                            <h3>Search</h3>
                            <form>
                                <div class="col-xs-12 form-group pull-right top_search">
                                    <div class="input-group">
                                        <input type="text" class="form-control" placeholder="Search for...">
                                        <span class="input-group-btn">
                                  <button class="btn btn-default" type="button">Go!</button>
                              </span>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /page content -->
        </div>
    </div>

    <script src="vendors/jquery/jquery.min.js"></script>
    <script src="vendors/bootstrap/js/bootstrap.min.js"></script>
    <script src="vendors/fastclick/lib/fastclick.js"></script>
    <script src="vendors/nprogress/nprogress.js"></script>
    <script src="module/js/custom.min.js"></script>
</body>
</html>

