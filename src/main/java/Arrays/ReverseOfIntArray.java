package Arrays;


public class ReverseOfIntArray {

	public static void main(String[] args)
	{
		int a[]= {1234,5678};
		
		for(int i=0;i<=a.length-1;i++)
		{
			int num=a[i];
			
			/*int count=0;
			System.out.println("number is "+num);
			while(num!=0)
			{
				num=num/10;
				count++;
			}System.out.println("count of the num is "+count);*/
			
			int remainder;
			int reverse=0;
			while(num != 0)   
			{  
			remainder = num % 10;  
			reverse = reverse * 10 + remainder;  
			num = num/10;  
			}  
			System.out.println(reverse);  
			 		
		}
	}

}
