package JavaTrickyLogicalPrograms;

import java.util.Scanner;

public class ReverseOfGivenStringArray {

	public static void main(String[] args) 
	{
		String str="india is my country";
		System.out.println(str);
			
		String s[]=str.split(" ");
		System.out.println(s.length);
		
		String output="";
		
		for(int i=s.length-1;i>=0;i--)
		{
			output=output+s[i]+" ";
		}
		System.out.println(output);
		

	}

}
