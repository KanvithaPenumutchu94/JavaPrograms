package UniqueLogicalPrograms;

import java.util.Arrays;

public class Array_Related3 {

	public static void main(String[] args) {
		
		//output=[101, 100, 21, 20, 15, 10, 9, 5, 2, 1]

		int a[]= {2,1,20,21,5,15,100,101,9,10};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}System.out.println(Arrays.toString(a));

	}

}
