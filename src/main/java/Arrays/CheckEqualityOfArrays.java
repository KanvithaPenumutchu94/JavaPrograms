package Arrays;

public class CheckEqualityOfArrays {

	public static void main(String[] args)
	{	
		int a[]= {1,2,3,4,5};
		int a1[]= {1,2,3,4,6,7};
		int count=0;
		
		if(a.length==a1.length)
		{
			System.out.println("Arrays length are equal");
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==a1[i])
				{
					count++;
				}
			}if(count==a.length)
			{
				System.out.println("Arrays are equal");
			}else
			{
				System.out.println("Arrays are not equal");
			}
		}
		else
		{
			System.out.println("Arrays length and arrays are not equal");
		}
	
	}

}
