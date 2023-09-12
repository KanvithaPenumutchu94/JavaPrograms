package JavaTrickyLogicalPrograms;

import java.util.Scanner;

public class NoOfOccurancesOfGivenStringWithLoop {

	public static void main(String[] args) 
	{
		//String s="India is my country";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance");
		String s=sc.nextLine();
		System.out.println("Enter a character");
		char c=sc.nextLine().charAt(0); 
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
				count++;
			}
		}
		System.out.println(c+" character is occured in "+count);

	}

}
