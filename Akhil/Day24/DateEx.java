package learning.Day24;

import java.util.Calendar;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d.getDate());
        System.out.println(d.getTime());
        System.out.println(d.getHours());
        Calendar rightnow=Calendar.getInstance();
        System.out.println(rightnow);
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));


    }
}
