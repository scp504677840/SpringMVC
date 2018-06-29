<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: scp
  Date: 2018/6/29
  Time: 下午4:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/addUser" method="post">
    用户名：<input type="text" name="name"><br>
    密码：<input type="password" name="password"><br>
    城市：<input type="text" name="address.city"><br>
    街道：<input type="text" name="address.street"><br>
    <button type="submit">添加</button>
</form>

</body>
</html>
