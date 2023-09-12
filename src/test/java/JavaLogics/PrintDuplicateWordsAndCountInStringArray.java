package JavaLogics;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateWordsAndCountInStringArray {

	public static void main(String[] args) {
			
		String s[]= {"ram","ram","sita","sita","sita","hanuma","hanuma","lakshman"};
		
		ArrayList<String> al=new ArrayList<String>();
		
		for(String ss:s)
		{
			al.add(ss);
		}System.out.println(al);
		
		Set<String> hs=new HashSet<String>(al);
		System.out.println(hs);
		ArrayList<String> al1=new ArrayList<String>(hs);
		System.out.println(al1);
		
		for(int i=0;i<al1.size();i++)
		{
			int count=0;
			String str1=al1.get(i);
			for(int j=0;j<s.length;j++)
			{
				String str2=s[j];
				if(str1.equals(str2))
				{
					count++;
				}
			}System.out.println(str1+"....."+count);
		}
		
	}

}
