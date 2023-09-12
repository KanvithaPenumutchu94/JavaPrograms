package JavaLogics;

public class MinNum
{
	public static void minNum(int x[])
	{
		int min=x[0];
		
		for(int i=1;i<x.length;i++)
		{
			if(min>x[i])
			{
				min=x[i];
			}
		}System.out.println("Min value is: "+min);
	}

	public static void main(String[] args)
	{
		int x[]= {24,21,43,65,99};
		minNum(x);

	}

}
