<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html>
    <head>
        <!-- head -->
        <%@include file="/WEB-INF/jsp/include/head.jspf"  %>

    </head>
    <body>
        <div id="layout">
            <!-- Menu toggle -->
            <%@include file="/WEB-INF/jsp/include/toggle.jspf"  %>

            <!-- Menu -->
            <%@include file="/WEB-INF/jsp/include/menu.jspf"  %>

            <div id="main">
                <div class="header">
                    <h1>Watch</h1>
                    <h2>我的觀察股 watch_id=${sessionScope.watch_id}</h2>
                </div>
            </div>
        </div>
        <!-- Foot -->
        <%@include file="/WEB-INF/jsp/include/foot.jspf"  %>   
    </body>
</html>
