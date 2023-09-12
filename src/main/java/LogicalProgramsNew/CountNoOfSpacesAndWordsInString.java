package LogicalProgramsNew;

import java.util.Scanner;

public class CountNoOfSpacesAndWordsInString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance ");//input=  India is my country  
		String s=sc.nextLine();
		
		//s=s.trim();
		String[] s1=s.split(" ");
		System.out.println("No.of words: "+s1.length);
		for(String str:s1)
		{
			System.out.println("words are: "+str);
		}
		System.out.println("No.of Spaces: "+(s1.length-1));

	}

}
