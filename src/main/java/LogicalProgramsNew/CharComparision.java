package LogicalProgramsNew;

public class CharComparision {

	public static void main(String[] args) 
	{
		char c='a';
		char c1='a';
		
		int compare=Character.compare(c, c1);
		if(compare==0)
		{
			System.out.println("Characters are equal");
		}
		else
		{
			System.out.println("Characters are not equal");
		}
	
	}

}
