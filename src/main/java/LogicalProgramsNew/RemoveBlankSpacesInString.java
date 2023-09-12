package LogicalProgramsNew;

import java.util.Scanner;

public class RemoveBlankSpacesInString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str=sc.nextLine(); //kanni venki thanvishram
		
		str=str.replaceAll(" ", "");
		System.out.println(str);
	}

}
