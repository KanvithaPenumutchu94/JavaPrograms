package Stars;

import java.util.ArrayList;
import java.util.List;

public class Dummy {
	public static void main(String[] args) 
	{
		String s="interview question asked by interviewer";
		String[] str=s.split(" ");
		//System.out.println();
		List<String> l=new ArrayList<String>();
		int count=0;
		
		for(int i=0;i<str.length;i++)
		{
			l.add(str[i]);
		
			
		}
		System.out.println(l.size());
	}

}
