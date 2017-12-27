<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.rt.util.cart" %>
<%
ServletRequest req=pageContext.getRequest();
ServletResponse res=pageContext.getResponse();
RequestDispatcher rd=null;
if(("Add TO Cart".equals(req.getParameter("cart")))){
	  cart shoppingCart;
	  shoppingCart = (cart) session.getAttribute("cart");
	  if(shoppingCart == null){
	   shoppingCart = new cart();
	   session.setAttribute("cart", shoppingCart);
	   }
	  String product = request.getParameter("product");
	  String amount = request.getParameter("amount");
	  String noi = request.getParameter("noi");
	  shoppingCart.addToCart(product,amount,noi);
	  session.setAttribute("cart", shoppingCart);
	 rd=request.getRequestDispatcher("/viewCart.jsp");
	 rd.forward(request, response);
	}
else if(("deleteItem".equals(req.getParameter("delete")))){
		String name = request.getParameter("deleteitem");
		System.out.println(name);
		cart shoppingCart;
		shoppingCart = (cart) session.getAttribute("cart");
		shoppingCart.deleteFromCart(name);
		session.setAttribute("cart", shoppingCart);
		rd=request.getRequestDispatcher("/viewCart.jsp");
		 rd.forward(request, response);
	}
else{
		
     if((session.getAttribute("uname")!=null)&&(session.getAttribute("pass")!=null)){
      rd=req.getRequestDispatcher("/payment.jsp");
      rd.forward(req, res);
      }else{
	        rd=req.getRequestDispatcher("/Login.jsp");
	        rd.forward(req, res);
           }
}

%>