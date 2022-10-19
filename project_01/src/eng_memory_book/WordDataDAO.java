package eng_memory_book;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;

public class WordDataDAO {
	private PreparedStatement pstmt;
	private ResultSet rs;
	private DataBaseConnection dbc;
	
	WordDataDAO() {
		dbc = new DataBaseConnection();
	}
		
	public ArrayList<WordDataDTO> Get_Day_Word(int day) {
		ArrayList<WordDataDTO> get_day_word = new ArrayList<WordDataDTO>();
		
		String query_select ="SELECT ENG, KOR FROM ENG_WORD WHERE word_day= ?";
		
		try {
			pstmt = dbc.getCon().prepareStatement(query_select);
			pstmt.setInt(1, day);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//System.out.println(rs.getString(1) + ", " + rs.getString(2));
				get_day_word.add(new WordDataDTO(rs.getString(1), rs.getString(2)));
			}
			
			rs.close();
		}
		catch(SQLException e) {
			System.out.println("error : " + e.getMessage());
		}
		
		return get_day_word;
	}
}
