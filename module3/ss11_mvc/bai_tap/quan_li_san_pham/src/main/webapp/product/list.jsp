<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/01
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<title>Product List</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/Product?action=create"><button>Create new product</button></a>
</p>
<table border="1"width="40%">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Prince</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="p">
        <tr>
            <td>${p.getId()}</td>
            <td><a href="/Product?action=view&id=${p.getId()}">${p.getName()}</a></td>
            <td>${p.getPrince()}</td>
            <td><a href="/Product?action=edit&id=${p.getId()}">edit</a></td>
            <td><a href="/Product?action=delete&id=${p.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
