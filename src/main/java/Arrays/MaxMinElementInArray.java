package Arrays;

public class MaxMinElementInArray {

	public static void main(String[] args) 
	{
		int a[]= {15,2,3,4,5};
		int len=a.length;
	
		int max=a[0];
		int min=a[len-1];
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}System.out.println("max num is: "+max);
		
		for(int i=len-2;i>=0;i--)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}System.out.println("min num is: "+min);

	}

}
