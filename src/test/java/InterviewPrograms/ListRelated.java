package InterviewPrograms;

import java.util.Arrays;
import java.util.List;

public class ListRelated {

	public static void main(String[] args) {
		// input="USA","Japan","France","Germany","Italy","India","Canada"
		//output=USA, JAPAN, FRANCE, GERMANY, ITALY, INDIA, CANADA, 
		
		List<String> al=Arrays.asList("USA","Japan","France","Germany","Italy","India","Canada");
		System.out.println(al);
		String a[]=new String[al.size()];
		int index=0;
		for(int i=0;i<al.size();i++)
		{
			a[index]=al.get(i);
			index++;
		}System.out.println(Arrays.toString(a));
		for(String aa:a)
		{
			String str="";
			for(int j=0;j<aa.length();j++)
			{
				str=str+Character.toUpperCase(aa.charAt(j));
			}
			System.out.print(str+", ");
		}
	}

}
