package LogicalProgramsNew;

public class LargestOfThreeNumbers2 {

	public static void main(String[] args)
	{
		int a=10, b=20,c=30;
		
		int largest1=a>b?a:b;	
		int largest2=c>largest1?c:largest1;
		
		System.out.println(largest2+" is largest number");
		
		
	}

}
