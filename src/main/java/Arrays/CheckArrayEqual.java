package Arrays;

public class CheckArrayEqual {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5};
		int a2[]= {10,2,3,4,5};
		int flag=0;
		
		if(a1.length==a2.length)
		{
			for(int i=0;i<a1.length;i++)
			{
				if(a1[i]!=a2[i])
				{
					flag=1;
					break;
				}
			}
		}
		else
		{
			flag=1;
		}
		if(flag==0)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}

	}

}
