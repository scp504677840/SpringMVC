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
<a href="${pageContext.request.contextPath}/mvc/helloworld">HelloWorld</a>
<br>
<a href="${pageContext.request.contextPath}/mvc/poetMethod">Method</a>
<br>
<form action="${pageContext.request.contextPath}/mvc/poetMethod" method="post">
    <button type="submit">Submit</button>
</form>
<br>
</body>
</html>
