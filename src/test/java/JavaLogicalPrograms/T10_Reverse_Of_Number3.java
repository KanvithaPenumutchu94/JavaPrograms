package JavaLogicalPrograms;

public class T10_Reverse_Of_Number3 {

	public static void main(String[] args) {
		
		int num=1234;
		
		String s=num+"";
		
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		System.out.println(sb);
	}

}
