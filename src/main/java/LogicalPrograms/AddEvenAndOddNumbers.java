package LogicalPrograms;

import java.util.ArrayList;

public class AddEvenAndOddNumbers {

	public static void main(String[] args) 
	{
		int num=12345;
		int enc=0;
		int onc=0;
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		while(num!=0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				al.add(rem);
				enc+=rem;
			}
			else
			{
				al1.add(rem);
				onc+=rem;
			}
			num=num/10;
		}
		System.out.println("even num are" +al + "  and sum="+enc);
		System.out.println("odd num are "+al1 + "  and sum="+onc);

	}

}
