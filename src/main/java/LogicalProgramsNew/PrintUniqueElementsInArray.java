package LogicalProgramsNew;

public class PrintUniqueElementsInArray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,1,2};
		//int a1[]=new int[a.length];
		
		System.out.print("Unique elements are: ");
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					//System.out.print(a[i]+" ");
				}
				else {
					System.out.print(a[i]+" ");
				}
			}
		}

	}

}
