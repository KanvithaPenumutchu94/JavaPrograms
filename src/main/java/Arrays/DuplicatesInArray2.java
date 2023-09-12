package Arrays;

public class DuplicatesInArray2 {

	public static void main(String[] args) 
	{
	   int a[]= {1,1,2,3,4,5,5};
	   
	   System.out.print("Duplicate values are: ");
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
		   {
			   if(a[i]==a[j])
			   {
				   System.out.print(" "+a[i]);
			   }
		   }
	   }
	   
	}

}
