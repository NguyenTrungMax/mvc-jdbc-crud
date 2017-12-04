package connection;

public class SQLQuery {
	public static final String SELECT_ALL = "SELECT * FROM nhanvien";
	public static final String SELECT_BY_ID = "SELECT ID FROM";
	public static final String INSERT = "INSERT INTO nhanvien VALUES (?, ?, ?)";
	public static final String UPDATE = "UPDATE nhanvien SET name = ?, age = ?, address = ? WHERE id = ?";
	public static final String DELETE = "DELETE FROM nhanvien WHERE id = ?";
	
}
