package JavaLogics;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfOccurancesEachWordInSentance {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String str=sc.nextLine(); //shame shame puppy puppy shame
		
		String[] s=str.split(" ");
		System.out.println(Arrays.toString(s));
		
		for(int i=0;i<s.length;i++)
		{
			int count=0;
			String s1=s[i];
			for(int j=0;j<s.length;j++)
			{
				String s2=s[j];
				if(s1.equals(s2))
				{
					count++;
				}
			}System.out.println(s1+" word repeated in "+count+ "times");
		}
		
	}

}
