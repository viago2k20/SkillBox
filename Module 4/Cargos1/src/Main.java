public class Main {

    public static void main(String[] args) {
        // write your code here
        int tankToCargo = 3; // кол-во контейнеров помещающихся в грузовик
        int boxToTank = 2; // кол-во ящиков помещающихся в контейнер
        int box = 18; //кол-во ящиков

        double tanks = Math.ceil((double) box / boxToTank);//расчет кол-ва контейнеров
        double cargos = Math.ceil(tanks / tankToCargo);//расчет кол-ва грузовиков

        System.out.println("\nКол-во ящиков для траспортировки " + box + " шт.");
        System.out.println("Необходимое кол-во контейнеров для перевозки ящиков " + (int) tanks + " шт.");
        System.out.println("Необходимое кол-во грузовиков " + (int) cargos + " шт.");
        System.out.println("\nРаспределение ящиков по контейнерам и контейнеров по грузовикам: \n");

        int countTank = 1;//счетчик контейнеров
        int coutnCargos = 1;//счетчик грузовиков
        for (int i = 1; i <= box; i++) {
            if (i == 1) {
                System.out.println("Грузовик: " + coutnCargos);
                coutnCargos++;
            }
            if (i == 1) {
                System.out.print("\tКонтейнер: " + countTank + "\n");
                countTank++;
            }
            {
                System.out.print("\t\tЯщик: " + i + "\n");
            }
            if (i % (tankToCargo * boxToTank) == 0 && i < box) {
                System.out.println("Грузовик: " + coutnCargos);
                coutnCargos++;
            }
            if (i % boxToTank == 0 && i < box) {
                System.out.print("\tКонтейнер: " + countTank + "\n");
                countTank++;
            }
        }//end of "for"
    }//end of main
}
