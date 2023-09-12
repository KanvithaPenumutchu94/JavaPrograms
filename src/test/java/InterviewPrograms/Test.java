package InterviewPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		
		
		String s[]= {"kanni","venki","kanni","ram"};
		//Set<String> hs=new HashSet<String>();
		List<String> al=new ArrayList<String>();
		for(int i=0;i<s.length;i++)
		{
			for(int j=1;j<s.length;j++)
			{
				if(s[i].equals(s[j]))
				{
					al.add(s[i]);
				}
			}
		}System.out.println(al);

		
	}

}
