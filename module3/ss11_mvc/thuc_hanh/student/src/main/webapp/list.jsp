<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/05/31
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="Student?action=create"> <button>create student</button></a><br>
<table border="1">
    <tr>
        <th>Code Student</th>
        <th> Name Student</th>
        <th> Point</th>
        <th> Gender</th>
    </tr>

    <c:forEach var="temp" items="${listStudent}">
<tr>
    <td>${temp.codeStudent}</td>
    <td>${temp.nameStudent}</td>
    <td>${temp.point}</td>
    <td>${temp.gender}</td>
</tr>
    </c:forEach>
</table>
</body>
</html>
