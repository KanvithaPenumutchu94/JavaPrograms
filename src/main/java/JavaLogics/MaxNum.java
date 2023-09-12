package JavaLogics;

public class MaxNum
{
	public static void maxNum(int x[])
	{
        int max = x[0];
		
		for(int i=1;i<x.length;i++)
		{
	
			if(max<x[i])
			{
				max=x[i];
			}
		}System.out.println("Max value is: "+max);
	}

	public static void main(String[] args) 
	{
		
		int x[]= {122,211,3};
		maxNum(x);
	
	}

}
