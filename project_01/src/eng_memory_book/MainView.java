package eng_memory_book;

import java.util.Scanner;

public class MainView {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test test = new Test();
		Train train = new Train();
		
		while(true)
		{
			System.out.println("1. Train mode");
			System.out.println("2. Test mode");
			System.out.println("3. Exit");
			System.out.print("Input Number : ");
			
			int select = sc.nextInt();
			
			if(select == 3)
			{
				System.out.println("Exit");
				break;
			}
			
			switch(select)
			{
				case 1:
					train.console(); // System.out.println("Train()");
					break;
					
				case 2:					
					test.console(); // System.out.println("Test()");
					break;
					
				default:
					break;
			}
		}
		
		test.test_close();
		train.train_close();
	}
}
