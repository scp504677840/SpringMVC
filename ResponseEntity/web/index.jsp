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
<a href="${pageContext.request.contextPath}/users">员工列表</a>
<br>
<br>
<br>

<form action="${pageContext.request.contextPath}/upload" method="post" enctype="multipart/form-data">
    <label>
        File:
        <input type="file" name="file">
    </label><br>
    <label>
        Desc:
        <input type="text" name="desc">
    </label><br>
    <button type="submit">Submit</button>
</form>

<br>
<br>
<br>

<a href="${pageContext.request.contextPath}/download">简易版下载</a>

<br>
<br>
<br>
</body>
</html>
