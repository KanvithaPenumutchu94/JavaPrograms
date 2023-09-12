package LogicalProgramsNew;

public class SumOfDigitsInNumber {

	public static void main(String[] args) 
	{
		int num=55555;
		int sum=0;
		int num1=0;
		
		while(num!=0)
		{
			num1=num%10;
			sum=sum+num1;
			num=num/10;
		}System.out.println("sum of all digits in a number: "+sum);
	
	}

}
