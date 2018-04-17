package day6;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class DateTest {

	public static void main(String[] args) {
		Date d = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(d.toString());
		System.out.println(gc.get(Calendar.DAY_OF_MONTH));
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));
		System.out.println(gc.get(Calendar.DAY_OF_WEEK));
	}

}
