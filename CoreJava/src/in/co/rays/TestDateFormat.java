package in.co.rays;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestDateFormat {
	public static void main(String[] args) throws ParseException {
		Date a = new Date();

		SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
		String s = format1.format(a);
		System.out.println("Format 1 : " + s);

		SimpleDateFormat format2 = new SimpleDateFormat("MMM,dd,yyyy");
		s = format2.format(a);
		System.out.println("Format 2 : " + s);

		SimpleDateFormat format3 = new SimpleDateFormat("yyyy.MM.ddG 'at' hh:mm:ss z");
		s = format3.format(a);
		System.out.println("Format 3 : " + s);

		SimpleDateFormat format4 = new SimpleDateFormat("EEE, MMMM d,''y");
		s = format4.format(a);
		System.out.println("Format 4 : " + s);

		SimpleDateFormat format5 = new SimpleDateFormat("h:mm a");
		s = format5.format(a);
		System.out.println("Format 5 : " + s);

		SimpleDateFormat format6 = new SimpleDateFormat("H:mm");
		s = format6.format(a);
		System.out.println("Format 6 : " + s);

		SimpleDateFormat format7 = new SimpleDateFormat("H:mm:ss:SSS");
		s = format7.format(a);
		System.out.println("Format 7 : " + s);

		SimpleDateFormat format8 = new SimpleDateFormat("K:mm a,z");
		s = format8.format(a);
		System.out.println("Format 8 : " + s);

		SimpleDateFormat format9 = new SimpleDateFormat("yyyy.MMMMM.dd GGG hh:mm aaa");
		s = format9.format(a);
		System.out.println("Format 9 : " + s);

		Date pDate = format1.parse("15/08/1947");
		System.out.println(pDate);

	}
}
