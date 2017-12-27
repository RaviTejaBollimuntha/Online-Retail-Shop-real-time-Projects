<%-- 
    Document   : Home
    Created on : May 30, 2017, 2:13:03 PM
    Author     : N
--%>

<%@page import="javax.mail.Session"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
   <li style="float:right"><a href="viewCart.jsp">ViewCart</a></li>
  <li style="float:right"><a href="#contact">Contact</a></li>
  <li style="float:right"><a class="active" href="#about">About</a></li>
</ul>
    <div style="text-align:center">
        <label> <h1>Online Star Retail Store</h1>
            <h3>India ki Retail</h3></label>
        <table>
            <tr><td colspan="5" width="100%"><marquee behavior="scroll"><img src="images/11.jpg" name="" width="200px" height="175px"/>
                                                    <img src="images/12.jpg" width="200px" height="175px"/>
                                                    <img src="images/13.jpg" width="200px" height="175px"/>
                                                    <img src="images/14.jpg" width="200px" height="175px"/>
                                                    <img src="images/15.jpg" width="200px" height="175px"/></marquee></td></tr>
<tr><td colspan="5" bgcolor="#0066cc" width="100%" height="5px"></td>
<td bgcolor="#0066cc" width="100%" height="5px"></td></tr>
<tr><td colspan="4"><br><br></td></tr>
        <tr align="center"><td><img src="images/boro_plus.jpg" height="150px" width="175px"></td>
            <td><img src="images/horlicks.jpg" height="150px" width="175px"><br></td>
            <td><img src="images/eno.jpg" height="150px" width="175px"></td>
            <td><img src="images/dermi_cool.jpg" height="150px" width="175px"></td>
            <td><img src="images/detol.jpg" height="150px" width="175px"></td></tr>
        <tr align="center"><td><label>Boroplus Powder</label></td>
            <td><label>Horlics</label></td>
            <td><label>Eno</label></td>
            <td><label>Dermi Cool</label></td>
            <td><label>Detol</label></td></tr>
        <tr align="center"><td><label>Rs. 73.15</label></td>
            <td><label>Rs. 378.28</label></td>
            <td><label>Rs. 85.50</label></td>
            <td><label>Rs. 90.00</label></td>
            <td><label>Rs. 56.86</label></td></tr>
        <tr align="center"><td><a href="boro_plus.jsp">Buy</a></td>
            <td><a href="horlicks.jsp">Buy</a></td>
            <td><a href="eno.jsp">Buy</a></td>
            <td><a href="dermi_cool.jsp">Buy</a></td>
            <td><a href="detol.jsp">Buy</a></td></tr>
        <tr><td colspan="4"><br><br></td></tr>
        
        <tr align="center"><td><img src="images/garlic_pearls.jpg" height="150px" width="175px"></td>
            <td><img src="images/hamam_soap.jpg" height="150px" width="175px"><br></td>
            <td><img src="images/himalaya_green_tea.jpg" height="150px" width="175px"></td>
            <td><img src="images/himalaya_lotion.jpg" height="150px" width="175px"></td>
            <td><img src="images/pudin_hari_pearls.jpg" height="150px" width="175px"></td></tr>
        <tr align="center"><td><label>Garlic Pearls</label></td>
            <td><label>Hamam Soap</label></td>
            <td><label>Green Tea</label></td>
            <td><label>Himalaya Lotion</label></td>
            <td><label>Pudin Hara</label></td></tr>
        <tr align="center"><td><label>Rs. 102.00</label></td>
            <td><label>Rs. 27.00</label></td>
            <td><label>Rs. 85.50</label></td>
            <td><label>Rs. 104.00</label></td>
            <td><label>Rs. 17.10</label></td></tr>
        <tr align="center"><td><a href="garlic_pearls.jsp">Buy</a></td>
            <td><a href="hamam_soap.jsp">Buy</a></td>
            <td><a href="himalaya_green-tea.jsp">Buy</a></td>
            <td><a href="himalaya_lotion.jsp">Buy</a></td>
            <td><a href="pudin_hari_pearls.jsp">Buy</a></td></tr>
        <tr><td colspan="4"><br><br></td></tr>
        </table>
  </div>
    </body>
</html>
