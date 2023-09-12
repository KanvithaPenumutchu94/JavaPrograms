package JavaLogics;

import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) {
		
		SimpleDateFormat df=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		Date dt=new Date();
		String timestamps=df.format(dt);
		
		System.out.println(timestamps);

	}

}
