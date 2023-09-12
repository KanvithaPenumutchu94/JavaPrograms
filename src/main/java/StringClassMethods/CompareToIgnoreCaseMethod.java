package StringClassMethods;

public class CompareToIgnoreCaseMethod {

	public static void main(String[] args) 
	{
		String s1="hello";  
		String s2="Hello";  
		String s3="Meklo";  
		String s4="hemlo";  
		String s5="flag"; 
		
		//using compareToIgnoreCase()
		System.out.println(s1.compareToIgnoreCase(s2));//0 because both are equal even though small h and capital H  
		System.out.println(s1.compareToIgnoreCase(s3));//-5 because "h" is 5 times lower than "M" but it consider as small because we use ignorecase  
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		
	}

}
