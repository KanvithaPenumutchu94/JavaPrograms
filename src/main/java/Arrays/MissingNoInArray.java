package Arrays;

public class MissingNoInArray {

	public static void main(String[] args) 
	{
	   int a[]= {1,2,3,4,6};
	   int len=a.length;
	   System.out.println(len);
	   
	   int sum1=0;
	   for(int i=0;i<a.length;i++)
	   {
		   sum1=sum1+a[i];
	   }System.out.println(sum1);
	   
	   int sum2=0;
	   for(int i=1;i<=a.length+1;i++)
	   {
		   sum2=sum2+i;
	   }System.out.println(sum2);
	   
	   System.out.println("Missing no is "+ (sum2-sum1));
	}

}
