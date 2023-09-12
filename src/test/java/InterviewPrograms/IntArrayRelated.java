package InterviewPrograms;

public class IntArrayRelated {

	public static void main(String[] args) {
		int a[]= {0,1,1,0,1,0,1,1,1,0,0};
		int zerocount=0;
		int onecount=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				zerocount++;
			}else {
				onecount++;
			}
		}System.out.println("zero count is :"+zerocount);
		System.out.println("one count is :"+onecount);
		
		

	}

}
