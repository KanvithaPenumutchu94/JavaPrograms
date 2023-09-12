package UnsolvedPrograms;

import java.util.ArrayList;

public class NoOfOccurancesOfGivenString {

	public static void main(String[] args) 
	{
		String s="abbcddee";
		ArrayList<String> al=new ArrayList<String>();
		int count=0;
		
		
		for(int i=0;i<s.length();i++)
		{
			if(!al.contains(s.charAt(i)))
			{
				
				al.add(s.charAt(i)+"");
			}
			else {
				count++;
				System.out.println(s.charAt(i)+" character is occured in "+count);
			}
		}
	}

}
