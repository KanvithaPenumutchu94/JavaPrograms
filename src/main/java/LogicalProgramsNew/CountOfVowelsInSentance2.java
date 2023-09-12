package LogicalProgramsNew;

import java.util.Scanner;

public class CountOfVowelsInSentance2 {

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
		switch(s1)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			v++;
			break;
			default:
			remaining++;
		
		}
	}System.out.println("vowel count is: "+v);
	System.out.println("remaining count is: "+remaining);
	

	}

}
