package InterviewPrograms;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,7,8,9,10};
		
		int sum1=(10*11)/2;
		int sumofarray=0;
		
		for(int i=0;i<a.length;i++) {
			sumofarray=sumofarray+a[i];
		}
		
		System.out.println("Missing no is :"+ (sum1-sumofarray));
		
		
	}

}
