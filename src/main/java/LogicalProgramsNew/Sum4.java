package LogicalProgramsNew;

import java.util.Scanner;

public class Sum4 {

	public static void main(String[] args) 
	{
		// sum=1*5+2*5+3*5+....+n*5
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:  ");
		int num=sc.nextInt();
		
		long sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+(i*5);
		}System.out.println(sum);

	}

}
