package LogicalProgramsNew;

public class PalindromeString {

	public static void main(String[] args)
	{
	
		String s="ram";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			
			rev+=s.charAt(i);
		}System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("given string is a palindrome string");
		}
		else
		{
			System.out.println("given string is not a palindrome string");
		}

	}

}
