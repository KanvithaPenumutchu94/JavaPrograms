package Stars;

public class Diamond {

	public static void main(String[] args) 
	{
		/*starts from below line
		    *
		   ***
		  *****
		 *******
		*********
		 *******
		  *****
		   ***
		    *     
		 ends with above line*/
		//upper triangle
		for(int i=1;i<=5;i++)
		{
			// for spaces
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			// for *
			for(int j=1;j<(i*2);j++)
			{
				System.out.print("*");
			}
		System.out.println();	
		}
		//lower triangle
		for(int i=4;i>=1;i--)
		{
			// for spaces
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			// for *
			for(int j=1;j<(i*2);j++)
			{
				System.out.print("*");
			}
		System.out.println();	
		}
	}

}
