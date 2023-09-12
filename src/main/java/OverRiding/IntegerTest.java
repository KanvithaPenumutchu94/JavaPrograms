package OverRiding;

public class IntegerTest {

	public static void main(String[] args) {
		
		IntegerParent ap=new IntegerParent();
		ap.integer(5, 5); //Addition of a and b is: 10
		
		IntegerChild ac=new IntegerChild();
		ac.integer(10, 5); //Substraction of a and b is: 5
		

	}

}
