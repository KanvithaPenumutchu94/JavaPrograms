package JavaLogics;

public class FibinaccioSeries {

	public static void main(String[] args) {
		
		int n1=0,n2=1;
		int n3=0;
		int count=10;
		
		System.out.print(n1+" ");
		System.out.print(n2+" ");
		n3=n1+n2;
		System.out.print(n3+" ");
		
		while(count>0)
		{
			n1=n2;
			n2=n3;
			n3=n1+n2;
			System.out.print(n3+" ");
		}
		

	}

}
