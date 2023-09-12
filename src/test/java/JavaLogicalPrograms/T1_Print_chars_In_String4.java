package JavaLogicalPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class T1_Print_chars_In_String4 {

	public static void main(String[] args) {
		//op=aimbollbollccc
		
		String s="aim1boll2c3";
		//for capital letters
		//String[] part = s.split("[^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z])");
		//for small letters
		String[] part = s.split("[^a-z0-9]+|(?<=[a-z])(?=[0-9])|(?<=[0-9])(?=[a-z])");
		System.out.println(part[0]);
		System.out.println(part[1]);
		System.out.println(part[2]);
		System.out.println(part[3]);
		
		for(int i=0;i<part.length;i++)
		{
			int num=Integer.parseInt(String.valueOf(part[i+1]));
			for(int j=num;j>0;j--)
			{
				System.out.println(part[i]);
			}
			i++;
		}
	}

}
