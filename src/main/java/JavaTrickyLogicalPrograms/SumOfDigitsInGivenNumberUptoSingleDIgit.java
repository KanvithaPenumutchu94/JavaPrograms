package JavaTrickyLogicalPrograms;

import java.util.Scanner;

public class SumOfDigitsInGivenNumberUptoSingleDIgit {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int temp=n;
	
		while(temp>9)
		{
			int sum=0;
			while(temp!=0)
			{
				int rem=temp%10;
				sum+=rem;
				temp=temp/10;
			}
		temp=sum;
		}System.out.println("Sum of digits in a given number is: "+temp);
		
	}
}
