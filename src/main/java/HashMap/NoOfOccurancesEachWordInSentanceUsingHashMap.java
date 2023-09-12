package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NoOfOccurancesEachWordInSentanceUsingHashMap {

	public static void main(String[] args) 
	{
		//Write a program to find the no of occurrences of each word in sentence using hashmap
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str=sc.nextLine(); //shame shame puppy puppy shame
		str=str.toLowerCase();
		
		String[] str1=str.split(" ");
		//Remove Special characters in words
		for(int i=0;i<str1.length;i++)
		{
			for(int j=0;j<str1[i].length();j++)
			{
				char c=str1[i].charAt(j);
				if(!Character.isAlphabetic(c) && !Character.isDigit(c))
				{
					String s=c+"";
					str1[i]=str1[i].replace(s, "");//special char replace with null
				}
			}
		}
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		for(int i=0;i<str1.length;i++)
		{
			if(hm.containsKey(str1[i]))
			{
				hm.put(str1[i], hm.get(str1[i])+1);
			}
			else
			{
				hm.put(str1[i], 1);
			}
		}
		System.out.println(hm);
		

	}

}
