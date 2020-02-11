<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
        <!-- head -->
        <%@include file="/WEB-INF/jsp/include/head.jspf"  %>
        <script>
            var watch_id = ${sessionScope.watch_id};
            
            $(document).ready(function () {
                watchList();
            });
            
            function watchList() {
                $.get("/SpringMVC/mvc/portfolio/watch/" + watch_id, function (data, status) {
                    console.log(JSON.stringify(data));
                    // 請撰寫
                    
                });
            }
        </script>
    </head>
    <body>
        <div id="layout">
            <!-- Menu toggle -->
            <%@include file="/WEB-INF/jsp/include/toggle.jspf"  %>

            <!-- Menu -->
            <%@include file="/WEB-INF/jsp/include/menu.jspf"  %>

            <div id="main">
                <div class="header">
                    <h1>Watch List</h1>
                    <h2 id="head2">Watch List</h2>
                </div>

                <table id="myTable" class="pure-table pure-table-bordered" width="100%">
                    <thead>
                        <tr>
                            <th>分類</th><th>名稱</th><th>代號</th>
                            <th>作收</th><th>報價</th><th>漲跌</th>
                            <th>漲跌幅%</th><th>交易量</th><th>交易時間</th>
                            <th>刪除</th>
                        </tr>
                    </thead>
                    <tbody>
                            
                    </tbody>
                </table>
            </div>
        </div>
        <!-- Foot -->
        <%@include file="/WEB-INF/jsp/include/foot.jspf"  %>

    </body>
</html>
