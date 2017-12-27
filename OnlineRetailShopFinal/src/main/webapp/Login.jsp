<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Online Star Reatil Store</title>
        <meta charset="UTF-8">
         <link rel="stylesheet" href="styles.css">
        <meta name="viewport" content="width=device-width">
        <style>
            body {background-image:url('images/1.jpg');
                    background-repeat: no-repeat;
                    background-size: cover;}
        </style>
    </head>
    <body>
<div style="text-align:center">
            <label> <h1>Online Star Retail Store</h1>
             <h3>India ki Retail</h3></label><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
        <form method="post" action="./ulogin">
        <table>
            <tr><td align="center"><label>Login User</label></td></tr>
             <tr><td><label>Uername : </label><input size="30" type="text" name='nm'></td></tr>
            <tr><td><label>Password :</label><input size="30" type="password" name='ps'><br></td></tr>
            <tr><td> <input type="hidden" name="lcheck" value="1"><br></td></tr>
            <tr><td colspan="2"><button type="submit">Login</button></td></tr>
         </table>
        </form>
        <h3>(OR)</h3>
        <a href="Register.jsp">Register For New User</a>
        </div>
    </body>
</html>
