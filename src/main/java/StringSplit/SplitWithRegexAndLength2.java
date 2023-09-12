package StringSplit;

public class SplitWithRegexAndLength2 {

	public static void main(String[] args) 
	{
		String str="Automation Test Scripts";
		
		for(String s:str.split("", 0))
		{
			System.out.print(s);
		}System.out.println();
		System.out.println();
		
		for(String s:str.split("", 0))
		{
			System.out.println(s);
		}
		
		
	}

}
