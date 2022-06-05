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
            background: white;
        }
        #hear{
            background: burlywood;
            color: brown;
        }
        #nav{
            background: burlywood;
            color: brown;
        }

     #left{
         width: 30%;
         height: 100%;
         border: 1px solid black;
         float: left;

     }
     #right{
         width: 70%;
         height: 100%;
         border: 1px solid black;
         float: left;
     }
    </style>

</head>
<body>
<div class="container-fluid" style="width: 100%">
    <div id="hear">
        <h1 style="text-align: center">furama_resort</h1>
    </div>

        <nav id="nav" class="navbar navbar-light">
            <div class="container-fluid">
                <a href="#" class="navbar-brand">Home</a>
                <a href="#" class="navbar-brand">Employee</a>
                <a href="#" class="navbar-brand">Customer</a>
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
            <div> <a href="#">item one</a></div>
            <div> <a href="#">item two</a></div>
            <div> <a href="#">item three</a></div>

        </div>
        <div id="right">
            <p>cái quần què gì cũng được</p>
        </div>
    </div>
    <div style="border: 1px solid black"><p>footer</p></div>
</div>
</body>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</html>
