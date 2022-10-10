package eng_memory_book;

import java.util.Scanner; 

public class Train {
	Scanner sc = new Scanner(System.in);
	
	public void console()
	{
		while(true)
		{
			System.out.println("1. Select days (1~2)");
			System.out.println("3. Back");
			System.out.print("Input Number : ");
			
			int select = sc.nextInt();
			
			if(select == 3)
			{
				System.out.println("3. Back");
				break;
			}

			train_word(select);
		}
	}
	
	public void train_word(int day)
	{
		// TO DO : use day parameter, make the train operation
	}
}
