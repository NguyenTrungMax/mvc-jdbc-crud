package business;
/**
 * 
 */

import java.sql.SQLException;
import java.util.List;

import dao.EmployeeDao;
import model.Employee;

/**
 * @author: TrungNV
 * @create date: Dec 4, 2017 10:29:17 AM
 * @modifier:
 */
public class EmployeeBus {

	EmployeeDao dao = new EmployeeDao();

	/**
	 * @return:listEmployees
	 * @throws SQLException
	 *
	 * @description: get all employees from database
	 */
	public List<Employee> getAllEmployee() throws SQLException {
		return dao.getAllEmployee();
	}

	/**
	 * @return: true if insert successful and else
	 * @throws SQLException
	 *
	 * @description:
	 */
	public boolean insertEmployee(Employee employee) throws SQLException {
		return dao.insertEmployee(employee);
	}

	/**
	 * @param employee
	 * @return
	 * @throws SQLException:
	 *
	 * @description:
	 */
	public boolean updateEmployee(Employee employee) throws SQLException {
		return dao.updateEmployee(employee);
	}

	/**
	 * @param employee
	 * @return
	 * @throws SQLException:
	 *
	 * @description:
	 */
	public boolean deleteEmployee(int id) throws SQLException {
		return dao.deleteEmployee(id);
	}

	/**
	 * @return:
	 * @throws SQLException
	 *
	 * @description:
	 */
	public Employee getEmployeeById(int id) throws SQLException {
		return dao.getEmployeeById(id);
	}
}
