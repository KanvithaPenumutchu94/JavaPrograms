package WrapperClasses;

public class CallByValue2 {
	
	public static void test(int xCopy)
	{
		xCopy=20;
	}

	public static void main(String[] args) {
		
		int x=10;
		test(x);
		System.out.println(x);
	}
	
	

}
