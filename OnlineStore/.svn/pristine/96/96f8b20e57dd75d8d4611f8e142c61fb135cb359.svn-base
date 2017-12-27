package com.rt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import com.rt.Service.RService;
import com.rt.util.ContainerUtility;
@WebServlet(value="/reg")
public class UserRegister extends HttpServlet {
	private ApplicationContext ctx=null;
	RService service=null;
	RequestDispatcher rd=null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		ctx=ContainerUtility.getContainer();
		String fname=req.getParameter("fname");
		String lname=req.getParameter("lname");        
        String email=req.getParameter("email");
        String pass=req.getParameter("pass");
        String mobile=req.getParameter("phone");
        String city=req.getParameter("city");
        String pincode=req.getParameter("pincode");
        String country=req.getParameter("country");
        String address=req.getParameter("addr");
        service=ctx.getBean("MService",RService.class);
        String result=service.userRegister(fname,lname,email,pass,mobile,city,pincode,country,address);
        if(result!=null) {
    		rd=req.getRequestDispatcher("/index.jsp");
    		rd.forward(req, res);
    		}else {
    			 out.println("<html><body><center>Registration Failed<br>");
                 out.println("<a href='Register.jsp'>Try Again</a></center></body></html>");
    			}
    	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
