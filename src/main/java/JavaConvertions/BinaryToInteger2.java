package JavaConvertions;

import java.util.Scanner;

public class BinaryToInteger2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number");
		int n=sc.nextInt();
		int decvalue=0;
		//initilizing base value to 1, means Math.pow(2,0) is 1
		int base=1;
		int temp=n;
		while(temp!=0)
		{
			int lastdigit=temp%10;
			temp=temp/10;
			decvalue+=lastdigit*base;
			base=base*2;
		}System.out.println(n+" becimal value is "+decvalue);

	}

}
