import java.util.Scanner;

public class Main {

    public static boolean check(String txt) {
        for (int i = 0; i <= txt.length() - 1; i++) {
            if (Character.isDigit(txt.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Введите ФИО: ");
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split(" ");

        if (str.length != 3) {
            System.out.println("Неверный формат данных!");
        } else {
            if (check(str[0]) && check(str[1]) && check(str[2])) {
                System.out.println("Фамилия: " + str[0]);
                System.out.println("Имя: " + str[1]);
                System.out.println("Отчество: " + str[2]);
            } else {
                System.out.println("Неверный формат данных! Введена цифра!");

            }
        }
        scan.close();
    }
}
