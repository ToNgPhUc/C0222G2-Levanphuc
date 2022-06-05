<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/03
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset>
    <form method="post"action="/User?action=delete">
        <legend> DELETE User</legend>

        <table>
            <tr>
                <td>ID</td>
                <td> <input type="text"name="id" value="${id}"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td> <input type="text"name="name"value="${name}"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td> <input type="text"name="email"value="${email}"></td>
            </tr>
            <tr>
                <td>Country</td>
                <td> <input type="text"name="country"value="${country}"></td>
            </tr>
            <tr>
                <td><h3> bạn có đồng ý xóa không</h3></td>
                <td></td>
            </tr>
            <tr>
                <td><button type="submit">DELETE</button></td>
                <td><a href="/User"><button type="button"> NO DELElE</button></a></td>
            </tr>
            <tr>
                <td><a href="/User"><button type="button"> BACK TO USER LIST</button></a></td>
            </tr>
        </table>
    </form>

</fieldset>
</body>
</html>
