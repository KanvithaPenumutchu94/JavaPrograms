package Strings;

public class RemoveWhiteSpacesInString1 {

	public static void main(String[] args) {

		String str="India  is  my  Country";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			if(Character.isSpace(c))
			{
				String s=c+"";
				str=str.replace(s, "");
			}
		}System.out.println(str);

	}

}
