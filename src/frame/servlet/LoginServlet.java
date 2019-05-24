package frame.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.business.controller.base.LoginController;

import frame.distributor.Distributor;

public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// 匹配控制器
		LoginController loginController = (LoginController) Distributor.matchController(request, LoginServlet.class);
		if (null == loginController)
			System.out.println("没有匹配到控制器!");

		String requestURI = request.getRequestURI();
		String requestURL = request.getRequestURL().toString();

		System.out.println(requestURI);
		System.out.println(requestURL);

		String uri = requestURI.substring(requestURI.indexOf("/", 2));
		System.out.println(uri);

		if ("/login/loginPage.do".equals(uri))
			loginController.loginPage(request, response);

		// // 匹配控制器方法
		// Class<? extends BaseController> clazz = baseController.getClass();
		// System.out.println(clazz);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}
}
