<%-- 
    Document   : Register
    Created on : May 30, 2017, 2:29:38 PM
    Author     : N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Online Star Medical Store</title>
        <link rel="stylesheet" href="styles.css">
        <meta name="viewport" content="width=device-width">
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
            
            table {
                top:8%;
               right:35%;
                position:absolute;
            }

        </style>
    </head>
    <body>
      <ul>
  <li><a href="index.html">Home</a></li>
  <li><a href="Products.jsp">Product</a></li>
  <li><a href="#contact">Contact</a></li>
  <li style="float:right"><a class="active" href="#about">About</a></li>
</ul>
      <form method="post" action="./reg">
        <table align="center">
            
            <tr><td><label><h3>Registration</h3></label></td></tr>
            <tr><td><label>User Name   </label> <br><input type="text" name='nm'></td></tr>
            <tr><td><label>Mobile   </label> <br><input type="text"name='mb'></td></tr>
            <tr><td><label>Email   </label> <br><input type="text" name='em'></td></tr>
            <tr><td><label>Password  </label> <br><input type="password" name='ps'></td></tr>
            
            
            <tr><td><label><h3>Delivery Information</h3></label></td></tr>
            <tr><td><label>Address  </label><br><input type="text" name='add'></td></tr>
            <tr><td><label>City </label> <br><input type="text" name='ct'></td></tr>
            <tr><td><label>State  </label> <br><select name='cnt'>
                            <option value="Andhrapradesh">Andhrapradesh</option>
                            <option value="Goa">Goa</option>
                            <option value="Madhyapradesh">Madhyapradesh</option>
                            <option value="Maharashtra">Maharashtra</option>
                            <option value="tamilnadu">tamilnadu</option>
                        </select></td></tr>
            <tr><td><label>Pincode  </label> <br><input type="text" name='pc'></td></tr>
            <tr><td><button type="submit">Register</button></td></tr>
            
        </table>
        </form>
    </body>
</html>
