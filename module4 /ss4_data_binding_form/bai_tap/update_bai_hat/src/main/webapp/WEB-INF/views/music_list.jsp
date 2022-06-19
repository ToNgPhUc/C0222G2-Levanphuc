<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/18
  Time: 22:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form method="post" action="save" modelAttribute="music">
    <table>
        <tr>
            <td><form:label path="nameMusic">nameMusic</form:label></td>
            <td><form:input path="nameMusic"/></td>
        </tr>
        <tr>
            <td><form:label path="singer">singer</form:label></td>
            <td><form:input path="singer"/></td>
        </tr>
        <tr>
            <td><form:label path="kindOfMusic">kindOfMusic</form:label></td>
            <td>
                <form:select path="kindOfMusic">
                    <form:option value="pop">pop</form:option>
                    <form:option value="Rock">Rock</form:option>
                    <form:option value="Jazz">Jazz</form:option>
                    <form:option value="hip hop">hip hop</form:option>
                </form:select>
            </td>
        </tr>
        <tr>
            <td><form:label path="filePath">filePath</form:label></td>
            <td>
                <form:select path="filePath">
                    <form:option value="https://www.youtube.com/watch?v=xypzmu5mMPY">link bài hát </form:option>
                    <form:option value="https://www.youtube.com/watch?v=FN7ALfpGxiI">link bài hát</form:option>
                    <form:option value="https://www.youtube.com/watch?v=Llw9Q6akRo4">link bài hát</form:option>
                    <form:option value="https://www.youtube.com/watch?v=knW7-x7Y7RE">link bài hát</form:option>
                </form:select>
            </td>

        </tr>

        <tr>
            <td><input type="submit" value="update">
            </td>
            <td><a href="/form">cancle</a></td>
        </tr>
    </table>
</form:form>
</body>
</html>
