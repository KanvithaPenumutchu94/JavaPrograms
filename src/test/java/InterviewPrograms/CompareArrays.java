package InterviewPrograms;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {
		
		int a[]= {2,3,4,5,6};
		int b[]= {3,2,4,5,1};
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		int flag=0;
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]!=b[i])
				{
					flag=1;
					break;
				}
			
			}
			if(flag==0)
			{
				System.out.println("Two arrays are equal");
			}else {
				System.out.println("Two arrays are not equal");
			}
		}else {
			System.out.println("Arrays lengths are not equal");
		}
	}

}
