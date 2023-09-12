package SandeepInfosisTest;

public class Test1 {

	public static void main(String[] args) {
		
		In c1=(int i,int j)->j+i;
		In c2=(int i,int j)->j*i;
		System.out.println(c1.calculate(10, 20));
		System.out.println(c2.calculate(5, 2));
	}

}
