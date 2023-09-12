package InterviewQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInString {

	public static void main(String[] args) {
		
		String s="abbcddeee";
		
		Set<Character> hs=new HashSet<Character>();
		List<Character> al=new ArrayList<Character>();
		
		
		for(int i=0;i<s.length();i++)
		{
			int count=0;
			for(int j=0;j<=i;j++) {
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
				}
			}if(count>=1) {
				System.out.println(s.charAt(i)+"         "+count);
				
			}
		
		}
		
	}

}
