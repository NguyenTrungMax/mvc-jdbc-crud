/**
 * 
 */
package controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author: TrungNV
 * @create date: Dec 5, 2017 12:01:16 PM
 * @modifier:
 */
public class AppFilter implements Filter {

	/**
	 * @see javax.servlet.Filter#destroy()
	 */
	@Override
	public void destroy() {
	}

	/**
	 * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse,
	 *      javax.servlet.FilterChain)
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	    throws IOException, ServletException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		HttpSession session = ((HttpServletRequest) request).getSession();

		// kiem tra xem thang account nay da la 1 session hay chua. chua thi chuyen den login. neu ton tai
		// thi dofilter(request,response) binh thuong
		HashMap<String, String> accountSession = (HashMap<String, String>) session.getAttribute("account");

		if (username == null || password == null || username.length() == 0 || password.length() == 0) {
			if (accountSession == null) {
				RequestDispatcher reqDis;
				reqDis = request.getRequestDispatcher("/display/login.jsp");
				reqDis.forward(request, response);
			} else {
				chain.doFilter(request, response);
			}
		} else {
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	 */
	@Override
	public void init(FilterConfig arg0) throws ServletException {
	}

}
