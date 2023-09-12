package JavaConvertions;

import java.util.Scanner;

public class BinaryToInteger3 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number");
		int n=sc.nextInt();
		int decvalue=0;
		int base=0;
		int temp=n;
		while(temp!=0)
		{
			int lastdigit=temp%10;
			temp=temp/10;
			decvalue=(int)(decvalue+lastdigit*Math.pow(2, base));
			base=base+1;
		}System.out.println(n+" becimal value is "+decvalue);

	}

}
