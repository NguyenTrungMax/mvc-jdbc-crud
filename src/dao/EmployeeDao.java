/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectDb;
import connection.SQLQuery;
import model.Employee;

/**
 * @author: TrungNV
 * @create date: Dec 4, 2017 10:29:35 AM
 * @modifier:
 */
public class EmployeeDao {
	/**
	 * @return:listEmployees
	 * @throws SQLException 
	 *
	 * @description: get all employees from database
	 */
	public List<Employee> getAllEmployee() throws SQLException {
		Connection con = null;
		List<Employee> listEmployees = new ArrayList<>();
		try {
			con = ConnectDb.connectDb();
			PreparedStatement ps = con.prepareStatement(SQLQuery.SELECT_ALL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee employee = new Employee();
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setAge(rs.getInt(3));
				employee.setAddress(rs.getString(4));
				listEmployees.add(employee);
			}
			return listEmployees;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return null;
	}
	/**
	 * @return: true if insert successful and else
	 * @throws SQLException 
	 *
	 * @description:
	 */
	public boolean insertEmployee(Employee employee) throws SQLException {
		Connection con = null;
		try {
			con = ConnectDb.connectDb();
			PreparedStatement ps = con.prepareStatement(SQLQuery.INSERT);
			ps.setString(1, employee.getName());
			ps.setInt(2, employee.getAge());
			ps.setString(3, employee.getAddress());
			
			int result = ps.executeUpdate();
			if (result > 0) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}	finally {
			con.close();
		}
		return false;
	}
	/**
	 * @param employee
	 * @return
	 * @throws SQLException:
	 *
	 * @description:
	 */
	public boolean updateEmployee(Employee employee) throws SQLException {
		Connection con = null;
		try {
			con = ConnectDb.connectDb();
			PreparedStatement ps = con.prepareStatement(SQLQuery.UPDATE);
			ps.setString(1, employee.getName());
			ps.setInt(2, employee.getAge());
			ps.setString(3, employee.getAddress());
			ps.setInt(4, employee.getId());
			
			int result = ps.executeUpdate();
			if (result > 0) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}	finally {
			con.close();
		}
		return false;
	}
	/**
	 * @param employee
	 * @return
	 * @throws SQLException:
	 *
	 * @description:
	 */
	public boolean deleteEmployee(int id) throws SQLException {
		Connection con = null;
		try {
			con = ConnectDb.connectDb();
			PreparedStatement ps = con.prepareStatement(SQLQuery.DELETE);
			ps.setInt(1, id);
			// execute query and return number record executed
			int result = ps.executeUpdate();
			
			if (result > 0) return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}	finally {
			con.close();
		}
		return false;
	}
	/**
	 * @return:
	 * @throws SQLException 
	 *
	 * @description:
	 */
	public Employee getEmployeeById(int id) throws SQLException {
		Connection con = null;
		try {
			con = ConnectDb.connectDb();
			PreparedStatement ps = con.prepareStatement(SQLQuery.SELECT_BY_ID);
			ps.setInt(1, id);
			
			Employee employee = (Employee) ps.executeQuery();
			return employee;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return null;
	}
}
