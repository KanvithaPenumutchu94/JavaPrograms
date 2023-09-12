package JavaLogicalPrograms;

public class T10_Reverse_Of_Number2 {

	public static void main(String[] args) {
		
		int num=1234;
		
		String s=num+"";
		
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		System.out.println(sb);
	}

}
