<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 王宝华
  Date: 2018/3/18
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>user</title>
</head>
<body>
    <ul>
        <c:forEach items="${users}" var="user">
            <ul>${user.personName}</ul>
            <ul>${user.personBirthday}</ul>
        </c:forEach>
    </ul>
</body>
</html>
