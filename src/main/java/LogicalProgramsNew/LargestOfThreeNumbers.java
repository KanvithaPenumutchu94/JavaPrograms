package LogicalProgramsNew;

public class LargestOfThreeNumbers {

	public static void main(String[] args)
	{
		//Find 1st largest and 2nd largest
		int a=10, b=20,c=30;
		
		if(a>b && a>c)
		{
			//System.out.println("a is largest");
			if(b>c)
			{
				System.out.println("b is 2nd largest");
			}
			else
			{
				System.out.println("c is 2nd largest");
			}
		}
		else if(b>a && b>c)
		{
			//System.out.println("b is largest");
			if(a>c)
			{
				System.out.println("a is 2nd largest");
			}
			else
			{
				System.out.println("c is 2nd largest");
			}
		}
		else {//System.out.println("c is largest");
		if(a>b)
		{
			System.out.println("a is 2nd largest");
		}
		else
		{
			System.out.println("b is 2nd largest");
		}
	
		}
		
	}

}
