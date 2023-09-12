package ExceptinalHandleing;

public class ThrowKeyword {
	
	public static void validateAge(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("person is not eligible to vote");
		}else {
			System.out.println("person is eligible to vote");
		}
	}

	public static void main(String[] args) {
		
		
		validateAge(55);
		
		validateAge(5);
		
		}

}
