package InterviewPrograms;

import java.util.Arrays;

public class EvenNumComeFirstNextOdd {
	//output={2,4,8,20,1,5,7,11}
	public static void main(String[] args) {
		int a[]= {1,2,5,4,7,8,11,20};
				
		int arr[]=new int[a.length];
		int index=0;
		//adding even numbers first
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				arr[index]=a[i];
				index++;
			}
		}
		//adding odd numbers next
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				arr[index]=a[i];
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
