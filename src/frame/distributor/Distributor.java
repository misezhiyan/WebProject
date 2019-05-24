package frame.distributor;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import com.business.controller.base.BaseController;
import com.business.controller.base.LoginController;

import frame.servlet.LoginServlet;

public class Distributor extends HttpServlet {

	public static BaseController matchController(HttpServletRequest request, Class clazz) {

		if (clazz == LoginServlet.class)
			return new LoginController();

		return null;
	}
}
