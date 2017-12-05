package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDao;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
	LoginDao dao = new LoginDao();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// lay 2 bien ra
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// kiem tra username and password co ton tai trong db k
		try {
			if (dao.isLogin(username, password)) {
				HttpSession session = request.getSession();
				Map<String, String> accountSession = new HashMap<String, String>();
				accountSession.put("username", username);
				accountSession.put("password", password);
				//truyen di thang acount session
				session.setAttribute("account", accountSession);
				request.getRequestDispatcher("/display/index.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("/display/login.jsp").forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
