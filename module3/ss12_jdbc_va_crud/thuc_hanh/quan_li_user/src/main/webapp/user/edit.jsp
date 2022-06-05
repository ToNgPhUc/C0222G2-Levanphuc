<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/03
  Time: 10:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
 <fieldset>

    <form method="post" action="/User?action=edit">
        <legend>EDIT USER</legend>
        <table>
            <tr>
                <td><input type="text" name="id" value="${id}" hidden></td>
            </tr>
            <tr>
                <td><input type="text" name="name" value="${name}"></td>
            </tr>
            <tr>
                <td><input type="text" name="email" value="${email}"></td>
            </tr>
            <tr>
                <td><input type="text" name="country" value="${country}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="edit user"></td>
                <td>
                    <a href="/User"><button type="button">back to user list</button></a>
                </td>
            </tr>
        </table>
    </form>
 </fieldset>
</body>
</html>
