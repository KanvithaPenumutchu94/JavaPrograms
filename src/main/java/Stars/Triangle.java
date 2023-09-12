package Stars;

public class Triangle {

	public static void main(String[] args) 
	{
		/*starts from below line
		    *
		   ***
		  *****
		 *******
		*********
		 ends with above line*/
		
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
	}

}
