package WrapperClasses;

public class BoxingORAutoBoxing {

	public static void main(String[] args) {
		//Boxing: Converting Primitive to corresponding Objective wrapper classes 
		
		int a=100;
		
		Integer b=a;
		System.out.println(b);
		
		// Auto Boxing
		
		int i=10;
		Integer j=Integer.valueOf(i);
		System.out.println(j);

	}

}
