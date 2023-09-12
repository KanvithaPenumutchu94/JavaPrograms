package NSirPrograms;

import java.util.Scanner;

public class P4_Scanner {

	public static void main(String[] args) {
		//In Scanner class,after integer value,String value wont take from keyboar
		//by default,it is taking "Enter" key as one value
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		System.out.println("Enter a String");
		String y=sc.nextLine();*/
		
		//To avoid above problem,we have to follow below code
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=Integer.parseInt(sc.nextLine());
		System.out.println("Enter a String");
		String y=sc.nextLine();
		
		

	}

}
