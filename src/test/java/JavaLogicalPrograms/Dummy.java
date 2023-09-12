package JavaLogicalPrograms;

import java.util.ArrayList;
import java.util.List;

public class Dummy {

	public static void main(String[] args) {
		
		int n=7;
		int flag=0;
		List<Integer> al=new ArrayList<Integer>();
				
		for(int j=0;j<n;j++)
		{
			for(int i=2;i<j;i++)
			{
				if(j%2==0)
				{
					flag=1;
					break;
				}
			}if(flag==0)
			{
				al.add(j);
				//System.out.println(j+" is a  prime num");
			}
		
		}
		//
		System.out.println(al);
		System.out.println(al.get(al.size()-1));
		
	}	
}
