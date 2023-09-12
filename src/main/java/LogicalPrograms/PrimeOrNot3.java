package LogicalPrograms;

import java.util.Scanner;

public class PrimeOrNot3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int count=0;
		
		for(int i=2;i<num;i++)
		{
		
			if(num%i==0)
			{
				count++;
			}
			else if(num%num==0 && num%1==0)
			{
				continue;
			}
			else {
				
			}
		}
		
			
		if(count==0)
		{
			System.out.println("Given num is Prime");
		}
		else
		{
			System.out.println("Given num is not Prime");
		}
				
	}
}
