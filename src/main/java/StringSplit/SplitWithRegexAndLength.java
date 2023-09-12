package StringSplit;

public class SplitWithRegexAndLength {

	public static void main(String[] args) 
	{
		String str="Automation Test Scripts";
		
		for(String s:str.split(" ", 0))
		{
			System.out.println(s);
		}System.out.println();
		
		for(String s:str.split(" ", 1))
		{
			System.out.println(s);
		}System.out.println();
		
		for(String s:str.split(" ", 2))
		{
			System.out.println(s);
		}System.out.println();
		
		for(String s:str.split(" ", 3))
		{
			System.out.println(s);
		}System.out.println();
		
		for(String s:str.split(" ", 4))
		{
			System.out.println(s);
		}System.out.println();

	}

}
