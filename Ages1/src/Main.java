//определение минимального, среднего и максимальных чисел

public class Main {
    public static void main(String[] args) {
        int dimaAge = 25;
        int mishaAge = 10;
        int vasyaAge = 300;

        int oldest;
        int middle;
        int youngest;

        if (dimaAge > mishaAge) {
            if (dimaAge > vasyaAge) {
                oldest = dimaAge;
                if (vasyaAge > mishaAge) {
                    middle = vasyaAge;
                    youngest = mishaAge;
                } else {
                    youngest = vasyaAge;
                    middle = mishaAge;
                }
            } else {
                oldest = vasyaAge;
                youngest = mishaAge;
                middle = dimaAge;
            }
        } else if (mishaAge > vasyaAge) {
            oldest = mishaAge;
            if (dimaAge > vasyaAge) {
                middle = dimaAge;
                youngest = vasyaAge;
            } else {
                youngest = dimaAge;
                middle = vasyaAge;
            }
        } else {
            oldest = vasyaAge;
            middle = mishaAge;
            youngest = dimaAge;
        }
        System.out.println("Minimal age " + youngest);
        System.out.println("Middle age " + middle);
        System.out.println("Maximum age " + oldest);

    }
}
