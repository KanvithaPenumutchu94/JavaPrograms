package LogicalPrograms;

public class CountSumOfDigitInNum {

	public static void main(String[] args) 
	{
		int num=12345;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		System.out.println("Sum of all digits in a number "+sum);
	
	}

}
