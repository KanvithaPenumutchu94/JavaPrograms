package JavaLogics;

public class CountNoOfSpacesInString {

	public static void main(String[] args) {
		
		
		String s="India is my country";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(Character.isSpace(ch))
			{
				count++;
			}
		}System.out.println(count);
		
	}

}
