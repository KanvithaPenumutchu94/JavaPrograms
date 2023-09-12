package LogicalProgramsNew;

import java.util.ArrayList;
import java.util.List;

public class NoOfOccurancesOfCharInString {

	public static void main(String[] args) {
	
		String s1="kanvitha";
		
		char ch[]=s1.toCharArray();
		System.out.println(ch);
		
		int countnum[]=new int[500];		
		List<Character> lc=new 	ArrayList<Character>();
		List<Character> l=new 	ArrayList<Character>();
		
		for(char ch1:ch)
		{
			lc.add(ch1);
		}
		System.out.println(lc);
		
		for(int i=0;i<lc.size();i++)
		{
			int count=0;
			char c=lc.get(i);
			
			for(int j=0;j<lc.size();j++)
			{
				char c1=lc.get(j);
				if(Character.compare(c, c1)==0)
				{
					count++;
				}
				
			}
			if(count==1) {
				System.out.println("No of occurances of "+c+" char is: ");
				System.out.println(count);}
			else if(count==2 && !){
				System.out.println("No of occurances of "+c+" char is: ");
				System.out.println(count);
			}
			
		
			
		}

	}

}
