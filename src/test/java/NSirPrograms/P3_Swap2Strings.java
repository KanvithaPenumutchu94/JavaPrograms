package NSirPrograms;

import java.util.Scanner;

public class P3_Swap2Strings {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String s1=sc.nextLine();
		System.out.println("enter a String");
		String s2=sc.nextLine();
		System.out.println("Before swap: "+s1+"  "+s2);
		String temp="";
		temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("After swap: "+s1+"  "+s2);
		
		
	}

}
