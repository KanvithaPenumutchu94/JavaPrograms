package Stars;

public class HourGlassInSpace {

	public static void main(String[] args) 
	{
		/*output starts from below line
***** *****
****   ****
***     ***
**       **
*         *
**       **
***     ***
****   ****
***** *****
		ends with above line */
		//lower rectangle
				for(int i=4;i>=1;i--)
				{
					// for left *s
					for(int k=4;k>=i;k--)
					{
						System.out.print("*");
					}
					// for middle spaces
					for(int j=1;j<(i*2);j++)
					{
						System.out.print(" ");
					}
					//for right *s
					for(int k=4;k>=i;k--)
					{
						System.out.print("*");
					}
					
				System.out.println();	
				}
		//upper rectangle
		for(int i=2;i<=5;i++)
		{
			//left *s
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			//middle spaces
			for(int j=1;j<(i*2);j++)
			{
				System.out.print(" ");
			}
			//right *s 
			for(int l=4;l>=i;l--)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
	}

}
