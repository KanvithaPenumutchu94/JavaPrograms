package JavaLogics;

public class PrintDuplicatesInIntArray{

	public static void main(String[] args) {
		//This logic is applicable for two duplicates are present
		Integer a[]= {1,2,3,1,5};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]+" is duplicate");
				}
			}
		}
		
	}

}
