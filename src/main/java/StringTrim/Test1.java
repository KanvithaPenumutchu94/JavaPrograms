package StringTrim;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance ");//input=  India is my country  
		String s=sc.nextLine();
		
		System.out.println(s);//output=  India is my country  
		//trim() is used to remove front side and end side spaces in a given string
		s=s.trim();
		System.out.println(s);//output=India is my country
		
	
	}

}
