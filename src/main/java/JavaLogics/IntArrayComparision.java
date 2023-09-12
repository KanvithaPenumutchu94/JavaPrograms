package JavaLogics;

public class IntArrayComparision 
{
	public static void arrayComparision(int a1[],int a2[])
	{
		int count=0;
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]==a2[i])
				{
					count++;		
				}				
			}
			if(count==a1.length)
			{
				System.out.println("Arrays are equal");
			}
			else {
				System.out.println("Arrays are not equal");
			}
		}
		else
		{
			System.out.println("Arrays lengths are not equal");
		}
	}

	public static void main(String[] args)
	{
		int a1[]= {1,2,3,4,6,5};
		int a2[]= {1,2,3,4,5};
		arrayComparision(a1,a2);
		
	}

}
