package LogicalProgramsNew;

import java.util.Scanner;

public class CountUCLCDIGITSAndSCInString3 {

	public static void main(String[] args) 
	{
		//Count Number of Upper Case,Lower Case,Spaces,Digits and Special Characters in a String
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str=sc.nextLine();
		
		int UCC=0,LCC=0,SC=0,SCC=0,DC=0;//UPPER CASE COUNT,LOWER CASE COUNT,DIGIT COUNT,SPACE COUNT,SPCIAL CHAR COUNT
		
		for(int i=0;i<str.length();i++)
		{
			char str1=str.charAt(i);
			if(str1==' ')
			{
				SC++;
			}
			else if(str1>='A' && str1<='Z')
			{
				UCC++;
			}
			else if(str1>='a' && str1<='z')
			{
				LCC++;
			}
			else if(str1>='0' && str1<='9')
			{
				DC++;
			}
			else
			{
				SCC++;
			}
		}System.out.println("Upper Case Count is: "+UCC);
		System.out.println("Lower Case Count is: "+LCC);
		System.out.println("Special Char Count is: "+SCC);
		System.out.println("Digits Count is: "+DC);
		System.out.println("Space Count is: "+SC);
		
		
	}

}
