package JavaLogicalPrograms;

public class T11_Reverse_Of_String_Array {

	public static void main(String[] args) {
		
		String s[]= {"kanni","venki","ram"};
		
		for(int i=0;i<s.length;i++)
		{
			String str=s[i];
			String rev="";
			for(int j=str.length()-1;j>=0;j--)
			{
				rev+=str.charAt(j);
			}System.out.println(rev);
		}
	}

}
