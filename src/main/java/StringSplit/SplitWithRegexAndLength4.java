package StringSplit;

public class SplitWithRegexAndLength4 {

	public static void main(String[] args) 
	{
		String str="javatpointtt";
		
		for(String s:str.split("t", 0))
		{
			System.out.println(s);
		}
		
		
	}

}
