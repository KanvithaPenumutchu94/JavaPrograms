package UniqueLogicalPrograms;

public class StringRelated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="kanvitha";
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					continue;				
				}else {
					System.out.println(s.charAt(i));
					break;
				}
			}break;
		}

	}

}
