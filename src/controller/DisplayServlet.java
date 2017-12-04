package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.EmployeeBus;
import model.Employee;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/display-all")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public DisplayServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmployeeBus bus = new EmployeeBus();
		
//		Employee employee = new Employee();
//		employee.setName(firstName+lastName);
//		employee.setAge(Integer.parseInt(age));
//		employee.setAddress(address);
		// them vao csdl
		
		try {
			List<Employee> employeesList = bus.getAllEmployee();
//			bus.insertEmployee(employee);
			request.setAttribute("listEmployees", employeesList);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("display/displayEmployees.jsp").forward(request, response);
	}

}
