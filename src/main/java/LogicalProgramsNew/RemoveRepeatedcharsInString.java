package LogicalProgramsNew;

import java.util.Scanner;

public class RemoveRepeatedcharsInString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str=sc.nextLine(); //India is my country //remove i,n,y
		
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			for(int j=i+1;j<str.length();j++)
			{
				char c1=str.charAt(j);
				int comparecc1=Character.compare(c, c1 );
				
				if(comparecc1==0)
				{
					String s=c+"";
					str=str.replaceAll(s, "");
				}
			}
		}System.out.println(str);
	}

}
