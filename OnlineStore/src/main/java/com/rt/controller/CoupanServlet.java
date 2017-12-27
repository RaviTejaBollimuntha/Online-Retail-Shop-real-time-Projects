package com.rt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;

import com.rt.Service.RService;
import com.rt.util.ContainerUtility;
@WebServlet(value="/ccode")
public class CoupanServlet extends HttpServlet {
	private ApplicationContext ctx=null;
	RService service=null;
	RequestDispatcher rd=null;
	 HttpSession session=null;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		ctx=ContainerUtility.getContainer();
		session=req.getSession();
		String ccode=req.getParameter("ccode");
        service=ctx.getBean("MService",RService.class);
        float result=service.coupanCheck(ccode);
        
           session.setAttribute("coupan", result);
    		rd=req.getRequestDispatcher("/checkout.jsp");
    		rd.forward(req, res);
    		
    	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		doGet(req, res);
	}

}
