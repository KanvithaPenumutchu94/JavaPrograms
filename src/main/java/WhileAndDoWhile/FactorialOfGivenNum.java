package WhileAndDoWhile;

import java.util.Scanner;

public class FactorialOfGivenNum {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		//Calculate Factorial
		long f=1;
		int temp=num;
		while(temp>0)
		{
			f=f*temp;
			temp--;
		}System.out.println(num+" factorial is "+f);
		

	}

}
