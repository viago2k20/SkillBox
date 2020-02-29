import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        System.out.println("Введите ФИО: ");
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split(" ");

        String pattern = "([А-Я]{1}[а-я]*)|([А-Я]{1}[а-я]*-[А-Я]{1}[а-я]*)";
        boolean status;

        if (str.length != 3) {
            System.out.println("Неверный формат данных!");
        } else {
            status = str[0].matches(pattern);
            status = str[1].matches(pattern) && status;
            status = str[2].matches(pattern) && status;
            if (!status) {
                System.out.println("Неверный формат данных!!");
            }
            else {
                System.out.println("Фамилия: " + str[0]);
                System.out.println("Имя: " + str[1]);
                System.out.println("Отчество: " + str[2]);
            }
        }
        scan.close();
    }
}
