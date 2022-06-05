<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/04
  Time: 20:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset>
    <form method="post"action="/Customer?action=create">

        <table>
            <legend>ADD NEW CUSTOMER</legend>
            <tr>
                <td>Id</td>
                <td><input type="text"name="customer_id"hidden></td>
            </tr>
            <tr>
                <td>Type Id</td>
                <td> <input type="text"name="customer_type_id"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text"name="customer_name"></td>
            </tr>
            <tr>
                <td> Birthday</td>
                <td> <input type="text"name="customer_birthday"></td>
            </tr>
            <tr>
                <td>Gender</td>
                <td> <input type="text"name="customer_gender"></td>
            </tr>
            <tr>
                <td>Id Card</td>
                <td><input type="text"name="customer_id_card"></td>
            </tr>
            <tr>
                <td>Phone Number</td>
                <td> <input type="text"name="customer_phone"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text"name="customer_email"></td>
            </tr>
            <tr>
                <td>Address</td>
                <td><input type="text"name="customer_address"></td>
            </tr>
            <tr>
                <td>status</td>
                <td><input type="text"name="status"></td>
            </tr>

            <tr>
                <td><input type="submit"></td>
                <td><a href="/Customer"><input type="button"value="BACK TO CUSTOMER LIST"></a></td>
            </tr>

        </table>
    </form>

</fieldset>

</body>
</html>
