package LogicalProgramsNew;

import java.util.Scanner;

public class Sum3 {

	public static void main(String[] args) 
	{
		// sum=1/5+2/5+3/5+4/5+...........+1/n
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:  ");
		int num=sc.nextInt();
		
		double sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+(double)i/5;
		}System.out.println(sum);

	}

}
