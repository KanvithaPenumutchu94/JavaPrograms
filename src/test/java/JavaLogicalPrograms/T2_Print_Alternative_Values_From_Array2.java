package JavaLogicalPrograms;

public class T2_Print_Alternative_Values_From_Array2 {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,7,9};
		int b[]= {2,4,6,8,10};
		
		int al=a.length;
		int bl=b.length;
		int l=al+bl;
		//System.out.println(l);
	
		
		int temp[]=new int[l];
		int k=0;
		
		for(int i=0;i<a.length;i++)
		{
			temp[k++]=a[i];
			temp[k++]=b[i];
		}
		
		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]+" ");
		}
		
		
		
	}

}
