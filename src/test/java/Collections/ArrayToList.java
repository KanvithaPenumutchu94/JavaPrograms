package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String s[]= {"kanni","venki"};
		List<String> al1=new ArrayList<String>();
		al1=Arrays.asList(s);
		System.out.println(al1);
		

	}

}
