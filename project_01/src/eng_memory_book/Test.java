package eng_memory_book;

import java.util.Scanner; 

public class Test {
	Scanner sc = new Scanner(System.in);
	
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
		System.out.println("Korean, day : " + day);
	}
	
	public void correct_english(int day)
	{
		System.out.println("English, day : " + day);
	}
}
