package com.business.controller.base;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController implements BaseController {

	public void loginPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ת����
		// request.getRequestDispatcher("").forward(request,response);
		// �ض���
		// response.sendRedirect("");

		System.out.println("");

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
		requestDispatcher.forward(request, response);
	}

}
