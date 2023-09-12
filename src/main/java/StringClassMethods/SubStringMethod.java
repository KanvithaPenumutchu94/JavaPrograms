package StringClassMethods;

import java.util.Scanner;

public class SubStringMethod {

	public static void main(String[] args)
	{
		//
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance"); 
		String str=sc.nextLine(); //Ram  Thanvish
		
		str=str.substring(5); //Thanvish
		str=str.substring(0, 5); //Thanv
		System.out.println(str); 
	}

}
