package RS_tut;

/*
Java Date start from 01-January-1970 by milli s
 */

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class RS_57_DateAndTime {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis()/1000/3600/24/30);
//        System.out.println(Long.MAX_VALUE);
        Date d = new Date();
//        System.out.println(d.getTime());
//        System.out.println(d);

        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Dhaka"));
//        System.out.println(c.getCalendarType());
//        System.out.println(c.getTimeZone());
        System.out.println(c.getTimeZone().getID());
        }

}
