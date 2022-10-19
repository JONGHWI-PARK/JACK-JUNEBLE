package eng_memory_book;

public class WordDataDTO {
	
	private String eng;
	private String kor;
	
	public WordDataDTO(String eng, String kor) {
		super();
		this.eng = eng;
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}
}