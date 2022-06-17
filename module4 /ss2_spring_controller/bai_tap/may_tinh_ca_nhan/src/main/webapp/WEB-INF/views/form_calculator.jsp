<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/17
  Time: 11:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/save" method="post">
    <fieldset>
        <legend> Calculator</legend>
        <input type="text" name="a">
        <input type="text" name="b">

        <button value="+" name="operation">
            Addition(+)
        </button>
        <button value="-" name="operation">
            Subtraction(-)
        </button>
        <button value="*" name="operation">
            Multiplication(*)
        </button>
        <button value="/" name="operation">
            Division(/)
        </button>
        <h1>Result: ${calculator}</h1>
    </fieldset>
</form>
</body>
</html>
