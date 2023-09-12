package StringClassMethods;

import java.util.Scanner;

public class ConcatMethod {

	public static void main(String[] args) 
	{
		//String concat() method
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance"); 
		String str=sc.nextLine();
		
		str=str.concat(str);
		str=str.concat("thanvish");
		System.out.println(str); 

	}

}
