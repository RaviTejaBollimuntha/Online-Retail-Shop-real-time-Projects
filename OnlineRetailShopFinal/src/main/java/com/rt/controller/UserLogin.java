package com.rt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.rt.Service.MService;
import com.rt.config.BeanConfigurator;
import com.rt.dto.CustomerDTO;
import com.rt.util.ContainerUtility;


public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 ApplicationContext ctx=null;
	 MService service=null;
	 HttpSession session=null;
		@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		ctx=ContainerUtility.getContainer();
		RequestDispatcher rd=null;
		session=req.getSession();
		
		if((session.getAttribute("uname")==null)&&(session.getAttribute("pass")==null)) {
		String name=req.getParameter("nm");
		String pass=req.getParameter("ps");
		session.setAttribute("uname", name);
		session.setAttribute("pass", pass);
		service=ctx.getBean("MService",MService.class);
		CustomerDTO dto=service.userAuthendication(name,pass);
		if(dto!=null&&("0".equals(req.getParameter("lcheck")))) {
			session.setAttribute("dtoObject",dto);
		rd=req.getRequestDispatcher("/Products.jsp");
		rd.forward(req, res);
		}else {
			if("1".equals(req.getParameter("lcheck"))) {
				session.setAttribute("dtoObject",dto);
				rd=req.getRequestDispatcher("/payment.jsp");
				rd.forward(req, res);
				
			}else {
			 out.println("<html><body><center><br><br><br><br><br><h1> Invalid Login</h1><br>");
             out.println("<a href='index.html'>Try Again</a></center></body></html>");
			}
		}
		}else {
			out.println("<html><body><center><br><br><br><br><br><h1> Your are Already Login in your Account</h1><br>");
            out.println("<a href='Products.jsp'>Please Go to Products& Buy Items</a></center></body></html>");
		}
	}

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
		
	}

}
