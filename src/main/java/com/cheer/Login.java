package com.cheer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet
{
	private static final long serialVersionUID = 1L;

	public Login()
	{
		super();
		
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter pw=response.getWriter();
		String passw=request.getParameter("password");
		String repassw=request.getParameter("repassword");
		String ages=request.getParameter("year");
		int age=Integer.parseInt(ages);
		

		if(passw.equals(repassw) & age<1999)
		{
			pw.println("注册成功"+"<br/><br/>");
			pw.append("欢迎你"+"<br/>"+request.getParameter("username"));
		}
		else
		{
			pw.append("没满18你都敢来，你爸妈造吗？");
		}
		pw.flush();
		pw.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		
		doGet(request, response);
	}

}
