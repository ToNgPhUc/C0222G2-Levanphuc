<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022/06/04
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <style>
        .container-fluid {

        }

        #hear {
            height: 100px;
            background: skyblue;
            color: darkred;
        }

        #nav {
            background: burlywood;
            color: brown;
        }

        #left {
            width: 30%;
            height: 100%;
            border: 1px solid black;
            float: left;
            background: url("https://thieuhoa.com.vn/wp-content/uploads/2022/03/wU2ZkMOUPAI65uRVtlQSydZfRVOvKmJrcqTHIdVj.jpg") center/cover no-repeat;
        }

        #right {
            width: 70%;
            height: 100%;
            border: 1px solid black;
            float: left;
            background: url("https://anhdep123.com/wp-content/uploads/2020/05/h%C3%ACnh-bi%E1%BB%83n-%C4%91%E1%BA%B9p.jpg");

        }
        .center{
            border: 1px solid black;
            background: lightsalmon;
            text-align: center;
        }
    </style>

</head>
<body>
<div class="container-fluid" style="width: 100%">
    <div id="hear">
        <h1 style="text-align: center">chào mừng đến với khu nghĩ dưỡng furama resort</h1>
    </div>

    <nav id="nav" class="navbar navbar-light">
        <div class="container-fluid">
            <a href="http://localhost:8080/" class="navbar-brand">Home</a>
            <a href="http://localhost:8080/Employee" class="navbar-brand">Employee</a>
            <a href="http://localhost:8080/Customer" class="navbar-brand">Customer</a>
            <a href="#" class="navbar-brand">Service</a>
            <a href="#" class="navbar-brand">Contract</a>

            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success" type="submit">Search</button>
            </form>

        </div>
    </nav>


    <div style="height: 600px">
        <div id="left">
            <div><a href="#">item one</a></div>
            <div><a href="#">item two</a></div>
            <div><a href="#">item three</a></div>
        </div>

        <div id="right">

        </div>
    </div>
    <div class="center">
    <p>HotLine : 0911463781</p>
    </div>
</div>
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
