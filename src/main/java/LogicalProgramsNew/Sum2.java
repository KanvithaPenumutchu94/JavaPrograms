package LogicalProgramsNew;

import java.util.Scanner;

public class Sum2 {

	public static void main(String[] args) 
	{
		// sum=1+1/3+1/5+1/7+...........+1/n
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:  ");
		int num=sc.nextInt();
		
		double sum=0;
		for(int i=1;i<=num;i=i+2)
		{
			sum=sum+(double)1/i;
		}System.out.println(sum);

	}

}
