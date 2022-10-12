package eng_memory_book;

import java.util.ArrayList;

public class WordData {
	String eng;
	String kor;
	
	WordData() {}
	WordData(String eng, String kor) {
		this.eng = eng;
		this.kor = kor;
	}
	
	public ArrayList<WordData> Get_Day_Word(int day) {
		
		String[][] eng = {{"fatigue", "checkup", "symptom", "physician", "diagnosis", "prescribe", "recovery", "comprehensive", "participate", "examination"},
						  {"eliminate", "dietary", "transmit", "periodically", "coverage", "exposure", "pharmaceutical", "premium", "relive", "conscious"}};  
		String[][] kor = {{"피로", "건강 진단", "증상", "내과 의사", "진단", "(약을)처방하다", "회복, 쾌유", "종합적인, 포괄적인", "참여하다, 참가하다", "진찰, 검사"},
						  {"제거하다", "식이 요법의, 규정식의", "전염시키다", "주기적으로", "보상 범위; 보도, 취재범위", "노출", "제약의, 약학의", "보험료", "완화시키다", "알고 있는, 자각하고 있는"}};
		
		ArrayList<WordData> get_day_word = new ArrayList<WordData>();
		
		for(int i = 0; i < eng.length; i++) {
			get_day_word.add(new WordData(eng[day-1][i], kor[day-1][i]));
		}
		
		return get_day_word;
	}
}


