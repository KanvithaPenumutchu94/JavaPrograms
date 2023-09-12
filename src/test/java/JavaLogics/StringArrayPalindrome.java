package JavaLogics;

public class StringArrayPalindrome {

	public static void main(String[] args) {
	
		String s[]= {"madam","camera","cicic"};
		
		for(int i=0;i<s.length;i++)
		{
			String str=s[i];
			String rev="";
			for(int j=str.length()-1;j>=0;j--)
			{
				rev+=str.charAt(j);
			}
			if(str.equals(rev))
			{
				System.out.println(str+" is palindrome");
			}
			else {
				System.out.println(str+" is not palindrome");
			}
		}

	}

}
