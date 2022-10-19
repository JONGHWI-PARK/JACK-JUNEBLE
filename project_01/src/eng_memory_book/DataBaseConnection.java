package eng_memory_book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseConnection {
	private Connection con;
	private Statement stmt;
		
	DataBaseConnection()
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jackjuneble";
		String password = "jackjuneble";
		
		try {
			Class.forName(driver);
			System.out.println("jdbc driver 로딩 성공");
			setCon(DriverManager.getConnection(url, user, password));
			System.out.println("오라클 연결 성공");
			stmt = getCon().createStatement();					
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver 로딩 실패");
		} catch (SQLException e) {
			System.out.println("오라클 연결 실패");
		}
	}
	
	void db_close()
	{
		try {
			stmt.close();
			getCon().close();	
		} catch(SQLException e) {
			System.out.println("error : " + e.getMessage());
		}
			
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
}
