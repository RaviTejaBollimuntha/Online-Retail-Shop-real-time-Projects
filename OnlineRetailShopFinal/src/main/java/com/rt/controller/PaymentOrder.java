package com.rt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;

import com.rt.Service.MService;
import com.rt.util.ContainerUtility;
import com.rt.util.SSLEmail;
import com.rt.util.cart;

public class PaymentOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ApplicationContext ctx=null;
	MService service=null;
	 HttpSession session=null;
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		   PrintWriter out=res.getWriter();
			ctx=ContainerUtility.getContainer();
			session=req.getSession();
			RequestDispatcher rd=null;
		    HashMap<String, Map<String,String>> hp=cart.getCartItems();
		    String name=(String) session.getAttribute("uname");
		    String email=req.getParameter("email");
		    String mob=req.getParameter("mob");
		    String addr=req.getParameter("add");
          String rpay=req.getParameter("rpay");
          String pay=req.getParameter("pay");
         service=ctx.getBean("MService",MService.class);
         
		String result=service.userOrder(name,hp,email,mob,addr,rpay,pay);
		if(result!=null) { 	
			       SSLEmail.send(email,hp);
					rd=req.getRequestDispatcher("/Done.jsp");
					rd.forward(req, res);  
					
				}else {
				 out.println("<html><body><center>Transaction Failed<br>");
	             out.println("<a href='Products.jsp'>Try Again</a></center></body></html>");
				}
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
