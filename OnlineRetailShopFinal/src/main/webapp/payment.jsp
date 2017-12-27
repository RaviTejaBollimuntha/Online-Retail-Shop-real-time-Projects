
<%@page import="com.rt.dto.CustomerDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
CustomerDTO dto=(CustomerDTO)session.getAttribute("dtoObject");
String email=dto.getEmail();
String add=dto.getAddress();
long mob=dto.getMoblie();
System.out.println(email);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="styles.css">
        <title>Online Star Retail Store</title>
        <style>
            body {background-image:url('images/1.jpg');
                    background-repeat: no-repeat;
                    background-size: cover;}
        </style>
    </head>
    <body>

        <div style="text-align: center;" >
         <label> <h1>Online Star Reatil Store</h1>
             <h3>India ki Retail</h3></label><br>
             <form action="./order" method="POST">
        <table style="text-align: center;">
            <tr align="center"><td colspan="2"><label>Select Payment Method</label></td></tr>
            <tr align="left"><td colspan="2">Email::<input autofocus="autofocus" type="text" name="email" value=<%= email %>></input></td></tr>
            <tr align="left"><td colspan="2">Mobile::<input type="text" name="mob" value=<%= mob %>></input></td></tr>
            <tr align="left"><td colspan="2">Address::<input size="35" type="text" name="add" value=<%= add %>></input></td></tr>
            <tr><td colspan="2">
                    <input type="radio" name="rpay" value="credit card" align="left" checked><label>Credit Card</label></td><br></tr>
            <tr><td colspan="2"> <input type="radio" name="rpay" align="center" value="Debit Card" ><label>Debit Card</label>
                            <select name="pay">
                            <option value="visa debit card">All Visa debit card</option>
                            <option value="sbi debit card">All SBI debit card</option>
                            <option value="rupey debit card">All Rupey debit card</option>
                            <option value="icici debit card">ICIC Debit Card</option>
                           
                            </select></td><br></tr>
            <tr><td colspan="2"> <input type="radio" name="rpay" align="left" value="credit card" ><label>Net Banking</label>
                            <select name="pay">
                            <option value="icici bank">ICICI Bank</option>
                            <option value="sbi bank">SBI Bank</option>
                            <option value="hdfc bank">HDFC Bank</option>
                            <option value="axis bank">Axis Bank</option>
                            
                            </select></td></tr>
            <tr>
                
                <td colspan="2" align="center"><button type="submit">Order</button></td>
            </tr>
        </table>
                 </form>
   </div>
    </body>
</html>
