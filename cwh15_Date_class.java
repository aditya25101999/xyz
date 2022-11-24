import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class cwh15_Date_class {
    public static void main(String[] args) {
        Date d= new Date();
        System.out.println(d.getHours()+"/"+d.getMinutes()+"/"+d.getSeconds());
        /// d.gethours wagera sarein methods hai to print hours minutes seconds etc
        System.out.println("ab total pura pri date neeche likha h ");
        System.out.println(d);

        // method 2 using calender class
        System.out.println("CALENDAR CLASS SHURU HOTE HUE ");
        Calendar c= Calendar.getInstance();
        System.out.println(c.getTime());  // PURA TIME PRINT HO JAEGA
        System.out.print(c.get(Calendar.HOUR_OF_DAY)+"/"); // LN NHI LAGAYA TAAKI NEXT LINE PRINT NA HO
        System.out.print(c.get(Calendar.MINUTE)+"/");
        System.out.print(c.get(Calendar.SECOND));

        // USING JAVA.TIME API
        LocalDateTime dt= LocalDateTime.now();
        System.out.println(dt); // pura time show karga upto nano seconds
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-YYYY");
        String javadate= dt.format(dtf);
        System.out.println(javadate);

    }
}
