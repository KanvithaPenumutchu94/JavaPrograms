package StringClassMethods;

import java.util.Scanner;

public class ToLowerCaseMethod {

	public static void main(String[] args)
	{
		// Convert given String into LowerCase
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance"); 
		String str=sc.nextLine(); //RamThanvish@5
		str=str.toLowerCase();
		System.out.println(str); 

	}

}
