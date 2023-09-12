package Logics;

import java.util.Scanner;

public class FactorialOfGivenNum {

	public static void main(String[] args) 
	{
		//n!=n*(n-1)*(n-2)*....*1
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		long f=1;
		int temp=num;
		 for(int i=temp;i>0;i--)
		 {
			 f=f*i;
		 }System.out.print(num+" factorial is "+f);
	}

}
