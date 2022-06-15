<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/15
  Time: 22:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/convert"method="get">
    <fieldset>
        <legend>dictionary</legend>
        <tr>
            <td><label>日本語</label></td>
            <td>
                <input type="text"name="日本語"value="${日本語}">
            </td>

        </tr>
        <tr>
            <td><label>Vietnames</label></td>
            <td>
                <input type="text"value="${vietnamese}">
            </td>

        </tr>

        <tr>
            <input type="submit"value="convert">
        </tr>

    </fieldset>
    <h4>${daMeDeSu}</h4>
</form>
</body>
</html>
