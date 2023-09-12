package JavaLogics;

import java.util.Arrays;


public class Test2 {

	public static void main(String[] args) {
		String regex = "(?<=(.))(?!\\1)";
		String a = "aHHHbYY";
		String[] b = a.split(regex);
		
		System.out.println(Arrays.toString(b));
		
		/*for(String bb:b)
		{
			System.out.println(bb);
		}
		 */


	}
}
