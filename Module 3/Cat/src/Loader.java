public class Loader {

    //метод в котором создается новая кошка и отображается ее вес
    private static Cat getKitten() {
        Cat nameCat = new Cat(1100);
        System.out.println("\nПоявился котенок! Его вес = " + nameCat.getWeight());
        return nameCat;
    }

    public static void main(String[] args) {
        Cat filipp = new Cat();
        Cat pit = new Cat();
        Cat tom = new Cat();
        Cat manya = new Cat();
        Cat fibi = new Cat();

        Cat tor = new Cat(2000);

        Cat tim = new Cat(100);

        //про кота Пита
        pit.meow();
        double w = pit.getWeight();
        System.out.println("\nВес кота Пита " + w);
        for (int j = 0; j < w - 1000; j++) {
            pit.meow();
        }
        System.out.println("\nВес кота Пита " + pit.getWeight() + "\nЧто с котом Питом: " + pit.getStatus());
        pit.meow();

        //про кота Филиппа
        System.out.println("\n\nВес кота Филиппа " + filipp.getWeight());
        while (filipp.getWeight() <= 9001) {
            filipp.feed(50.0);
            System.out.println(filipp.getWeight());
        }
        System.out.println("Вес кота Филиппа " + filipp.getWeight() + "\nЧто с котом Филиппом: " + filipp.getStatus()
                + "\nФилипп съел " + filipp.getMassFeed());
        filipp.pee();
        filipp.pee();
        filipp.pee();

        System.out.println("Вес кота Филиппа " + filipp.getWeight() + "\nЧто с котом Филиппом: " + filipp.getStatus()
                + "\nФилипп съел " + filipp.getMassFeed());



        //про кота Тома
        System.out.println("\n\nВес кота Тома " + tom.getWeight() + "\nЧто с котом Томом: " + tom.getStatus());
        tom.drink(500.0);
        System.out.println("Вес кота Тома " + tom.getWeight() + "\nЧто с котом Томом: " + tom.getStatus());

        //про кошку Маню
        System.out.println("\n\nВес кошки Мани " + manya.getWeight() + "\nЧто с кошкой Маней: " + manya.getStatus());
        manya.feed(100.0);
        manya.meow();
        System.out.println("Вес кошки Мани " + manya.getWeight() + "\nЧто с кошкой Маней: " + manya.getStatus());
        System.out.println(manya.getMassFeed());

        //про кошку Фиби
        System.out.println("\n\nВес кошки Фиби " + fibi.getWeight() + "\nЧто с кошкой Фиби: " + fibi.getStatus());
        fibi.meow();
        fibi.meow();
        fibi.pee();
        System.out.println("Вес кошки Фиби " + fibi.getWeight() + "\nЧто с кошкой Фиби: " + fibi.getStatus());

        //про кота Тора
        tor.setCatsColor(CatsColor.BLACK);
        System.out.println("\nВес кота Тора " + tor.getWeight());
        tor.feed(100.0);
        tor.feed(50.0);
        tor.drink(25.0);
        tor.pee();
        System.out.println("\nВес кота Тора " + tor.getWeight() + "\nКот Тор съел " + tor.getMassFeed() + "\nКот Тор выпил " + tor.getMassDrink());

        getKitten();//вызов метода, создающего новую кошку

        //про кота Тима
       System.out.println("\nЧто с кошкой Тимом: " + tim.getStatus());
       tim.feed(35.0);
       tim.drink(45.0);
        System.out.println("\nВес кота Тима " + tim.getWeight() + "\nКот Тим съел " + tim.getMassFeed() + "\nКот Тим выпил " + tim.getMassDrink());


        //количество кошек
        System.out.println("\n-========-");
        System.out.println("Количество живых кошек: " + Cat.getCount());


    }
}