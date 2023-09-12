package LogicalPrograms;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int flag=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Given number is a prime");
		}
		else
		{
			System.out.println("Given number is not a prime");
		}
			
		
	}

}
