package JavaConvertions;

public class StringToCharArray {

	public static void main(String[] args) 
	{
		String s="ram";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			System.out.print(ch[i]);
		}
	}

}
