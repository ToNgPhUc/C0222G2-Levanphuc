<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/02
  Time: 23:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset>
    <legend>user form</legend>
    <form method="post"action="/User?action=create">
        <table>
            <tr>
                <td>name</td>
                <td> <input type="text"name="name" ></td>
            </tr>
            <tr>
                <td>Email</td>
                <td> <input type="text"name="email"></td>
            </tr>
            <tr>
                <td>Country</td>
                <td> <input type="text"name="country"></td>
            </tr>
            <tr>
                <td><input type="submit"></td>
                <td><a href="/User"><button type="button"> back to User List</button></a></td>
            </tr>

        </table>
    </form>

</fieldset>
</body>
</html>
