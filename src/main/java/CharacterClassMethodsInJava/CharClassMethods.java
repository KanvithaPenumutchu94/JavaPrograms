package CharacterClassMethodsInJava;

import java.util.Scanner;

public class CharClassMethods {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance");
		String str=sc.nextLine(); //5Ram
		int d=0, uc=0, lc=0, specialchar=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(Character.isDigit(ch))
			{
				d++;
			}
			else if(Character.isUpperCase(ch))
			{
				uc++;
			}
			else if(Character.isLowerCase(ch))
			{
				lc++;
			}
			else
			{
				specialchar++;
			}
		}System.out.println("digits are:"+d);
		System.out.println("uppercase letters are:"+uc);
		System.out.println("lowercase letters are:"+lc);
		System.out.println("special chars are:"+specialchar);
	
	}

}
