
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

    private String colorCat;

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
        checkOutBoundary();
    }

    //метод создания глубокой копии кошки
    public Cat(Cat novaCat){
        this();
        this.catIsAlive = novaCat.catIsAlive;
        this.weight = novaCat.getWeight();
        this.originWeight = novaCat.originWeight;
        this.colorCat = novaCat.getColorCat();
    }

    public void setColorCat(String colorCat) {
        this.colorCat = colorCat;
    }

    public String getColorCat() {
        return colorCat;
    }

    //метод уменьшает переменную подсчета кошек если вес вышел за допустимые пределы
    public void checkOutBoundary() {
        if (weight < minWeight || weight > maxWeight) {
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
            System.out.println("Meow");
            weight = weight - 1;
            checkOutBoundary();
        } else {
            System.out.println("Не мяукает, кошка умерла.");
        }
    }

    //метод: кормим кошку
    public void feed(Double amount) {
        if (catIsAlive) {
            weight = weight + amount;
            massFeed = massFeed + amount;
            checkOutBoundary();
        } else {
            System.out.println("Нельзя покормить кошку, она умерла.");
        }
    }

    //метод: поим кошку
    public void drink(Double amount) {
        if (catIsAlive) {
            weight = weight + amount;
            massDrink = massDrink + amount;
            checkOutBoundary();
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
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}