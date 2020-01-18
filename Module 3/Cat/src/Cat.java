
public class Cat {

    public static final int NUMBER_OF_EYES = 2;//константа количество глаз
    public static final double minWeight = 1000.0;
    public static final double maxWeight = 9000.0;

    private boolean catIsAlive;//переменая состояния кошки
    public static int count;//статическая переменная подсчета кошек
    public double massFeed;//масса съеденной еды
    public double massDrink;//масса выпитой жидкости
    private double originWeight;
    private double weight;

    //конструктор по умолчанию
    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        if (weight > minWeight && weight < maxWeight) {
            catIsAlive = true;
            count++;
        } else {
            catIsAlive = false;
        }
    }

    //конструктор с входным параметром: задается масса кошки
    public Cat(double weight) {
        this();
        this.weight = weight;
        if (weight < minWeight) {
            catIsAlive = false;
            count--;
        }
    }

    //метод определяет цвет кошки
    public void setCatsColor(CatsColor type) {
    }

    //метод выводит значение статической переменной count - количество живых кошек
    public static int getCount() {
        return count;
    }

    // метод определяет массу съеденной еды
    public double getMassFeed() {
        return massFeed;
    }

    // метод определяет массу выпитой жидкоссти
    public double getMassDrink() {
        return massDrink;
    }

    //метод: кошка идет в туалет
    public void pee() {
        if (catIsAlive) {
            weight = weight - 50;
            System.out.println("I was at WC! Meow.");
        } else {
            System.out.println("Кошка умерла.");
        }

    }

    //метод: кошка мяукает
    public void meow() {
        if (catIsAlive) {
            weight = weight - 1;
            System.out.println("Meow");
        } else {
            System.out.println("Кошка умерла.");
        }
    }

    //метод: кормим кошку
    public void feed(Double amount) {
        if (catIsAlive) {
            weight = weight + amount;
            massFeed = massFeed + amount;
        } else {
            System.out.println("Нельзя покормить кошку, она умерла.");
        }
    }
    //метод: поим кошку
    public void drink(Double amount) {
        if (catIsAlive) {
            weight = weight + amount;
            massDrink = massDrink + amount;
        } else {
            System.out.println("Нельзя напоить кошку, она умерла.");
        }
    }
    //метод: возвращает вес кошки
    public Double getWeight() {
        return weight;
    }
    //метод: чем занимается кошки или в каком она состоянии
    public String getStatus() {
        if (catIsAlive) {
            if (weight < minWeight) {
                count--;
                catIsAlive = false;
                return "Dead";
            } else if (weight > maxWeight) {
                count--;
                catIsAlive = false;
                return "Exploded";
            } else if (weight > originWeight) {
                return "Sleeping";
            } else {
                return "Playing";
            }
        }
        return "Dead";
    }
}