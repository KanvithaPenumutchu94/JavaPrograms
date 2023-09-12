package Strings;

public class SplitMethod {

	public static void main(String[] args) {
	
		
		String s="India is my Country";
		String str[]=s.split("\\s");
		for(int i=0;i<str.length;i++) 
		{
			System.out.print(str[i]);
		}

	}

}
