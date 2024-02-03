import java.util.Calendar;

public class DateHelper {
    public static java.sql.Date getSqlDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        return new java.sql.Date(cal.getTimeInMillis());
    }

    public static java.util.Date getUtilDate(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        return cal.getTime();
    }

    public static java.util.Date getUtilDate(String date){
        String[] dateParts = date.split("/");
        int year = Integer.parseInt(dateParts[0]), month = Integer.parseInt(dateParts[1]),
                day = Integer.parseInt(dateParts[2]);
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        return cal.getTime();
    }

    public static java.sql.Date getSqlDate(String date) {
        String[] dateParts = date.split("/");
        int year = Integer.parseInt(dateParts[0]), month = Integer.parseInt(dateParts[1]),
                day = Integer.parseInt(dateParts[2]);
        Calendar cal = Calendar.getInstance();
        cal.set(year, month, day);
        return new java.sql.Date(cal.getTimeInMillis());
    }

    public static java.sql.Date getSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());
    }

    public static java.util.Date getUtilDate(java.sql.Date date) {
        return new java.util.Date(date.getTime());
    }

}