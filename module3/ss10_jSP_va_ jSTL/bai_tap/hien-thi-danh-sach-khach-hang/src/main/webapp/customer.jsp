<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/05/31
  Time: 0:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1" >
    <thead>Danh sách khách hàng</thead>
    <tr>
        <th>Name Customer</th>
        <th>Date</th>
        <th>Address</th>
        <th>Picture</th>
    </tr>
    <c:forEach var="temp" items="${listCustomer}">
        <tr>
            <td>${temp.name}</td>
            <td>${temp.date}</td>
            <td>${temp.address}</td>
            <td>
                <img src="${temp.picture}" width="50" alt="">
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
