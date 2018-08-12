<%--
  Created by IntelliJ IDEA.
  User: 15129
  Date: 2018/8/3
  Time: 23:19
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
    <link rel="stylesheet" href="vendors/bootstrap/css/bootstrap.css" />
    <link rel="stylesheet" href="vendors/bootstrap-table/css/bootstrap-table.min.css" />
    <link rel="stylesheet" href="module/css/common/common.css" />
</head>
<body>
    <div class="container">
        <div class="row">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    用户列表
                </div>
                <div class="panel-body">

                </div>
                <table id="userTable" class="table table-striped table-hover"></table>
            </div>
        </div>
    </div>

    <script type="text/javascript" src="vendors/jquery/jquery.min.js"></script>
    <script type="text/javascript" src="vendors/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="vendors/bootstrap-table/js/bootstrap-table.min.js"></script>
    <script type="text/javascript" src="vendors/bootstrap-table/js/bootstrap-table-zh-CN.min.js"></script>
    <script type="text/javascript" src="module/js/common/common.js"></script>
    <script type="text/javascript">

        var NewsTable = {
            init: function(url, queryParams) {
                $("#userTable").bootstrapTable("destroy");
                $("#userTable").bootstrapTable({
                    url: url,
                    method: "post",
                    contentType:"application/x-www-form-urlencoded",
                    dataType: "json",
                    cache: false, // 不缓存
                    striped: true, // 隔行加亮
                    height: 300,
                    sortable: true,
                    sortName: 'userId', // 设置默认排序为 name
                    sortOrder: "asc",
                    uniqueId: "userId", //每一行的唯一标识，一般为主键列
                    pagination: true, // 开启分页功能
                    pageNumber: 1,
                    pageSize: 5,    //每页的记录行数（*）
                    pageList: [5, 10, 15, 20],
                    paginationPreText: "上一页",
                    paginationNextText: "下一页",
                    sidePagination: "server",
                    clickToSelect: true, // 单击行即可以选中
                    search: false, // 开启搜索功能
                    showColumns: false, // 开启自定义列显示功能
                    showRefresh: false, // 开启刷新功能
                    queryParamsType: "undefined",
                    queryParams: queryParams, //查询参数
                    columns: [{
                        field: 'userId',
                        title: '用户编号',
                        align: 'center',
                        valign: 'middle',
                    }, {
                        field: 'username',
                        title: '用户名称',
                        align: 'center',
                        valign: 'middle',
                    }, {
                        field: 'gender',
                        title: '性别',
                        align: 'center',
                        valign: 'middle',
                    }, {
                        field: 'address',
                        title: '地址',
                        align: 'center',
                        valign: 'middle',
                    }],
                    responseHandler: function (data) {
                        //后台传递的是字符串需要转json对象
                        var json = JSON.parse(data.pageContainer);
                        return json;
                    },
                    onLoadSuccess: function() {
                        console.log("加载成功.");
                    },
                    onLoadError: function(data) {
                        alert("加载失败, 刷新重试.");
                    }
                });
            }
        };

        $(function() {
            NewsTable.init("user/list", function(params) {
                //SpringMVC不支持对象明.属性
                return {
                    "pageSize": params.pageSize,
                    "currentPageNo": params.pageNumber - 1,
                };
            });
        });

    </script>
</body>
</html>
