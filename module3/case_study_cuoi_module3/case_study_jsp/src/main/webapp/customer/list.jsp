<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/04
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/Customer?action=create"><button type="submit">CREATE</button></a>
<h1> customer list</h1>

<table border="1">
    <tr>
        <th>Id</th>
        <th>Type</th>
        <th>Name</th>
        <th>Birthday</th>
        <th>Gender</th>
        <th>IdCard</th>
        <th>Phone</th>
        <th>Email</th>
        <th>Address</th>
        <th>Status</th>
        <th>EDIT</th>
        <th>DELETE</th>
    </tr>
    <c:forEach items="${customerList}" var="customer">
        <tr>
            <td>${customer.customerId}</td>
            <td>${customer.customerTypeId}</td>
            <td>${customer.customerName}</td>
            <td>${customer.customerBirthday}</td>
            <td>${customer.customerGender}</td>
            <td>${customer.customerIdCard}</td>
            <td>${customer.customerPhone}</td>
            <td>${customer.customerEmail}</td>
            <td>${customer.customerAddress}</td>
            <td>${customer.status}</td>

            <td><a href="/Customer?action=edit&customerId=${customer.customerId}">Edit</a></td>
            <td><a href="/Customer?action=delete&customerId=${customer.customerId}">Delete</a></td>
        </tr>
    </c:forEach>

</table>
</body>
</html>
