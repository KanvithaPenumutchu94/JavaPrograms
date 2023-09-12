package Strings;

public class RemoveWhiteSpacesInString3 {

	public static void main(String[] args) {

		String s="India  is  my  Country";
		String temp="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
				temp=temp+s.charAt(i);
			}
			
		}System.out.println(temp);

	}

}
