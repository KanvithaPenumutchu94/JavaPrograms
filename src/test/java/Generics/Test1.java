package Generics;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add("kanni");
		al.add(10);
		
		String s1=(String) al.get(0);
		Object s2=al.get(1);
		System.out.println(s1);
		System.out.println(s2);
		

	}

}
