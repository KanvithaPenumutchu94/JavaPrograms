package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class Duplicates {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,1};
		
		//convert array to ArrayList
		ArrayList al=new ArrayList();
		
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
		}
		System.out.println(al);
		
		LinkedHashSet hs=new LinkedHashSet(al);
		//System.out.println(hs);
		
		ArrayList al1=new ArrayList(hs);
		System.out.println(al1);
	
	}

}
