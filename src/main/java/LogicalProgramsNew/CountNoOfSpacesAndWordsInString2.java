package LogicalProgramsNew;

import java.util.Scanner;

public class CountNoOfSpacesAndWordsInString2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance ");//input=  India is my country  
		String s=sc.nextLine();
		int noc=0;
		int nos=0;
		int now=0;
		if(s.charAt(0)==' ')
		{
			nos++;
		}
		else 
		{
			now=1; //by default, one sentence is one word 
		}
		
		for(int i=0;i<s.length();i++)
		{
			char s1=s.charAt(i);
			//for blank space and character
			if(s1==' ')
			{
				nos++;
			}
			else
			{
				noc++;
			}
			//for word
			try {
			if(s1==' '&&s.charAt(i+1)!=' ')
			{
				now++;
			}}
			catch(Exception ex)
			{
			
			}
			
		}System.out.println("no of Spaces: "+nos);
		System.out.println("no of words: "+now);
		System.out.println("no of char: "+noc);

	}

}
