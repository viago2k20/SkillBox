
public class Loader {
    public static void main(String[] args) {
        Cat filipp = new Cat();
        Cat pit = new Cat();
        Cat tom = new Cat();
        Cat manya = new Cat();
        Cat fibi = new Cat();

        //про кота Пита
        pit.meow();
        double w = pit.getWeight();
        System.out.println(w);
        for (int j = 0; j < w - 1000; j++) {
            pit.meow();
        }
        System.out.println("\nВес кота Пита " + pit.getWeight() + "\nЧто с котом Питом: " + pit.getStatus());

        //про кота Филиппа
        System.out.println("\n\nВес кота Филиппа " + filipp.getWeight());
        filipp.meow();
        filipp.feed(9000.1 - filipp.getWeight());
        System.out.println("Вес кота Филиппа " + filipp.getWeight() + "\nЧто с котом Филиппом: " + filipp.getStatus());

        //про кота Тома
        System.out.println("\n\nВес кота Тома " + tom.getWeight() + "\nЧто с котом Томом: " + tom.getStatus());
        tom.drink(500.1);
        //System.out.println("Столько еды съел Том " + tom.massOfFood());
        System.out.println("Вес кота Тома " + tom.getWeight() + "\nЧто с котом Томом: " + tom.getStatus());

        //про кошку Маню
        System.out.println("\n\nВес кошки Мани " + manya.getWeight() + "\nЧто с кошкой Маней: " + manya.getStatus());
        manya.feed(100.1);
        manya.meow();
        System.out.println("Вес кошки Мани " + manya.getWeight() + "\nЧто с кошкой Маней: " + manya.getStatus());
        System.out.println(manya.massOfFood());

        //про кошку Фиби
        System.out.println("\n\nВес кошки Фиби " + fibi.getWeight() + "\nЧто с кошкой Фиби: " + fibi.getStatus());
        fibi.meow();
        fibi.meow();
        fibi.goToWC();
        System.out.println("Вес кошки Фиби " + fibi.getWeight() + "\nЧто с кошкой Фиби: " + fibi.getStatus());

        //количество кошек
        System.out.println("\n-========-");
        System.out.println("Количество живых кошек: " + Cat.getCount());
    }
}