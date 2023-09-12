package LogicalProgramsNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoOfRepeatedWordsInSentence {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance"); // kanni triveni chandrika kanni
		String str=sc.nextLine();
	
		String[] s=str.split(" ");
	
		 for(int i=0;i<s.length;i++)
		 {
			 int count=1;
			 String s1=s[i];
			 for(int j=i+1;j<s.length;j++)
			 {
				 String s2=s[j];
				
				 if(s1.equals(s2))
				 {
					 count++;
					
				 } 
			 } 
			 if(count>1)
			 {
				 System.out.println(s1+" word repeated "+count+ " times");
				
			 }
			 
		 }
		
		
		

	}

}
