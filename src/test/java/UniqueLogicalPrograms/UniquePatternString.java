package UniqueLogicalPrograms;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniquePatternString {

	public static void main(String[] args) {
		// 1a2b4c op=abbcccc
		// 1a11b2cd op=abbbbbbbbbbbcdcd
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance");
		String sen=sc.nextLine();
		//separate digits and chars
		ArrayList<Integer> sizes=new ArrayList<Integer>();
		ArrayList<String> displays=new ArrayList<String>();
		
		String x="[0-9]+";
		Pattern p1=Pattern.compile(x);
		Matcher m1=p1.matcher(sen);
		while(m1.find())
		{
			System.out.println(m1.group());
			sizes.add(Integer.parseInt(m1.group()));
		}
		
		String y="[a-zA-Z]+";
		Pattern p2=Pattern.compile(y);
		Matcher m2=p2.matcher(sen);
		while(m2.find())
		{
			System.out.println(m2.group());
			displays.add(m2.group());
		}
		
		//display output
		String output="";
		for(int i=0;i<sizes.size();i++)
		{
			int l=sizes.get(i);
			String s=displays.get(i);
			for(int j=0;j<l;j++)
			{
				output+=s;
			}
		}System.out.println(output);

	}

}
