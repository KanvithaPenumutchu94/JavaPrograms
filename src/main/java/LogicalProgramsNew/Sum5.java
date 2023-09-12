package LogicalProgramsNew;

import java.util.Scanner;

public class Sum5 {

	public static void main(String[] args) 
	{
		// sum=1/2+1/4+1/8+1/16+1/32+1/64...........+1/n
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:  ");
		int num=sc.nextInt();
		
		double sum=0;
		for(int i=2;i<=num;i=i*2)
		{
			sum=sum+(double)1/i;
		}System.out.println(sum);

	}

}
