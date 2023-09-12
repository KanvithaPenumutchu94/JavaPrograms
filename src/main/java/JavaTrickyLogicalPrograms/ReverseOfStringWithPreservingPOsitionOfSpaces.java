package JavaTrickyLogicalPrograms;

import java.util.Scanner;

public class ReverseOfStringWithPreservingPOsitionOfSpaces {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance");
		String str=sc.nextLine();
		String revstr="";
		String output="";
		for(int i=str.length()-1;i>=0;i--) {
			revstr+=str.charAt(i);
		}
		System.out.println(revstr);
		revstr=revstr.replace(" ", "");
		int j=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				output+=' ';
			}else
			{
				output+=revstr.charAt(j);
				j++;
			}
		}System.out.println(output);
	}

}
