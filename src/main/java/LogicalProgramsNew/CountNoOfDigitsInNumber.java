package LogicalProgramsNew;


public class CountNoOfDigitsInNumber {

	public static void main(String[] args) 
	{
		//Count no of digits in a number
		
		int num=541;
		int count=0;
		
		while(num!=0)
		{
			num=num/10;
			count++;
		}System.out.println(count);
		
	
		
		
		
	}

}
