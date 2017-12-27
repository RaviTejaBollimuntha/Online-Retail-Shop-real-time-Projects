<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="com.rt.util.cart" %>
<%
Map<String,Map<String,String>> items = cart.getCartItems();
Map<String,String> item=null;
float i=0.0f;
float total_cost=0.0f;
String s=null;
%>
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
    padding: 10px 12px;
    text-decoration: none;
}

li a:hover:not(.active) {
    background-color: #111;
}
table, td, th {
    border: 1px solid black;
}
th {
    background-color: lime;
}
        </style>
        <title>Online Star Retail Store</title>
    </head>
    <body>
 <div style="text-align:center;">
     <label><h1>Online Star Reatil Store</h1></label>   
     <ul>
  <li><a href="index.html">Home</a></li>
  <li><a href="Products.jsp">Product</a></li>
  <li style="float:right"><a href="#contact">Contact</a></li>
  <li style="float:right"><a class="active" href="#about">About</a></li>
</ul>
<table border='1px' style="text-align: center; color:Red;">
<tr align="center"><th>Product Name</th><th>Price</th><th>No Of Items</th></tr>
<% 
if(items!=null)
{
for(String key: items.keySet()){
	 item=items.get(key);
%>
<tr align="center">
<td><%=key%></td>
<%
if(item!=null)
{
for(String k: item.keySet()){
total_cost=Float.parseFloat(k)*Integer.parseInt(item.get(k));
%>
<td><%=total_cost%></td>
<td><%=item.get(k) %></td>
<% 
i=i+total_cost;
}
}
%>
   <td> 
  <form action="Control.jsp" method="POST">
    <input type="hidden" name="deleteitem" value=<%=key %>>
    <input type="submit" name="delete" value="deleteItem">
    </form>
    </td>
    </tr>
    <%
}
 %>
<tr align="center"><th>Total Amount </th><th>::</th><th><%=i %></th></tr>
<tr align="center"><td><a href="/OnlineRetailShop/Products.jsp"><button>Add More Items</button></a></td><td><a href="/OnlineRetailShop/Control.jsp"><button>Make Payment </button></a></td></tr>
</table>
<%
}else{
	%>
	<a href="/OnlineRetailShop/Products.jsp"><button>Please Add Items to Cart</button></a>
	<%
}
	%>
</div>
</body>
</html>