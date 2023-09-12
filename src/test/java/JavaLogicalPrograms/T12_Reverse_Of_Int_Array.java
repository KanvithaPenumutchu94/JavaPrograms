package JavaLogicalPrograms;

public class T12_Reverse_Of_Int_Array {

	public static void main(String[] args) {
		
		int a[]= {1234,5678};
		
		for(int i=0;i<a.length;i++)
		{
			int num=a[i];
			int op=0;
			int rem=0;
			while(num>0)
			{
				rem=num%10;
				op=(op*10)+rem;
				num=num/10;
				
			}System.out.println(op);
		}
	}

}
