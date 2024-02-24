package collections;

public class DataEx {
	import java.util.Calendar;
	import java.util.Date;

	public class DateEx {

		public static void main(String[] args) {
			Date d = new Date();
		  System.out.println(d);
		  System.out.println(d.getHours());
		  Calendar calendar=Calendar.getInstance();
		  System.out.println(calendar);
	      System.out.println(calendar.get(calendar.WEEK_OF_MONTH));
		}
	}


