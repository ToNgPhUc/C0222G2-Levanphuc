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
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
    input{
        width: 100%;
        height: 50px;
        background: palegoldenrod;
        color: hotpink;

    }
    label{
        color: brown;
    }
    select{
        width: 100%;
        height: 50px;
        background: palegoldenrod;
        color: hotpink;
    }
    #menu{
        background: skyblue;
    }

</style>
</head>
<body>

        <div id="menu" class="container mt-3">
            <h2 style="text-align: center"> ADD NEW CUSTOMER</h2>

            <form method="post">
                <div class="mb-3 mt-3">
                    <label>Type Id:</label>
                    <select name="customer_type_id">
                        <option value="1">Diamond</option>
                        <option value="2">Platinium</option>
                        <option value="3">Gold</option>
                        <option value="4">Silver</option>
                        <option value="5">Member</option>
                    </select>

                </div>
                <div class="mb-3">
                    <label>Name:</label>
                    <input type="text"name="customer_name">
                </div>
                <div class="mb-3">
                    <label>Birthday:</label>
                    <input type="date"name="customer_birthday">
                </div>
                <div class="mb-3">
                    <label>Gender:</label>
                    <select name="customer_gender">
                        <option value="0">nữ</option>
                        <option value="1">nam</option>

                    </select>
                </div>
                <div class="mb-3">
                    <label>Id Card:</label>
                    <input type="text"name="customer_id_card">
                </div>
                <div class="mb-3">
                    <label>Phone Number:</label>
                    <input type="text"name="customer_phone">
                </div>
                <div class="mb-3">
                    <label>Email:</label>
                    <input type="text"name="customer_email">
                </div>
                <div class="mb-3">
                    <label>Address:</label>
                    <input type="text"name="customer_address">
                </div>

                <div class="mb-3">
                    <input type="submit" value="submit">
                    <a href="/Customer"><input type="button"value="BACK TO CUSTOMER LIST"></a>
                </div>
            </form>
        </div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</html>
