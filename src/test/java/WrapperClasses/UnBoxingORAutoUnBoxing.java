package WrapperClasses;

public class UnBoxingORAutoUnBoxing {

	public static void main(String[] args) {
		
		//UnBoxing: When we convert object of Wrapper classes into respective primitive types
		
		Integer i=98;
		
		int j=i;
		System.out.println(j);
		
		//Auto-UnBoxing
		
		Integer ii=23;
		
		int jj=ii.intValue();
		System.out.println(jj);
		
		
		

	}

}
