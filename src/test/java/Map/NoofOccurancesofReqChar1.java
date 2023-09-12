package Map;

import java.util.Scanner;

public class NoofOccurancesofReqChar1 {

	public static void main(String[] args) {
		//No of occurances of required character
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentance");
		String sen=sc.nextLine();
		//Take a char
		System.out.println("Enter a character");
		char c=sc.nextLine().charAt(0);
		sc.close();//optional
		
		//count of occurances
		String temp1=sen;
		int len1=temp1.length();//get count of char in that string
		System.out.println(len1);
		String temp2="";
		temp2=temp1.replace(temp1.valueOf(c), "");
		int len2=temp2.length();
		System.out.println(len2);
		System.out.println(c+" occured in: "+(len1-len2)+" times");
		
	}

}
