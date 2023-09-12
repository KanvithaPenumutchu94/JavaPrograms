package StringSplit;

public class SplitWithRegexAndLength3 {

	public static void main(String[] args) 
	{
		String str="Automation Test Scripts";
		
		for(String s:str.split("t", 0))
		{
			System.out.println(s);
		}
		
		
	}

}
