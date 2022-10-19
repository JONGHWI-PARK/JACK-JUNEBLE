package eng_memory_book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WordDataDAO {
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DataBaseConnection dbc;
	
	WordDataDAO() {
		dbc = new DataBaseConnection();
	}
	
	void get_data_dao_from_day(int day)
	{
		/*
		String query_select ="SELECT ENG, KOR FROM ENG_WORD WHERE word_day= 1";
		ResultSet rs = stmt.executeQuery(query_select);			
		
		while(rs.next()) {
			System.out.println(rs.getString(1) + ", " + rs.getString(2));
		}
		*/

		String query_select ="SELECT ENG, KOR FROM ENG_WORD WHERE word_day= ?";
		
		try {
			pstmt = dbc.getCon().prepareStatement(query_select);
			pstmt.setInt(1, day);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1) + ", " + rs.getString(2));
			}
			
			rs.close();
		}
		catch(SQLException e) {
			System.out.println("error : " + e.getMessage());
		}
	}
}
