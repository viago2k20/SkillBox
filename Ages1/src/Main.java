//определение минимального, среднего и максимальных чисел

public class Main {
    public static void main(String[] args) {
        int x = 45;
        int y = 5;
        int z = 0;

        int min = x;
        int mid = y;
        int max = x;
        if (y < x && x < z) {
            mid = x; min = y; max = z;
        }
        if (z < x && x < y) {
            mid = x; min = z; max = y;
        }
        if (x < y && y < z) {
          mid = y; min = x; max = z;
        }
        if (z < y && y < x) {
            mid = y; min = z; max = x;
        }
        if (x < z && z < y) {
          mid = z; min = x; max = y;
        }
        if (y < z && z < x) {
            mid = z; min = y; max = x;
        }
        System.out.println("min number " + min);
        System.out.println("max number " + max);
        System.out.println("mid number " + mid);

    }
}
