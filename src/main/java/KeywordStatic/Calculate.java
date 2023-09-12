package KeywordStatic;

public class Calculate {
	static int cube(int x)
	{
		return x*x*x;
	}
	public static void main(String[] args) {
		
		//Calculate c=new Calculate(); 
		//no need to create to object because method is static
		//we can call by using class name directly 
		System.out.println(Calculate.cube(5));

	}

}
