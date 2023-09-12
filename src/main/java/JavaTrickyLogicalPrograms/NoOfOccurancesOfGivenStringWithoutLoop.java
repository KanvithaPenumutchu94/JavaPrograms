package JavaTrickyLogicalPrograms;

import java.util.Scanner;

public class NoOfOccurancesOfGivenStringWithoutLoop {

	public static void main(String[] args) 
	{
		//String s="India is my country";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance");
		String s=sc.nextLine();
		System.out.println("Enter a character");
		char c=sc.nextLine().charAt(0);
		
		String temp=s;
		temp=temp.replace(temp.valueOf(c), "");
		System.out.println(c+" occered "+(s.length()-temp.length())+" times");
		
	}

}
