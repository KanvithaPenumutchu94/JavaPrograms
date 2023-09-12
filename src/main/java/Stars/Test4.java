package Stars;

public class Test4 {

	public static void main(String[] args) 
	{
		/*starts from below line
		 *
		 **
		 ***
		 ****
		 *****
		 ends with above line*/
		
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
	}

}
