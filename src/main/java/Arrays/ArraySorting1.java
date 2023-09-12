package Arrays;

import java.util.Arrays;

public class ArraySorting1 {
	public static void main(String[] args)
	{
		int[] a= {10,2,4,5,6};
		System.out.println("Elements before sorting "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Elements after sorting "+Arrays.toString(a));
	}

}
