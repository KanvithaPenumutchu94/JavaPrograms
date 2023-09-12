package LogicalProgramsNew;

import java.util.Scanner;

public class Sum7 {

	public static void main(String[] args) 
	{
		// sum1=1/2+1/4+1/6+1/8+1/10+...+1/n
		// sum2=1/1+1/3+1/5+1/7+1/9+...+1/n
		// Using one loop
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:  ");
		int num=sc.nextInt();
		
		double sum1=0;
		double sum2=0;
		for(int i=1;i<=num;i++)
		{
			if(i%2==0)
			{
				sum1=sum1+(double)1/i;
			}
			else
			{
				sum2=sum2+(double)1/i;
			}
		}System.out.println(sum1);
		System.out.println(sum2);

	}

}
