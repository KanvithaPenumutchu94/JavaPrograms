package UniqueLogicalPrograms;

import java.util.Arrays;

public class Array_Related2 {

	public static void main(String[] args) {
		
		//output=[1, 2, 5, 9, 10, 15, 20, 21, 100, 101]

		int a[]= {2,1,20,21,5,15,100,101,9,10};
		
		for(int i=0;i<a.length-1;i++)
		{
			int b=a[i];
			int	c=a[i+1];
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}System.out.println(Arrays.toString(a));

	}

}
