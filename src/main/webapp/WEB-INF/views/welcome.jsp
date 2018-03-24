<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=UTF-8"%>

<div class="container">
    <div class="jumbotron text-center">
        <h1>Welcome</h1>
    </div>
</div>

<div class="container">
    <table class="table table-striped">
        <caption>User List</caption>
        <thead class="table-dark">
        <tr>
            <th scope="col">#</th>
            <th scope="col">Name</th>
            <th scope="col">Phone</th>
            <th scope="col">Info</th>
        </tr>
        </thead>
        <tbody class="table-hover">
        <c:forEach var="user" items="${users}">
            <tr>
                <th scope="row">${user.personId}</th>
                <td>${user.personName}</td>
                <td>${user.personTelephone}</td>
                <td>${user.personInfo}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
