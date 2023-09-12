package LogicalProgramsNew;

import java.util.Scanner;

public class RemoveSpecialCharInSentance2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance: "); //kanni+venki =tram;
		String str=sc.nextLine();
		
		str=str.replaceAll("[^0-9A-Za-z]", "");
		System.out.println("String without special characters: "+str);
	}

}
