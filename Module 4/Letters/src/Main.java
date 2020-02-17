public class Main {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.println(i + "\t" + (int) i);
        }
        System.out.println("--------");
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i + "\t" + (int) i);
        }
        System.out.println("--------");
        for (char x = 'А'; x <= 'я'; x++) {
            System.out.println(x + "\t" + (int) x);
        }
        System.out.println("--------");
        for (char x = '0'; x <= '9'; x++) {
            System.out.println(x + "\t" + (int) x);
        }

    }
}
