<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/02
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/User?action=create"><button type="submit">CREATE</button></a>
<h1> user list</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>NAME</th>
        <th>EMAIL</th>
        <th>COUNTRY</th>
        <th>EDIT</th>
        <th>DELETE</th>
    </tr>
 <c:forEach items="${userList}" var="user">
     <tr>
         <td>${user.getId()}</td>
         <td>${user.getName()}</td>
         <td>${user.getEmail()}</td>
         <td>${user.getCountry()}</td>
         <td><a href="/User?action=edit&id=${user.getId()}">Edit</a></td>
         <td><a href="/User?action=delete&id=${user.getId()}">Delete</a></td>
     </tr>
 </c:forEach>

</table>



<%--<h1> user list</h1>--%>
<%--<a href="/User?action=create"> add new user</a>--%>
<%--<table border="1">--%>
<%--    <tr>--%>
<%--        <th>ID</th>--%>
<%--        <th>Name</th>--%>
<%--        <th>Email</th>--%>
<%--        <th>Country</th>--%>
<%--        <th>Edit</th>--%>
<%--        <th>Delete</th>--%>
<%--    </tr>--%>

<%--        <c:forEach items="${userList}" var="user">--%>
<%--    <tr>--%>
<%--            <td>${user.getId()}</td>--%>
<%--            <td>${user.getName()}</td>--%>
<%--            <td>${user.getEmail()}</td>--%>
<%--            <td>${user.getCountry()}</td>--%>
<%--            <td><a href="/User?action=edit&id=${user.getId()}"> edit</a></td>--%>
<%--            <td><a href="/User?action=delete&id=${user.getId()}">delete</a></td>--%>
<%--    </tr>--%>
<%--        </c:forEach>--%>

<%--</table>--%>
</body>
</html>
