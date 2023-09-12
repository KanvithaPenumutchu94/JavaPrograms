package LogicalProgramsNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoOfRepeatedCharsInString {

	public static void main(String[] args) 
	{
		String s="abbbcdddee";
		String s1=s.replace(" ", "");
		System.out.println(s1);
		char[] ch=new char[s1.length()];
		
		for(int i=0;i<s1.length();i++)
		{
			int count=1;
			ch[i]=s1.charAt(i);
			for(int j=i+1;j<s1.length();j++)
			{
				ch[j]=s1.charAt(j);
				if(ch[i]==ch[j])
				{
					count++;
				}
			if(count>1)
			{
				System.out.println(ch[i]+" is repeated "+count+" times");
			}
			}
			
 		}
			
	}

}
