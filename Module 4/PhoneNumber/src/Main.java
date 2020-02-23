import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        System.out.println("Введите номер телефона: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().replaceAll("\\D+", "");

        if (str.length() == 11) {
            System.out.println("Вы ввели 11 цифр : " + str.replaceAll("(\\d)(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+7 ($2) $3-$4-$5"));
        } else if (str.length() == 10) {
            System.out.println("Вы ввели 10 цифр : " + str.replaceAll("(\\d{3})(\\d{3})(\\d{2})(\\d{2})", "+7 ($1) $2-$3-$4"));
        } else System.out.println("Неверное количество цифр. Уточните введенный номер!");

    }
}
