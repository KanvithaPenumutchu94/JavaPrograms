package JavaLogicalPrograms;

public class T1_Print_chars_In_String {

	public static void main(String[] args) {
		//op=abbccc
		
		String s="a1b2c3";
		
		for(int i=0;i<s.length();i++)
		{
			int num=Integer.parseInt(String.valueOf(s.charAt(i+1)));
			for(int j=0;j<num;j++)
			{
				System.out.println(s.charAt(i));
			}
			i++;
		}
		
	}

}
