package InterviewQuestions;

public class Compare2StringContainsSameChar {
	public static void main(String[] args) {
		
		String s1="cat";
		String s2="act";
		int count=0;
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=0;j<s2.length();j++)
			{
				if(s1.charAt(i)==s2.charAt(j))
				{
					count++;
				}
				
			}
		}
		if(count==s1.length())
		{
			System.out.println("two string characters are same");
		}
	}

}
