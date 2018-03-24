<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html; charset=UTF-8"%>
<link href="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.css" rel="stylesheet">
<link href="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/css/bootstrap-datetimepicker.min.css" rel="stylesheet">
<script src="https://cdn.bootcss.com/bootstrap-datetimepicker/4.17.47/js/bootstrap-datetimepicker.min.js"></script>

<div class="container">
    <div class="jumbotron text-center">
        <h1>Add Contract</h1>
    </div>
    <hr>
    <div class="container">
        <spring:form method="post" commandName="person" action="/add/user">
            <div class="form-group row">
                <label for="personName" class="col-sm-2 col-form-label">Name</label>
                <div class="col-sm-10">
                    <spring:input path="personName" type="text" class="form-control" placeholder="Name"/>
                </div>
            </div>
            <div class="form-group row">
                <label for="personBirthday" class="col-sm-2 col-form-label">Birthday</label>
                <div class="col-sm-10">
                    <spring:input path="personBirthday" type='date' class="form-control" />
                </div>
            </div>
            <div class="form-group row">
                <label for="personTelephone" class="col-sm-2 col-form-label">Telephone</label>
                <div class="col-sm-10">
                    <spring:input path="personTelephone" type="text" class="form-control" placeholder="Telephone"/>
                </div>
            </div>
            <div class="form-group row">
                <label for="personInfo" class="col-sm-2 col-form-label">Information</label>
                <div class="col-sm-10">
                    <spring:input path="personInfo" type="text" class="form-control" placeholder="Information"/>
                </div>
            </div>
            <div class="form-group row">
                <label for="personInfo" class="col-sm-2 col-form-label">Information</label>
                <div class="col-sm-10">
                    <spring:select path="kind" type="text" class="form-control" placeholder="Information">
                        <c:forEach items="${kindList}" var="kind">
                            <option value="${kind.kindId}">${kind.kindName}</option>
                        </c:forEach>
                    </spring:select>
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-10">
                    <button type="submit" class="btn btn-primary">Add User</button>
                </div>
            </div>
        </spring:form>
    </div>
    <hr>

</div>
