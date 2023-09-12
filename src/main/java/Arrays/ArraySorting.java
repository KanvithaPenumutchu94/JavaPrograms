package Arrays;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) 
	{
		int[] num= {1,2,4,5,3};
		//System.out.println(num.length);
		
		System.out.print("Elements before sorting = ");
		System.out.print("[");
		for(int i=0;i<num.length;i++)
		{
			if(i==num.length-1)
			{
				System.out.print(num[i]);
			}
			else 
			{
				System.out.print(num[i]+", ");	
			}
		}System.out.print("]");
		
		Arrays.sort(num);
		System.out.println();
		
		System.out.print("Elements after sorting = ");
		System.out.print("[");
		for(int i=0;i<num.length;i++)
		{
			if(i==num.length-1)
			{
				System.out.print(num[i]);
			}
			else 
			{
				System.out.print(num[i]+", ");	
			}
		}System.out.print("]");
		System.out.println();
		
		//System.out.println("Elements before sorting = "+Arrays.toString(num));
		//Arrays.sort(num);
		//System.out.println("Elements after sorting = "+Arrays.toString(num));
			

	}

}
