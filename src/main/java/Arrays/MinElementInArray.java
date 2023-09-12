package Arrays;

public class MinElementInArray {

	public static void main(String[] args)
	{
		int a[]= {2,1,3,4,5};
		int min=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println("max element is :"+ min);
	
	}

}
