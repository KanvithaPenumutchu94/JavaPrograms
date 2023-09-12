package LogicalProgramsNew;

import java.util.Scanner;

public class CountOfVowelsInSentance {

	public static void main(String[] args) {
		// a,e,i,o,u,A,E,I,O,U
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Sentance: ");
	String s=sc.nextLine();
	
	int v=0;
	int remaining=0;

	for(int i=0;i<s.length();i++)
	{
		char s1=s.charAt(i);
		if(s1=='a') 
		{
			v++;
		}
		else if(s1=='e') 
		{
			v++;
		}
		else if(s1=='i') 
		{
			v++;
		}
		else if(s1=='o') 
		{
			v++;
		}
		else if(s1=='u') 
		{
			v++;
		}
		else if(s1=='A') 
		{
			v++;
		}
		else if(s1=='E') 
		{
			v++;
		}
		else if(s1=='I') 
		{
			v++;
		}
		else if(s1=='O') 
		{
			v++;
		}
		else if(s1=='U') 
		{
			v++;
		}
		else
		{
			remaining++;
		}
		
	}System.out.println("vowel count is: "+v);
	System.out.println("remaining count is: "+remaining);
	

	}

}
