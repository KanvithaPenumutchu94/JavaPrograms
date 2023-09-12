package UniqueLogicalPrograms;

public class Array_Related {

	public static void main(String[] args) {
		
		//output=1 2 20 21 100 101 9 10

		int a[]= {2,1,20,21,5,15,100,101,9,10};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				int x=a[i];
				int y=a[j];
				if(x==(y-1))
				{
					System.out.println(x+" "+y);
				}
			}
		}

	}

}
