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
<h1>update student</h1>

<p>
    <a href="Student">Back to listStudent </a>

</p>
<form method="post"action="Student?action=update">
    <fieldset>
        <legend>Student information</legend>
        <table>
            <tr>
                <td>code Student: </td>
                <td><input type="text" name="codeStudent" id="codeStudent" value="${requestScope["student"].getCodeStudent()}"></td>
            </tr>
            <tr>
                <td>name student: </td>
                <td><input type="text" name="nameStudent" id="nameStudent" value="${requestScope["student"].getNameStudent()}"></td>
            </tr>
            <tr>
                <td>point: </td>
                <td><input type="text" name="point" id="point" value="${requestScope["student"].getPoint()}"></td>
            </tr>
            <tr>
                <td>gender: </td>
                <td><input type="text" name="gender" id="gender" value="${requestScope["student"].getGender()}"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Update Student"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
