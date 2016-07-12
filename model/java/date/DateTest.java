package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = new Date();
		String str = simple.format(date);
		System.out.println(str);
		
	}
}
