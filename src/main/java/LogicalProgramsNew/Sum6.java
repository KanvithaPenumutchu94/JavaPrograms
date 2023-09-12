package LogicalProgramsNew;

import java.util.Scanner;

public class Sum6 {

	public static void main(String[] args) 
	{
		// sum=1/2+2/3+3/4+4/5+.....n/n+1
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:  ");
		int num=sc.nextInt();
		
		double sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+(double)i/(double)(i+1);
		}System.out.println(sum);

	}

}
