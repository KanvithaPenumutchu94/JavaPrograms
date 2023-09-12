package Arrays;

import java.util.ArrayList;

public class ReverseOfIntArray2 {

	public static void main(String[] args)
	{
		int a[]= {1234,5678};
		
		for(int i=0;i<=a.length-1;i++)
		{
			ArrayList<Integer> al=new ArrayList<Integer>();
			int num=a[i];
			int rem=0;
			
			/*int count=0;
			System.out.println("number is "+num);
			while(num!=0)
			{
				num=num/10;
				count++;
			}System.out.println("count of the num is "+count);*/
			while(num!=0)
			{
				rem=num%10;
				al.add(rem);
				num=num/10;
			}
			//System.out.println(al);
			Integer[] array = al.toArray(new Integer[0]);	
			for(Integer value:array)
			{
				System.out.print(value);
			}
			 		
		}
	}

}
