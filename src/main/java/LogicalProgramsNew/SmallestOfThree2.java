package LogicalProgramsNew;

public class SmallestOfThree2 {

	public static void main(String[] args)
	{
		int a=10,b=20,c=5;
		
		
		if(a<b && a<c)
		{
			System.out.println("small number is "+a);
		}
		else if(b<c && b<a)
		{
			System.out.println("small number is "+b);
		}
		else
		{
			System.out.println("small number is "+c);
		}

	}

}
