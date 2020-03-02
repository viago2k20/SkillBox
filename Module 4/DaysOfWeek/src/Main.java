import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat dayOfWeek = new SimpleDateFormat("dd.MM.YYYY - EEEE ", new Locale("ru"));

        Calendar calendar = Calendar.getInstance();
        calendar.set(1986, 9-1, 20);

        System.out.println(dayOfWeek.format(calendar.getTime()));
        System.out.println("----------");

        for (int i = 0; i <= 40; i++) {
            calendar.add(Calendar.YEAR, i);
            System.out.println(i + " - " + dayOfWeek.format(calendar.getTime()));
            calendar.add(Calendar.YEAR, -i);

        }
    }
}
