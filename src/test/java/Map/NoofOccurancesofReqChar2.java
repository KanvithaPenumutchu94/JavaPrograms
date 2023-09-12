package Map;

import java.util.Scanner;

public class NoofOccurancesofReqChar2 {

	public static void main(String[] args) {
		//No of occurances of required character
		String s="india";
		int l1=s.length();
		char ch='i';
		String rem=s.valueOf(ch);
		//String rem=ch+"";
		s=s.replace(rem, "");
		int l2=s.length();
		
		
		System.out.println(ch+" occured in: "+(l1-l2)+" times");
		
	}

}
