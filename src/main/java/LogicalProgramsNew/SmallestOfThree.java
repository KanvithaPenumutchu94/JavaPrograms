package LogicalProgramsNew;

public class SmallestOfThree {

	public static void main(String[] args)
	{
		int a=10,b=20,c=30;
		
		int small1=a<b?a:b;
		int small2=c<small1?c:small1;
		System.out.println("small number is "+small2);

	}

}
