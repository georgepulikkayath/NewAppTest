package webservice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmpLogin;
import service.EmployeeService;

public class EmployeeWebSevice {
	public static boolean CreateAccount(HttpServletRequest request, HttpServletResponse response) {

		String user_name = request.getParameter("uname");
		String pswd = request.getParameter("pswd");
		int sid = Integer.parseInt(request.getParameter("sid"));
		int did = Integer.parseInt(request.getParameter("did"));
		int type = Integer.parseInt(request.getParameter("type"));

		System.out.println(sid + " " + user_name + " " + type);

		boolean b1 = EmployeeService.InsertUser(user_name, pswd, sid, did, type);

		System.out.println("testing");
		System.out.println(b1);
		if (b1 == true) {
			//response.setContentType("text/html;charset=UTF-8");
//			        PrintWriter out = response.getWriter();
			System.out.println(b1);
			if (b1 == true) {
				try {
					response.sendRedirect("login.html");
					System.out.println("After redirect.");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			/*
			 * String nextHtml = "/login.html"; RequestDispatcher dispatcher =
			 * getServletContext().getRequestDispatcher(nextHtml);
			 * dispatcher.forward(request,response);
			 */
			// response.sendRedirect("login.html");

		}

		return b1;

	}

	public static void Login(HttpServletRequest request, HttpServletResponse response) {
		String user_name = request.getParameter("uname");
		String pswd = request.getParameter("pswd");
		EmpLogin e = EmployeeService.Login(user_name, pswd);
		System.out.println(e);
	}
}
