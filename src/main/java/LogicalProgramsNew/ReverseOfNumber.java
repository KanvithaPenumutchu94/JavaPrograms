package LogicalProgramsNew;

public class ReverseOfNumber {

	public static void main(String[] args) 
	{
		//Reverse of a number
		
		int num=541;
		
		while(num!=0)
		{
			int reversenumber=0;
			reversenumber=num%10;
			num=num/10;
			System.out.print(reversenumber);
					
		}		
		
	}

}
