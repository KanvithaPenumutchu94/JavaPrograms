package LogicalProgramsNew;

import java.util.Scanner;

public class RemoveBlankSpacesInString2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str=sc.nextLine(); //kanni venki thanvishram
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isSpace(c))
			{
				String s=c+"";
				str=str.replace(s, "");
			}
		}System.out.println(str);
	}

}
