package Knowledge;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeAndDate {

	public static void main(String[] args) {
		
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		System.out.println(timestamp);
	}

}
