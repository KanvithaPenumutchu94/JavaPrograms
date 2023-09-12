package LogicalProgramsNew;

import java.util.Scanner;

public class RemoveSpecialCharInSentance {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance: "); //kanni+venki =tram;
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(!Character.isAlphabetic(c) && !Character.isDigit(c))
			{
				String s=c+"";//we can not replace char with null so we convert char to string then replace
				str=str.replace(s, "");
				
			}
			
		}System.out.println("sentance without special characters: "+str);

	}

}
