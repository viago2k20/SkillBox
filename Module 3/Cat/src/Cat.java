
public class Cat {
    public static int count;//статическая переменная подсчета кошек
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        count++;
    }
    //масса кошки задается через входной параметр конструктора
    public Cat(double weight)
    {
        this ();
        this.weight = weight;

    }
    //метод выводит значение статической переменной count
    public static int getCount()
    {
        return count;
    }

    // метод определяет массу съеденной еды
    public double massOfFood() {
        return originWeight - weight;
    }

    //метод: кошка идет в туалет
    public void goToWC() {
        weight = weight - 50;
        System.out.println("It was in right place! Meow.");
    }

    public void meow() {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            count--;
            return "Dead";
        } else if (weight > maxWeight) {
            count--;
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }
}