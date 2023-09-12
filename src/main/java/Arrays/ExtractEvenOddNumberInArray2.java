package Arrays;

public class ExtractEvenOddNumberInArray2 {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		
		System.out.print("even num are: ");
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]%2==0)
			{
				System.out.print(" "+a[i]);
			}
		}
		System.out.print("odd num are: ");
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]%2==0)
			{
				System.out.print(" "+a[i]);
			}
		}
	}

}
