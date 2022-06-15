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
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        input {
            width: 100%;
            height: 50px;
            background: palegoldenrod;
            color: hotpink;

        }

        label {
            color: brown;
        }

        select {
            width: 100%;
            height: 50px;
            background: palegoldenrod;
            color: hotpink;
        }

        #menu {
            background: skyblue;
        }

    </style>
</head>
<body>

<div id="menu" class="container mt-3">
    <h2 style="text-align: center"> ADD NEW EMPLOYEE</h2>

    <form method="post">
        <div class="mb-3 mt-3">
            <label>Name:</label>
            <input type="text" name="employee_name">
            <div class="text-black text-center bg-warning">${errMap.errEmployeeName}</div>


        </div>
        <div class="mb-3">
            <label>Birthday:</label>
            <input type="date" name="employee_birthday">
            <div class="text-black text-center bg-warning">${errMap.errEmployeeBirthday}</div>

        </div>
        <div class="mb-3">
            <label>ID Card:</label>
            <input type="text" name="employee_id_card">
            <div class="text-black text-center bg-warning"> ${errMap.errEmployeeIdCard}</div>

        </div>
        <div class="mb-3">
            <label>Salary:</label>
            <input type="text" name="employee_salary">
            <div class="text-black text-center bg-warning"> ${errMap.errEmployeeSalary}</div>

        </div>
        <div class="mb-3">
            <label>Phone Number:</label>
            <input type="text" name="employee_phone">
            <div class="text-black text-center bg-warning">${errMap.errEmployeePhone}</div>

        </div>
        <div class="mb-3">
            <label>Email:</label>
            <input type="text" name="employee_email">
            <div class="text-black text-center bg-warning">${errMap.errEmployeeEmail}</div>

        </div>
        <div class="mb-3">
            <label>Address:</label>
            <input type="text" name="employee_address">
            <div class="text-black text-center bg-warning">${errMap.errEmployeeAddress}</div>

        </div>
        <div class="mb-3">
            <label>Position:</label>
            <select name="position_id">
                <option value="1">lễ tân</option>
                <option value="2">phục vụ</option>
                <option value="3">chuyên viên</option>
                <option value="4">quản lí </option>
                <option value="5">giám đốc</option>

            </select>

        </div>
        <div class="mb-3">
            <label>education:</label>
            <select name="education_degree_id">
                <option value="1">trung cấp </option>
                <option value="2">cao đẳng</option>
                <option value="3">đại học</option>
                <option value="4">sau đại học </option>

            </select>

        </div>
        <div class="mb-3">
            <label>division:</label>
            <select name="division_id">
                <option value="1">Sale – Marketing </option>
                <option value="2">Hành Chính</option>
                <option value="3">phục vụ</option>
                <option value="4">quản lí </option>
            </select>

        </div>

        <div class="mb-3">
            <input type="submit" value="submit">
            <a href="/Employee"><input type="button" value="BACK TO CUSTOMER LIST"></a>
        </div>
    </form>
</div>
</body>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>

