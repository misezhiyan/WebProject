package com.business.controller.base;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController implements BaseController {

	public void loginPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 转发：
		// request.getRequestDispatcher("").forward(request,response);
		// 重定向：
		// response.sendRedirect("");

		System.out.println("");

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		requestDispatcher.forward(request, response);
	}

}
