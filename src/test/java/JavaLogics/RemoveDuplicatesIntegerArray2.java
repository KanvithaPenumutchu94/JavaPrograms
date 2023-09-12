package JavaLogics;

import java.util.Arrays;

public class RemoveDuplicatesIntegerArray2 {
	public static void main(String[] args) {
		
		int a[]= {1,4,9,1,3,9,4,9,1};
		Arrays.parallelSort(a);
		System.out.println("Elements after sorting "+Arrays.toString(a));
		int len=a.length;
		System.out.println("length of the array is "+len);
		
		int temp[]=new int[len];
		int j=0;
		
		for(int i=0;i<len-1;i++)
		{
			int x=a[i];
			int y=a[i+1];
			if(a[i]!=a[i+1])
			{
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[len-1];
		for(int k=0;k<j;k++)
		{
			System.out.print(temp[k]+ " ");
		}
	
	}

}
