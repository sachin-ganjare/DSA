import java.util.Calendar;
import java.util.Date;

class P9_DateNCalendarDemo {
    public static void main(String args[]) {
        // Date stores a specific instant in time.
        Date today = new Date();
        System.out.println("Current date and time : " + today);
        System.out.println("Milliseconds since Jan 1, 1970 : " + today.getTime());

        // Calendar helps us read and modify date/time fields.
        Calendar cal = Calendar.getInstance(); // Calendar is an abstract parent class.
        System.out.println("\nCurrent time from Calendar");
        System.out.println("\nCurrent time from Calendar: " + cal.getTime());
        System.out.println("Hour   : " + cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute : " + cal.get(Calendar.MINUTE));
        System.out.println("Second : " + cal.get(Calendar.SECOND));

        // Set a specific time.
        cal.set(Calendar.HOUR_OF_DAY, 10);
        cal.set(Calendar.MINUTE, 29);
        cal.set(Calendar.SECOND, 22);
        System.out.println("\nAfter setting time     : " + cal.getTime());

        // add() changes the calendar by a relative amount.
        cal.add(Calendar.DATE, -15);
        System.out.println("15 days ago            : " + cal.getTime());

        cal.add(Calendar.MONTH, 4);
        System.out.println("4 months later         : " + cal.getTime());

        cal.add(Calendar.YEAR, 2);
        System.out.println("2 years later          : " + cal.getTime());
    }
}
