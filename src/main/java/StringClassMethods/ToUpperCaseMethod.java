package StringClassMethods;

import java.util.Scanner;

public class ToUpperCaseMethod {

	public static void main(String[] args)
	{
		// Convert given String into UpperCase
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance"); 
		String str=sc.nextLine(); //RamThanvish@5
		str=str.toUpperCase();
		System.out.println(str); 

	}

}
