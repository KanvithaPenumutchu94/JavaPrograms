package Stars;

public class HourGlass {

	public static void main(String[] args) 
	{
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
		for(int i=2;i<=5;i++)
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
