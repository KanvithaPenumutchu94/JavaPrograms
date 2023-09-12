package Arrays;

public class DuplicatesInArray {

	public static void main(String[] args) 
	{
	   int a[]= {1,1,2,3,4,5,5};
	   int flag=0;
	   
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
		   {
			   if(a[i]==a[j])
			   {
				   System.out.println("the duplicate value is "+a[i]);
				  // System.out.println("the duplicate value at "+i);
				   flag=1;
				   break;
			   }
		   }
	   }
	   if(flag==0)
	   {
		   System.out.println("no Duplicates in array");
	   }
	}

}
