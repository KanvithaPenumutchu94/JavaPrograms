package LogicalPrograms;

import java.util.ArrayList;
import java.util.List;

public class ReverseOfNumber {

	public static void main(String[] args) 
	{
		int i=1234;
		int count=0;
		int rev=0;
		int rem=0;
		List<Integer> al=new ArrayList<Integer>();
		
		/*if(2==2)
		{
			while(i!=0)
			{
				i=i/10;
				count++;
			}System.out.println("count of a number is "+count);
		}
	*/
		
		if(0==0)
		{
			while(i!=0)
			{
				rem=i%10;
				al.add(rem);
				i=i/10;
			}System.out.println("reverse number is "+al);
			
		}
	
	}

}
