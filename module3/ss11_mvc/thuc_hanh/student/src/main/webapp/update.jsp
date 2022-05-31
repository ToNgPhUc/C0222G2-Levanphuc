<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/05/31
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1> update student</h1>

    <form method="post" action="Student?action=update">

        <label>code student</label>
        <input type="text" name="codeStudent" value="${codeStudent}">

        <label>name student</label>
        <input type="text" name="nameStudent" value="${nameStudent}"><br>

        <label>point</label>
        <input type="text" name="point"value="${point}"><br>

        <label>gender</label>
        <input type="text" name="gender"value="${gender}"><br>

        <input type="submit"value="update">

    </form>
</body>
</html>
