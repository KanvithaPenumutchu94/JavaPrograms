package InterviewPrograms;

import java.util.Arrays;

public class ArrayRelated {

	public static void main(String[] args) {
		// input ={10,20,30,40,50}
		//sum=150
		//output={160,170,180,190,200}
		
		int a[]={10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}System.out.println(sum);
		
		int arr[]=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++)
		{
			arr[index]=sum+a[i];
			index++;
		}System.out.println(Arrays.toString(arr));

	}

}
