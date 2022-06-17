<%@page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Email Validation</title>
</head>
<body>

<h1>Email Validate</h1>
<h3 style="color:red">${message}</h3>

<form action="/save" method="get">
<fieldset>
  <legend><h1>Sandwich Condiments</h1></legend>
<input type="checkbox"value="Lettuce">
<input type="checkbox"value="Tomato">
<input type="checkbox"value="Mustard">
<input type="checkbox"value="Sprouts">
</fieldset>
</form>

</body>
</html>