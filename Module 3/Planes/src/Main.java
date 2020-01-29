import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;
import com.skillbox.airport.Terminal;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Airport airport = Airport.getInstance();

        System.out.println("\nВсе самолеты в аэропорту: " + airport.getAllAircrafts().toString());
        System.out.println(airport.getTerminals());

        System.out.println("\nКоличество самолетов: " + airport.getAllAircrafts().size());


        //создаем новый терминал
        Terminal terminalPulkovo = new Terminal("Пулково");

        //создаем новый самолет
        Aircraft tu = new Aircraft("TU-144");


        //устанавливаем время
        Calendar calendar = new GregorianCalendar(2020, 01, 24);
        calendar.set(Calendar.HOUR_OF_DAY, 22);
        calendar.set(Calendar.MINUTE, 30);
        Date time = calendar.getTime();

        //в терминал добавляем новый самолет
        terminalPulkovo.addParkingAircraft(tu);

        //создаем рейс
        Flight flight = new Flight("DP 569", Flight.Type.DEPARTURE, time, tu);

        System.out.println("\nТерминал: " + terminalPulkovo.getName());
        System.out.println("Самолеты в Терминале Пулково: " + terminalPulkovo.getParkedAircrafts());
        System.out.println("Информация о рейсе: " + flight.toString());


    }//end of main
}
