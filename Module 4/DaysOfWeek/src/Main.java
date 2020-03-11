import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat dayOfWeek = new SimpleDateFormat("dd.MM.YYYY - EEEE ", new Locale("ru"));
        SimpleDateFormat year = new SimpleDateFormat("YYYY", new Locale("ru"));

        Calendar currentCalendar = Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        calendar.set(1986, 8, 20);

        int till = Integer.parseInt(year.format(currentCalendar.getTime())) - Integer.parseInt(year.format(calendar.getTime()));

        System.out.println(dayOfWeek.format(calendar.getTime()));
        System.out.println("----------");

        for (int i = 0; i <= till; i++) {
            calendar.add(Calendar.YEAR, i);
            System.out.println(i + " - " + dayOfWeek.format(calendar.getTime()));
            calendar.add(Calendar.YEAR, -i);

        }
    }
}
