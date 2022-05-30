<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/05/30
  Time: 11:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="ChuyenDoiTienCss.css">
</head>
<body>
<h2>Currency Converter</h2>
<form method="post"action="/Convert">
    <label>
        Rate:
    </label><br>
    <input type="text" name="rate"placeholder="RATE"value="22000"><br>
    <label>USD: </label><br/>
    <input type="text" name="usd"placeholder="USD"value="0"><br>
    <input type="submit"id="submit"value="Converter">
</form>

</body>
</html>
