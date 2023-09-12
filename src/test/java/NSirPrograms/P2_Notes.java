package NSirPrograms;

public class P2_Notes {
	
	// x++(PostIncrement) or ++x(PreIncrement) are individual statements, meaning is same
	//if x++ or ++x are combined with some other code(if you write as a compound statement), meaning different
	//i.e x++ means first x releasing and then increment will happen
	//and ++x means first increment will happen and then releasing
	
	public static void main(String[] args) {
		
		int a=10;
		a++;
		System.out.println(a);//11
		
		int b=10;
		++b;
		System.out.println(b);//11
		
		int c=10;
		System.out.println(c++);//10
		//c++ combined with some other code i.e System.out.println();
		//So,first value releasing and then increment will happen
		//so op is 10
		
		int d=10;
		System.out.println(++d);//11
		//++d combined with some other code i.e System.out.println();
		//So,first increment will happen and then value releasing
		//so op is 11
	}
	

}
