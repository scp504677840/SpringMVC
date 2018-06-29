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
<form action="${pageContext.request.contextPath}/testModelAttribute" method="post">
    <input type="hidden" name="id" value="1">
    昵称：<input type="text" name="name" value="Jack"><br>
    <button type="submit">修改</button>
</form>
</body>
</html>
