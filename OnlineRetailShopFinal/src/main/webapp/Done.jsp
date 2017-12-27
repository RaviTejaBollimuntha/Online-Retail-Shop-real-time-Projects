<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%session.removeAttribute("cart"); %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css">
        <style>
            body {background-image:url('images/1.jpg');
                    background-repeat: no-repeat;
                    background-size: cover;
            }
            ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}

li {
    float: left;
}

li a {
    display: block;
    color: white;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #111;
}
        </style>
        <title>Online Star Retail Store</title>
    </head>
    <body>
     <ul>
  <li><a href="index.html">Home</a></li>
  <li><a href="Products.jsp">Product</a></li>
  <li style="float:right"><a href="signout.jsp">SignOut</a></li>
   <li style="float:right"><a href="viewCart.jsp">ViewCart</a></li>
  <li style="float:right"><a href="#contact">Contact</a></li>
  <li style="float:right"><a class="active" href="#about">About</a></li>
</ul>
        <div style="text-align: center;">
         <label> <h1>Online Star Retail Store</h1>
             <h3>India ki Retail</h3></label><br>
                 <label>Your Order will be arrived within 4-5 days..<br>Thank You...<br><br><a href="Products.jsp">Do You want to Continue Shopping..</a></label>
                  </div>
</body>
</html>