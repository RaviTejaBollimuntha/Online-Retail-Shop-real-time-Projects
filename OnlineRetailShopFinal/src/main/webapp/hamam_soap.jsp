<%-- 
    Document   : hamam_soap
    Created on : May 30, 2017, 10:23:10 PM
    Author     : N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <div style="text-align: center;">
         <label> <h1>Online Star Retail Store</h1>
             <h3>India ki Retail</h3></label><br>
             <form action="Control.jsp" method="POST">
        <table>
            <tr align="center"><td colspan="3"><label name="product">Hamam BeautySoap</label>
                <input type="hidden" name="product" value="Hamam_Beauty_Soap"></td></tr><br><br>
            <tr>
                <td rowspan="2"><img src="images/hamam_soap.jpg" height="150px" width="175px"></td>
                <td></td>
                <td><label name="amount">Rs 27.00</label><input type="hidden" name="amount" value="27.00"></td>
                <td><select name="noi" style="width: 80px">
                            <option value="1"> 1 </option>
                            <option value="2"> 2 </option>
                            <option value="3"> 3 </option>
                            <option value="4"> 4 </option>
                        </select></td>
            </tr>
            <tr><td colspan="2"></td></tr>
            <tr align="center"><td colspan="2"><input type="submit" name="cart" value="Add TO Cart"></td>
            <td colspan="2"><input type="submit" name="payment" value="Make Payment"></td>
             </table>
                 </form>
    </div>
    </body>
</html>
