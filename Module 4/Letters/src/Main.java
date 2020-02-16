public class Main {
    static void printLetters (String str){
        for (int i = 0; i <= str.length() - 1; i++) {
            int code = str.charAt(i);
            System.out.println(str.charAt(i) + "\t" + code);
        }
        System.out.println("Кол-во символов " + str.length() + "\n");
    }

    public static void main(String[] args) {
        String alphabetL = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alphabetR = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";
        String numbers = "0123456789";

        printLetters(alphabetL);
        printLetters(alphabetR);
        printLetters(numbers);

        System.out.println("-> " + (char)50);
        System.out.println("-> " + (int)'?');
    }
}
