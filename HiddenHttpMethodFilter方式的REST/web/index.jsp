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

<a href="${pageContext.request.contextPath}/user/1">获取用户</a>
<br>

<form action="${pageContext.request.contextPath}/user" method="post">
    <button type="submit">POST</button>
</form>
<br>

<form action="${pageContext.request.contextPath}/user/1" method="post">
    <input type="hidden" name="_method" value="PUT">
    <button type="submit">PUT</button>
</form>
<br>

<form action="${pageContext.request.contextPath}/user/1" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <button type="submit">DELETE</button>
</form>
<br>
</body>
</html>
