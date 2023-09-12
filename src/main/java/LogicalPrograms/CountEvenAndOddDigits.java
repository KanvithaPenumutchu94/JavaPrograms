package LogicalPrograms;

import java.util.ArrayList;
import java.util.List;

public class CountEvenAndOddDigits {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int num=12345;
		int even_count=0;
		int odd_count=0;
		List<Integer> al=new ArrayList<Integer>();
		List<Integer> al1=new ArrayList<Integer>();
		
		while(num>0)
		{
			int rem=num%10;
			if(rem%2==0)
			{
				al.add(rem);
				even_count++;
			}
			else
			{			
				al1.add(rem);
				odd_count++;
			}
			num=num/10;
			
		}
		System.out.println("even numbers are"+al);
		System.out.println("odd numbers are"+al1);
		System.out.println("no of even count is "+even_count);
		System.out.println("no of even count is "+odd_count);
	
	}

}
