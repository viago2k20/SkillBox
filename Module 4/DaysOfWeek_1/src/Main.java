import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int myYear = 1976;
        int myMonth = 9;//сентябрь
        int myDay = 20;

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MM.yyyy EEEE");//определяем формат вывода

        LocalDateTime now = LocalDateTime.now();
        LocalDate myDate = LocalDate.of(myYear, myMonth, myDay);//инициализируем дату дня рождения

        System.out.println("Дата Дня рождения: " + myDate.format(pattern));
        System.out.println("Текущая дата: " + now.format(pattern));
        System.out.println("----");
        System.out.println("Все дни рождения по неделям до текущей даты: ");

        int year = now.getYear();//текущий год
        for (int i = 0; i <= (year - myYear); i++) {
            myDate = myDate.plusYears(i);
            System.out.println(i + " - " + myDate.format(pattern));
            myDate = myDate.plusYears(-i);
        }

    }//end of main
}