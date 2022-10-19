package eng_memory_book;

import java.util.Scanner; 
import java.util.ArrayList;

public class Test {
	Scanner sc;
	int correct_count;
	int wrong_count;
	WordDataDAO dummy_wd;
	
	Test() {
		sc = new Scanner(System.in);
		correct_count = 0;
		wrong_count = 0;
		dummy_wd = new WordDataDAO();
	}
	
	public void console()
	{
		while(true)
		{
			System.out.println("1. Correct Korean");
			System.out.println("2. Correct English");
			System.out.println("3. Back");
			System.out.print("Input Number : ");
			
			int select_type = sc.nextInt();
			
			if(select_type == 3)
			{
				System.out.println("3. Back");
				break;
			}
			
			System.out.print("Select Day : ");
			
			int select_day = sc.nextInt();
			sc.nextLine();

			test_word(select_type, select_day);
		}
	}
	
	public void test_word(int type, int day)
	{
		switch(type)
		{
			case 1:
				correct_korean(day);
				break;
				
			case 2:
				correct_english(day);
				break;
				
			default:
				break;
		}
	}
	
	public void correct_korean(int day)
	{		
		correct_count = wrong_count = 0;
		
		System.out.println("Korean, day : " + day);
		
		ArrayList<WordDataDTO> wd = dummy_wd.Get_Day_Word(day);
		
		for(int i = 0; i < wd.size(); i++)
		{
			System.out.print("kor : " + wd.get(i).getKor() + " / eng : ");
			
			String input_str = sc.nextLine();
			if(input_str.equals(wd.get(i).getEng()))
			{
				correct_count++;
			}
			else
			{
				wrong_count++;
			}
		}
		
		Score_Check_Process();
		Feedback_Process(wd);
	}
	
	public void correct_english(int day)
	{
		correct_count = wrong_count = 0;
		
		System.out.println("English, day : " + day);
		
		ArrayList<WordDataDTO> wd = dummy_wd.Get_Day_Word(day);
		
		for(int i = 0; i < wd.size(); i++)
		{
			System.out.print("eng : " + wd.get(i).getEng() + " / kor : ");
			
			String input_str = sc.nextLine();
			if(input_str == wd.get(i).getKor())
			{
				correct_count++;
			}
			else
			{
				wrong_count++;
			}
		}
		
		Score_Check_Process();
		Feedback_Process(wd);
	}
	
	// score position
	public void Score_Check_Process()
	{
		System.out.println("correct : " + correct_count + ", wrong : " + wrong_count);
		System.out.print("your score is " + correct_count / (double)(correct_count + wrong_count) * 100 + "!!!\n\n");
	}
	
	// feedback position
	public void Feedback_Process(ArrayList<WordDataDTO> wd)
	{
		for(int i = 0; i < wd.size(); i++)
		{
			System.out.println("kor : " + wd.get(i).getKor() + " / eng : " + wd.get(i).getEng());
		}
		System.out.println();
	}
	
	public void test_close()
	{
		dummy_wd.dao_close();
	}
}
