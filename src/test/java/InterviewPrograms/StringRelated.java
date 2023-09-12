package InterviewPrograms;

public class StringRelated {

	public static void main(String[] args) {
		String s[]= {"ab","aba","xyz","mno","xyx","pop"};
		//output=aba,xyx,pop(print string which are starts and ends with same character
		
		for(int i=0;i<s.length;i++)
		{
			String str=s[i];
			char start=str.charAt(0);
			char end=str.charAt(str.length()-1);
			//System.out.println(start);
			//System.out.println(end);
			
			if(start==end)
			{
				System.out.println(s[i]);
			}
		}

	}

}
