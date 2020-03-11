import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int myYear = 1986;
        int myMonth = 9;
        int myDay = 20;

        SimpleDateFormat dayOfWeek = new SimpleDateFormat("dd.MM.YYYY - EEEE ", new Locale("ru"));
        SimpleDateFormat year = new SimpleDateFormat("YYYY", new Locale("ru"));

        Calendar currentCalendar = Calendar.getInstance();//календарь с текущей датой
        Calendar calendar = Calendar.getInstance();//календарь для установления даты

        calendar.set(myYear, myMonth-1, myDay);

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