package eng_memory_book;

import java.util.Scanner; 
import java.util.ArrayList;

public class Test {
	Scanner sc = new Scanner(System.in);
	int correct_count;
	int wrong_count;
	
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
		
		ArrayList<WordData> wd = Get_Day_Word(day);
		
		// test position
		for(int i = 0; i < wd.size(); i++)
		{
			System.out.print("kor : " + wd.kor + " / eng : ");
			
			String input_str = sc.nextLine();
			if(input_str == wd.eng)
			{
				correct_count++;
			}
			else
			{
				wrong_count++;
			}
		}
		
		// score position
		System.out.print("your score is " + (double)correct_count / (correct_count + wrong_count) + "!!!\n\n");
		
		// feedback position
		for(int i = 0; i < wd.size(); i++)
		{
			System.out.println("kor : " + wd.kor + " / eng : " + wd.eng);
		}
	}
	
	public void correct_english(int day)
	{
		System.out.println("English, day : " + day);
		
		correct_count = wrong_count = 0;
		
		ArrayList<WordData> wd = Get_Day_Word(day);
		
		// test position
		for(int i = 0; i < wd.size(); i++)
		{
			System.out.print("eng : " + wd.eng + " / kor : ");
			
			String input_str = sc.nextLine();
			if(input_str == wd.kor)
			{
				correct_count++;
			}
			else
			{
				wrong_count++;
			}
		}
		
		// score position
		System.out.print("your score is " + (double)correct_count / (correct_count + wrong_count) + "!!!\n\n");
		
		// feedback position
		for(int i = 0; i < wd.size(); i++)
		{
			System.out.println("kor : " + wd.eng + " / eng : " + wd.);
		}
	}
}
