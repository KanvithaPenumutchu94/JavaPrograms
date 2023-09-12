package LogicalProgramsNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoOfRepeatedCharsInString2 {

	public static void main(String[] args) 
	{
		String s="thanvish ram kota";
		String s1=s.replace(" ", "");
		System.out.println(s1);
				
		for(int i=0;i<s1.length();i++)
		{
			int count=1;
			char ch =s1.charAt(i);
			for(int j=i+1;j<s1.length();j++)
			{
				char ch1=s1.charAt(j);
				if(ch==ch1)
				{
					count++;
				}
			
			}if(count>1)
			{
				System.out.println(ch+" is repeated "+count+" times");
			}
			
 		}
			
	}

}
