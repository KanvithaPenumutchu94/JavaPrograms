package JavaLogicalPrograms;

public class T8_Print_Alternative_Values_From_Arrays {

	public static void main(String[] args) {
		
		/*//Array lengths are equal
		int a[]= {1,3,5};
		int b[]= {2,4,6};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			System.out.print(b[i]+" ");
		}*/
		
		//Array lengths are not equal
		int a[]= {1,3,5,7};
		int b[]= {2,4,6};
		
		
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			int x=a[i];
			System.out.print(a[i]+" ");
			for(int j=i;j<b.length;j++)
			{
				int y=b[i];
				System.out.print(b[i]+" ");
				count++;
				if(count==1)
				{
					break;
				}
			}
		}
		
		/*//Array lengths are not equal
		int a[]= {1,3,5,7};
		int b[]= {2,4,6,8,9};
		
		
		for(int i=0;i<b.length;i++)
		{
			int count=0;
			int x=b[i];
			for(int j=i;j<a.length;j++)
			{
				int y=a[i];
				System.out.print(a[i]+" ");
				count++;
				if(count==1)
				{
					break;
				}
			}
			System.out.print(b[i]+" ");
					
		
		}*/

	}

}
