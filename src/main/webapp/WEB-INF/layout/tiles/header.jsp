<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html; charset=UTF-8"%>

<div class="navbar navbar-expand-md navbar-dark bg-dark flow-top">
    <div class="container">
        <div class="nav-header">
            <a class="navbar-brand" href="">AddressBook</a>
        </div>
        <div class="collapse navbar-collapse">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item"><a class="nav-link" href="<c:url value="/"/>">About</a></li>
                <li class="nav-item"><a class="nav-link" href="<c:url value="/user/"/>">User</a> </li>
                <li class="nav-item"><a class="nav-link" href="">Kind</a> </li>
                <li class="nav-item"><a class="nav-link" href="<c:url value="/add/"/>">Add</a> </li>
            </ul>
            <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
            </form>
        </div>
    </div>
</div>
