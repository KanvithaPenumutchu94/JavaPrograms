package KeywordFinal;

public class FinalVariable {
	final int x=10;
	void method()
	{
		x=20;
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		FinalVariable fv=new FinalVariable();
		fv.method();
		
		

	}

}
