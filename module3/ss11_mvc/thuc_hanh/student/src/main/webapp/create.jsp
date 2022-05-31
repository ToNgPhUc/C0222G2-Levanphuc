<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/05/31
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="Student?action=create">
    <label>code student</label>
    <input type="text" name="codeStudent"><br>

    <label>name student</label>
    <input type="text" name="nameStudent"><br>

    <label>point</label>
    <input type="text" name="point"><br>

    <label>gender</label>
    <input type="text" name="gender"><br>

    <input type="submit"value="them moi">

</form>
</body>
</html>
