package LogicalProgramsNew;

public class CountEvenOddDigitsInNumber {

	public static void main(String[] args) 
	{
		int num=5415;
		int num1=0;
		int evencount=0;
		int oddcount=0;
		
		while(num!=0)
		{
			num1=num%10;
			if(num1%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num=num/10;
		}System.out.println("even count is: "+evencount);
		System.out.println("odd count is: "+oddcount);
		
	
	}

}
