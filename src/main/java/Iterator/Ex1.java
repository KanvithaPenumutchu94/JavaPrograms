package Iterator;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Ex1 {
	
	
		public static void main(String[] args) throws IOException {
			
			Ex2 ex=new Ex2();
			ex.getData("GN_Marketing", "Details", "FG");
			System.out.println(ex.getData("GN_Marketing", "Details", "FG"));
			
		}
}
