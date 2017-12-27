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

import com.rt.Service.MService;
import com.rt.util.ContainerUtility;
@WebServlet(value="/reg")
public class UserRegister extends HttpServlet {
	private ApplicationContext ctx=null;
	MService service=null;
	RequestDispatcher rd=null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		ctx=ContainerUtility.getContainer();
		String name=req.getParameter("nm");
        String mobile=req.getParameter("mb");
        String email=req.getParameter("em");
        String pass=req.getParameter("ps");
        String city=req.getParameter("ct");
        String pincode=req.getParameter("pc");
        String state=req.getParameter("cnt");
        String address=req.getParameter("add");
        service=ctx.getBean("MService",MService.class);
        String result=service.userRegister(name,mobile,email,pass,city,pincode,state,address);
        if(result!=null) {
    		rd=req.getRequestDispatcher("/Products.jsp");
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
