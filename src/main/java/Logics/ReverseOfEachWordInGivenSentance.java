package Logics;

import java.util.Scanner;

public class ReverseOfEachWordInGivenSentance {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance");
		String str=sc.nextLine();
		String[] strarray=str.split(" ");
		String output="";
		
		for(int i=0;i<strarray.length;i++)
		{
			String reverse="";
			String s=strarray[i];
			for(int j=s.length()-1;j>=0;j--)
			{
				reverse+=s.charAt(j);
			}
			output+=reverse+" ";
			
		}System.out.println(output);
		

	}

}
