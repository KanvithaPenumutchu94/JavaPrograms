package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondHighestNumInArray {

	public static void main(String[] args) {
		
		int a[]= {12,45,32,100};
		Arrays.parallelSort(a);
		System.out.println("Elements after sorting "+Arrays.toString(a));
		List<Integer> l=new ArrayList<Integer>();
		for(int a1:a)
		{
			l.add(a1);
		}
		System.out.println(l);
		System.out.println("Second highest number: "+l.get(l.size()-2));
			
		

	}

}
