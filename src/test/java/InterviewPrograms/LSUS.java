package InterviewPrograms;

import java.util.Scanner;

public class LSUS {

	public static void main(String[] args) {
		// input=thanvish ram thanvish ram
		//output=thanvish ram THANVISH RAM
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=sc.nextLine();*/
		
		String s="thanvish ram thanvish ram";
		String LC="";
		String UC="";
		
		int mid=s.length() / 2;
		
		for(int i=0;i<s.length();i++)
		{
			if(i<mid)
			{
				LC=LC+Character.toLowerCase(s.charAt(i));
			}else {
				UC=UC+Character.toUpperCase(s.charAt(i));
			}
		}System.out.println(LC+UC);
		
		
		


	}

}
