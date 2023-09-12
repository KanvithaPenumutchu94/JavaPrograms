package JavaLogics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayToArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("kanni");
		al.add("ram");
		al.add("sita");
		al.add("venki");
		
		//convert arraylist to array
		String s[]=al.toArray(new String[al.size()]);
		
		for(String ss:s)
		{
			System.out.println(ss);
		}
		
		//convert array to arraylist
		List<String> al1=new ArrayList<String>();
		al1=Arrays.asList(s);
		System.out.println(al1);
		
	}

}
