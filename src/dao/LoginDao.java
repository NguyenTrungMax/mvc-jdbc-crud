/**
 * 
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.ConnectDb;
import connection.SQLQuery;

/**
 * @author: TrungNV
 * @create date: Dec 5, 2017 1:41:59 PM
 * @modifier:
 */
public class LoginDao {
	/**
	 * @param username
	 * @param password
	 * @return: true or false, kiem tra tai khoan co trong db chua
	 * @throws SQLException 
	 *
	 * @description:
	 */
	public boolean isLogin(String user, String pass) throws SQLException {
		Connection con = null;
		try {
			con = ConnectDb.connectDb();
			PreparedStatement ps = con.prepareStatement(SQLQuery.EXIST_ACC);
			ps.setString(1, user);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			return rs.next();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return false;
	}
}
