package Arrays;

public class MaxElementInArray {

	public static void main(String[] args)
	{
		int a[]= {1,2,3,4,5};
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("max element is :"+max);
	
	}

}
