package JavaLogics;

public class PrintIntValueFromString2 {

	public static void main(String[] args) 
	{
		String s="Test123";
		String output=s.replaceAll("[^0-9]","");
		
		
		System.out.print(output);
		
	}

}
