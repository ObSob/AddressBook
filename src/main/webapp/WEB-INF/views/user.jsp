<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8"%>

<div class="container">
    <div class="jumbotron text-center">
        <h1>User List</h1>
    </div>
</div>

<div class="container">
    <c:forEach var="kind" items="${kinds}">
        <table class="table table-striped">
            <caption>Kind: ${kind.kindName}</caption>
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
                <c:if test="${user.kind.kindId == kind.kindId}">
                    <tr>
                        <th scope="row">${user.personId}</th>
                        <td>${user.personName}</td>
                        <td>${user.personTelephone}</td>
                        <td>${user.personInfo}</td>
                    </tr>
                </c:if>
            </c:forEach>
            </tbody>
        </table>
    </c:forEach>
</div>
