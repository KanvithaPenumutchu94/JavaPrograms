package JavaLogics;

public class StringPalindrome {

	public static void main(String[] args) {
	
		String s="madam";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev+=s.charAt(i);
		}
		if(s.equals(rev))
		{
			System.out.println("Given string is palindrome");
		}
		else {
			System.out.println("Given string is not palindrome");
		}

	}

}
