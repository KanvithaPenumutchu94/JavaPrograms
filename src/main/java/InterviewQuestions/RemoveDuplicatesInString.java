package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesInString {

	public static void main(String[] args) {
		
		String s="abbcddee";
		//char ch[]=s.toCharArray();
		
		
		List<Character> al=new ArrayList<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			if(!al.contains(s.charAt(i)))
			{
				al.add(s.charAt(i));
			}
			else {
				count++;
			}System.out.println(s.charAt(i)+".........."+count);
		}System.out.println(al);
		

	}

}
