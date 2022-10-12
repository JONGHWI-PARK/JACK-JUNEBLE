package eng_memory_book;

import java.util.Scanner; 
import java.util.ArrayList;

public class Test {
	Scanner sc = new Scanner(System.in);
	int correct_count;
	int wrong_count;
	WordData dummy_wd;
	
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
		dummy_wd = new WordData();
		
		correct_count = wrong_count = 0;
		
		System.out.println("Korean, day : " + day);
		
		ArrayList<WordData> wd = dummy_wd.Get_Day_Word(day);
		
		// test position
		for(int i = 0; i < wd.size(); i++)
		{
			System.out.print("kor : " + wd.get(i).kor + " / eng : ");
			
			String input_str = sc.nextLine();
			if(input_str == wd.get(i).eng)
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
			System.out.println("kor : " + wd.get(i).kor + " / eng : " + wd.get(i).eng);
		}
	}
	
	public void correct_english(int day)
	{
		dummy_wd = new WordData();
		
		System.out.println("English, day : " + day);
		
		correct_count = wrong_count = 0;
		
		ArrayList<WordData> wd = dummy_wd.Get_Day_Word(day);
		
		// test position
		for(int i = 0; i < wd.size(); i++)
		{
			System.out.print("eng : " + wd.get(i).eng + " / kor : ");
			
			String input_str = sc.nextLine();
			if(input_str == wd.get(i).kor)
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
			System.out.println("kor : " + wd.get(i).kor + " / eng : " + wd.get(i).eng);
		}
	}
}
