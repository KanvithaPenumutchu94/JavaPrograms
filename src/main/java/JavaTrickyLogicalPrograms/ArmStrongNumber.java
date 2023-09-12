package JavaTrickyLogicalPrograms;

import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
		int nod=0;
		
		while(temp!=0)
		{
			int rem=temp%10; //take last digit
			nod++;
			temp=temp/10;//cut the last digit of a given number
		}System.out.println("Number of digits in "+n+" is "+nod);
		
	//ArmStrong number
		int temp2=n;
		int value=0;
		while(temp2!=0)
		{
			int d=temp2%10;
			value=(int) (value+Math.pow(d, nod));
			temp2=temp2/10;
		}
		if(value==n)
		{
			System.out.println("Given num is armstrong number"); //1634
		}else
		{
			System.out.println("Given num is not armstrong number");
		}
		

	}

}
