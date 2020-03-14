import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        System.out.println("Введите ФИО: ");
        Scanner scan = new Scanner(System.in);
        String[] str = scan.nextLine().split(" ");

        String pattern = "([А-Я][а-я]*)(-[А-Я][а-я]*)?";
     //   boolean status = false;

        if (str.length != 3) {
            System.out.println("Неверный формат данных!");
        } else {
            boolean status = false;
            for (String s : str) {
                if (s.matches(pattern)) {
                    status = true;
                } else {
                    System.out.println("Неверный формат данных!!");
                    status = false;
                    break;
                }
            }
            if (status){
                System.out.println("Фамилия: " + str[0]);
                System.out.println("Имя: " + str[1]);
                System.out.println("Отчество: " + str[2]);}
        }
        scan.close();
    }
}