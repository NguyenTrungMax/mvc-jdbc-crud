
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author: TrungNV
 * @create date: Dec 4, 2017 10:01:37 AM
 * @modifier:
 */
public class ConnectDb {
	/**
	 * @return
	 * @throws SQLException:
	 *
	 * @description:
	 */
	public static Connection connectDb() throws SQLException {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=Employees;user=sa;password=123456";
			Connection con = DriverManager.getConnection(dbUrl);
			return con;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
