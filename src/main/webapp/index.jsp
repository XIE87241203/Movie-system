<%@ page contentType="text/html; charset=utf-8" %>
<html>

<head>
    <meta charset="UTF-8">
    <title>test</title>
</head>
<body>
<form id="form" action="login()${pageContext.request.contextPath}/api/user/login.do" method="post">
    email：<input id="userName" name="userName" type="text" title=""><br>
    密码： <input id="password" name="password" type="password" title=""><br>
    <input type="submit" value="登录">
</form>
</body>
</html>
