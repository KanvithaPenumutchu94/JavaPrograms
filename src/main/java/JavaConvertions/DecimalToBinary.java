package JavaConvertions;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		
		int temp=n;
		String binary="";
		while(temp!=0)
		{
			int r=temp%2;
			binary=r+binary;//add reminder at front of existing binary code
			temp=temp/2;
		}System.out.println(n+" binary vaiue is "+binary);
	}

}
