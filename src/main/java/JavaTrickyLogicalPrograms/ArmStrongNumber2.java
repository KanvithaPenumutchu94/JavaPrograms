package JavaTrickyLogicalPrograms;

public class ArmStrongNumber2 {

	public static void main(String[] args) 
	{
		for(int n=100;n<=100000;n++)
		{
			int temp=n;
			int nod=0;
			
			while(temp!=0)
			{
				int rem=temp%10;
				nod++;
				temp=temp/10;
			}//System.out.println("Number of digits in "+n+" is "+nod);
			
		//ArmStrong number
			int temp2=n;
			int value=0;
			while(temp2!=0)
			{
				int d=temp2%10;
				value=(int) (value+Math.pow(d, nod));
				temp2=temp2/10;
			}
			if(value==n)
			{
				System.out.println(n+" is armstrong number"); //1634
			}
			


		}
			}

}
