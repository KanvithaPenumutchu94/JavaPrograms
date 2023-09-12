package InterviewPrograms;

public class RemoveParticularCharFromString2 {

	public static void main(String[] args) {
		
		String s="CloudTech";
		String output="";
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='c' && s.charAt(i)!='C') {
				output=output+s.charAt(i);
			}
		}System.out.println(output);
	}

}
