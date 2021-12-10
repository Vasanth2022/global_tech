package info.test;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Sample {

	private String s;

	public Sample(String s) {
		super();
		this.s = s;
		System.out.println(s);
	}

	public static void main(String[] args) throws ParseException, UnsupportedEncodingException {

		String testDate = "01-Dec-2021,13:00:14 PM";
		DateFormat formatter = new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa");
		Date date = formatter.parse(testDate);

		String testDate1 = "03-Dec-2021,13:00:14 PM";
		DateFormat formatter1 = new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa");
		Date date1 = formatter1.parse(testDate1);

		List<Date> holy = new ArrayList<Date>();
		holy.add(date);
		holy.add(date1);

		String testDate10 = "29-Nov-2021,13:00:14 PM";
		DateFormat formatter10 = new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa");
		Date date10 = formatter10.parse(testDate10);

		String testDate11 = "30-Nov-2021,13:00:14 PM";
		DateFormat formatter11 = new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa");
		Date date11 = formatter11.parse(testDate11);

		String testDate12 = "01-Dec-2021,13:00:14 PM";
		DateFormat formatter12 = new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa");
		Date date12 = formatter12.parse(testDate12);

		String testDate13 = "02-Dec-2021,13:00:14 PM";
		DateFormat formatter13 = new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa");
		Date date13 = formatter13.parse(testDate13);

		String testDate14 = "03-Dec-2021,13:00:14 PM";
		DateFormat formatter14 = new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa");
		Date date14 = formatter14.parse(testDate14);

		String testDate15 = "04-Dec-2021,13:00:14 PM";
		DateFormat formatter15 = new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa");
		Date date15 = formatter15.parse(testDate15);

		String testDate16 = "05-Dec-2021,13:00:14 PM";
		DateFormat formatter16 = new SimpleDateFormat("d-MMM-yyyy,HH:mm:ss aaa");
		Date date16 = formatter16.parse(testDate16);

		List<Date> datelist = new ArrayList<Date>();

		datelist.add(date10);
		datelist.add(date11);
		datelist.add(date12);
		datelist.add(date13);
		datelist.add(date14);
		datelist.add(date15);
		datelist.add(date16);

		datelist.removeAll(holy);

		System.out.println(datelist.size() + "sample");

	}

}