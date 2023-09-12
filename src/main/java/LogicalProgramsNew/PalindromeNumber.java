package LogicalProgramsNew;

public class PalindromeNumber {

	public static void main(String[] args)
	{
		int num=1221;
		String s=num+"";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			
			rev+=s.charAt(i);
		}System.out.println(rev);
		
		int ij=Integer.parseInt(rev);
		
		if(num==ij)
		{
			System.out.println("given num is a palindrome number");
		}
		else
		{
			System.out.println("given num is not a palindrome number");
		}

	}

}
