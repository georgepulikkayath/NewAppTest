package servlets;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservice.EmployeeWebSevice;

public class RequestHelper {
	public static void process(HttpServletRequest request, HttpServletResponse response) {

		String uri = request.getRequestURI();
		System.out.println(request.getRequestURI());

		switch (uri) {

		case "/Projecttrms/login.do":
			EmployeeWebSevice.Login(request, response);
			break;

		case "/Projecttrms/signup.do":
			
			EmployeeWebSevice.CreateAccount(request, response);
			
			break;

		default: 
			try {
				response.sendError(451);
			} catch (IOException e) {
				e.printStackTrace();
			}
			break;
		

		}

	}

}
