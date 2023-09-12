package LogicalPrograms;

public class AddMiddleDigitsInNum {

	public static void main(String[] args) 
	{
		int a1 = 123344;
		int a = a1;
		int middle = 0;
		int noOfDigits = 0;

		while (a1 != 0) {
		    a1 = a1 / 10;
		    noOfDigits++;
		}
		if (noOfDigits % 2 == 1) {
		    for (int i = 0; i < (noOfDigits / 2) + 1; i++) {
		        middle = a % 10;
		        a = a / 10;
		    }
		    System.out.println(middle);
		} else {
		    System.out.println("No mid existing");
		}
	
	}

}
