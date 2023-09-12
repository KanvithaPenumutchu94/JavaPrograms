package Constructor;

public class RunnerTest {

	public static void main(String[] args) {
		
		Test obj=Test.createObject();
		System.out.println(obj.x);
		System.out.println(obj.y);
		System.out.println(obj.name);
	}

}
