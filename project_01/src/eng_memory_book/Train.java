package eng_memory_book;

import java.util.ArrayList;
import java.util.Scanner; 

public class Train {
	Scanner sc = new Scanner(System.in);
	
	WordData dummy_wd = new WordData();
	
	public void console()
	{
		while(true)
		{
			System.out.println("1. Select days (1 ~ 2)");
			System.out.println("2. Back");
			System.out.print("Input Number : ");
			
			int select_menu = sc.nextInt();
			
			if(select_menu == 2)
			{
				//System.out.println("3. Back");
				break;
			}
			
			System.out.println("Select Day : ");
			int select_day = sc.nextInt();
			
			train_word(select_day);
		}
	}
	
	public void train_word(int day)
	{ 
		ArrayList<WordData> wd = dummy_wd.Get_Day_Word(day);
		
		for(int k = 0; k < 3; k++) {
			
			if(day == 1) {	// day01 단어
				
				System.out.println("start!!");
				try {
					Thread.sleep(1000); 
				} catch (InterruptedException e) {
				}
				
				for(int i = 0; i < wd.size(); i++) {
					System.out.println(wd.get(i).eng + " " + wd.get(i).kor);
					
					try {
						Thread.sleep(3000); 
					} catch (InterruptedException e) {
					}
				}
				
				System.out.println("-------------------------------");
				try {
					Thread.sleep(500); 
				} catch (InterruptedException e) {
				}
				
			} else if(day == 2) {	// day02 단어
				
				System.out.println("start!!");
				try {
					Thread.sleep(1000); 
				} catch (InterruptedException e) {
				}
				
				for(int i = 0; i < wd.size(); i++) {
					
					System.out.println(wd.get(i).eng + " " + wd.get(i).kor);
					
					try {
						Thread.sleep(3000); 
					} catch (InterruptedException e) {
					}
				}
				
				System.out.println("-------------------------------");
				try {
					Thread.sleep(500); 
				} catch (InterruptedException e) {
				}
				
			}
		}
	}
}
