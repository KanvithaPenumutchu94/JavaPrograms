package LogicalProgramsNew;

import java.util.ArrayList;
import java.util.HashSet;

public class StringEx {

	public static void main(String[] args) {
			
		//Input : My first name is Varsha and my last name is Ramalingam
		//Output: ramalingam is name last my and varsha first
		
		String s="My first name is Varsha and my last name is Ramalingam";
		
		String[] str=s.split(" ");
		String reverse="";
		
		for(int i=str.length-1;i>=0;i--)
		{
			String string=str[i];
			reverse+=string+" ";
			
		}System.out.println(reverse);
		
		String str1[]=reverse.split(" ");
		ArrayList<String> al=new ArrayList<String>();
		
		for(int i=0;i<str1.length;i++)
		{
			al.add(str1[i]);
			
		}System.out.println(al);
		for(int i=0;i<al.size();i++)
		{
		
			for(int j=i+1;j<al.size();j++) {
				if(al.get(i).equalsIgnoreCase(al.get(j)))
				{
					al.remove(al.get(j));
				}
			}
			
		}System.out.println(al);
		
	}

}
