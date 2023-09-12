package LogicalProgramsNew;

import java.util.Scanner;

public class Sum8 {

	public static void main(String[] args) 
	{
		// sum=1/n+1/n-1+.....+1/1
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:  ");
		int num=sc.nextInt();
		
		double sum=0;
		for(int i=num;i>=1;i--)
		{
			sum=sum+(double)1/i;
		}System.out.println(sum);

	}

}
