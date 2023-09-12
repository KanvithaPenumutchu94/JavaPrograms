package JavaLogics;

import java.util.ArrayList;

public class ConvertArrayListToArray {

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
	}

}
