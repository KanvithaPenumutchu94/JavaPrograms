package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ExtractEvenOddNumberInArray {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		List<Integer> l=new ArrayList<Integer>();
		List<Integer> l1=new ArrayList<Integer>();
		for(int i:a)
		{
			if(i%2==0)
			{
				l.add(i);
			}
			else
			{
				l1.add(i);
			}
		}System.out.println("even numbers from array: "+l);
		System.out.println("odd numbers from array: "+l1);
	}

}
