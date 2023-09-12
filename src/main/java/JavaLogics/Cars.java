package JavaLogics;

import java.util.Scanner;

public class Cars {
	
	//Question: Date is Odd,all even numbered cars will be fined(1 2 3 4 5).So the total fine is 350*4=Rs. 1400
	//Note: Input is an array of Strings.You need to convert it to integers for processing.
	
	public static void processInput(int date,String[] carnumbers)
	{
		if(date%2==0)
		{
			int count=0;
			System.out.println("Date is Even,Then all odd numbered cars will be fined to 350 each");
			for(String carnumber:carnumbers)
			{
				int carnum=Integer.parseInt(carnumber);
				if(carnum%2!=0)
				{
					count++;
				}
			}System.out.println("No of odd number cars= "+count);
			System.out.println("Total fine= "+(count*350));	
		}
		else 
		{
			int count=0;
			System.out.println("Date is Odd,Then all even numbered cars will be fined to 350 each");
			for(String carnumber:carnumbers)
			{
				int carnum=Integer.parseInt(carnumber);
				if(carnum%2==0)
				{
					count++;
				}
			}System.out.println("No of even number cars= "+count);
			System.out.println("Total fine= "+(count*350));	
		}
		
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Date");
		int date=Integer.parseInt(sc.nextLine());
		System.out.println("Enter Car Numbers");
		String input = sc.nextLine();    // get the entire line after the prompt 
		String[] carnumbers = input.split(" "); // split by spaces
		/*for(String carnumber:carnumbers)
		{
			System.out.println(carnumber);
		}*/
		processInput(date,carnumbers);
		
	}

}
