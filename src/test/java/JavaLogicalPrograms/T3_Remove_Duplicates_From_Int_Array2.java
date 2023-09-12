package JavaLogicalPrograms;

import java.util.Arrays;

public class T3_Remove_Duplicates_From_Int_Array2 {

	public static void main(String[] args) {
		
		int a[]= {1,3,5,1,3,1,6,2,5,9,8};
		
		Arrays.sort(a);
		int len=a.length;
		int[] temp=new int[len];
		int j=0;
		
		for(int i=0;i<len-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				temp[j++]=a[i];
			}
		}
		temp[j++]=a[len-1];
		
		for(int k=0;k<j;k++)
		{
			System.out.print(temp[k]+" ");
		}
	}

}
