package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx1 {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		ArrayList<Integer> al=new ArrayList<Integer>(Arrays.asList(new Integer[] {1,2,3,4,5}));
		System.out.println(al);

	}

}
