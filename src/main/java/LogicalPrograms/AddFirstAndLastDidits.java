package LogicalPrograms;

import java.util.Scanner;

public class AddFirstAndLastDidits {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number ");
		int num=sc.nextInt();
		int Lastnum=num%10;
		int Firstnum=num;
		while(Firstnum>=10)
		{
			Firstnum=Firstnum/10;
		}
		
		System.out.println("Firstnum is= "+Firstnum);
		System.out.println("Lastnum is= "+Lastnum);
		System.out.println("Sum of first and last digits are= "+(Firstnum+Lastnum));
	
	}

}
