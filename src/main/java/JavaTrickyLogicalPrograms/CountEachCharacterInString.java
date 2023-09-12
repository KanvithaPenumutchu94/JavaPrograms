package JavaTrickyLogicalPrograms;

public class CountEachCharacterInString {

	public static void main(String[] args) {
		
		String s="Thanvish Ram is my son";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			int count=0;
			
			for(int j=0;j<=i;j++)
			{
				char ch1=s.charAt(j);
				if(ch==ch1)
				{
					count++;
				}
				
			}System.out.println(ch+" character is: "+count);
			
		}
	
	}

}
