package Arrays;

import java.util.ArrayList;

public class EvenAndOddArray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> al1=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				al.add(a[i]);
			}
			else
			{
				al1.add(a[i]);
			}
		}System.out.println(al+ " are even numbers");
		System.out.println(al1+ " are odd numbers");
	
	}

}
