<%--
  Created by IntelliJ IDEA.
  User: office
  Date: 2020-4-27
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>首页</title>
    <link rel="stylesheet" href="../static/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>
    <script src="../static/bootstrap-3.3.7-dist/js/jquery-3.3.1.min.js"></script>
    <script src="../static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <table class="table table-hover table-striped">
        <thead>
        <tr>
            <th>id</th>
            <th>username</th>
            <th>email</th>
            <th>gender</th>
            <th>deptId</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${persons}" var="person">
            <tr>
                <td>${person.id}</td>
                <td>${person.username}</td>
                <td>${person.email}</td>
                <td>${person.gender}</td>
                <td>${person.deptId}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
