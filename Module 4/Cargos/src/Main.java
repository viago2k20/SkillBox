public class Main {

    public static void main(String[] args) {

        int tankToCargo = 12; // кол-во контейнеров помещающихся в грузовик
        int boxToTank = 27; // кол-во ящиков помещающихся в контейнер
        int box = 657; //кол-во ящиков

        double tanks = Math.ceil((double) box / boxToTank);
        double cargos = Math.ceil(tanks / tankToCargo);

        System.out.println("\nКол-во ящиков для траспортировки " + box + " шт.");
        System.out.println("Необходимое кол-во контейнеров для перевозки ящиков " + (int)tanks + " шт.");
        System.out.println("Необходимое кол-во грузовиков "+ (int)cargos + " шт.");
        System.out.println("\nРаспределение ящиков по контейнерам и контейнеров по грузовикам: \n");

        int countTank = 1;//счетчик контейнеров
        int countBox = 1;//счетчик ящиков

        for (int i = 1; i <= cargos; i++) {
            System.out.println("Грузовик " + i);
            for (int j = 1; j <= tankToCargo; j++) {
                if (countTank <= tanks) {
                    System.out.print("\tКонтейнер " + countTank + "\n");
                    countTank++;
                } else break;//System.out.println("\txx");
                for (int x = 1; x <= boxToTank; x++) {
                    if(countBox <= box){
                        System.out.print("\t\tЯщик " + countBox + "\n");
                    countBox++;
                    }else break;//System.out.println("\t\t00");
                }
            }
            System.out.println("");
        }

    }//end of main
}
