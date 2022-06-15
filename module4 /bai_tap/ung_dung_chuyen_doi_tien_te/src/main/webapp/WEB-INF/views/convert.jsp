<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/15
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/core" method="get">
    <fieldset>
        <legend>convert
        </legend>
        <table>
            <tr>
                <td>VND</td>
                <td>
                    <input type="text" name="vnd" value="${vnd}">
                </td>
            </tr>
            <tr>
                <td>USD</td>
                <td>
                    <input type="text"name="usd" value="${usd}" >
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <button>Convert</button>
                </td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
