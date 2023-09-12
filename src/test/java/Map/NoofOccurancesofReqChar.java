package Map;

import java.util.Scanner;

public class NoofOccurancesofReqChar {

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
		int count=0;
		for(int i=0;i<sen.length();i++)
		{
			if(c==sen.charAt(i))
			{
				count++;
			}
		}System.out.println(c+" occured in: "+count+" times");
	}

}
