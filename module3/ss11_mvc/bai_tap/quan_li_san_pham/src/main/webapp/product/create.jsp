<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/02
  Time: 0:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post"action="/Product?action=create">
    <fieldset>
<legend>ADD NEW PRODUCT</legend>
        <table>
            <tr>
                <td>ID</td>
                <td><input type="text"name="id"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text"name="name"></td>
            </tr>
            <tr>
                <td>Prince</td>
                <td><input type="text"name="prince"></td>
            </tr>
            <tr>
                <input type="submit"value="create products">
                <a href="/Product"><button type="button"> back to product list</button></a>
            </tr>
        </table>
    </fieldset>

</form>
</body>
</html>
