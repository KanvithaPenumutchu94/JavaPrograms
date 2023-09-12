package StringClassMethods;



public class ValueOfMethod {

	public static void main(String[] args)
	{
		//
		char ch='R';
		String str="";
		
	    str=str.valueOf(ch);
		System.out.println(str);
		
		int i=5;
		String s1="";
		str=str.valueOf(i);
		System.out.println(str);
		
		float f=(float) 5.5;
		String s2="";
		str=str.valueOf(f);
		System.out.println(str);
		
		double d=555555.5;
		String s3="";
		str=str.valueOf(d);
		System.out.println(str);
		
		long l=555555;
		String s4="";
		str=str.valueOf(l);
		System.out.println(str);
		
		boolean b=true;
		String s5="";
		str=str.valueOf(b);
		System.out.println(str);
		
		char[] cha= {'a','b','c'};
		String s6="";
		str=str.valueOf(cha);
		System.out.println(str);
		
		
		
		
		
	}

}
