package SandeepInfosisTest;

import java.util.Set;
import java.util.TreeSet;

public class Test10 {

	public static void main(String[] args) {
		
		Set<String> s=new TreeSet<>();
		s.add("cat");
		s.add("fish");
		s.add("ele");
		s.add("cat"+"fish");
		s.add("ELE");
		s.add("ELE".toLowerCase());
		System.out.println(s);
		
		
	}

}
