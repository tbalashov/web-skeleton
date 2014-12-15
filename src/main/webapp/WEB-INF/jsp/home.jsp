<%--@elvariable id="user" type="tb.entity.User"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<%--todo: use jstl in href--%>
Hello, ${user.login}! You are logged in! Now you may <a href="${pageContext.request.contextPath}/do/logout">log out</a>.
</body>
</html>
