
public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя... - 7563 рубля, а Маша: - 30000 рублей";

        String pattern = "\\D+";
        String[] msg = text.replaceAll("[А-я.,!:()-]+", " ").trim().split(pattern);
        int sum = 0;
        for (String i : msg) {
            sum += Integer.parseInt(i);
        }
        System.out.println("Сумма заработка Васи, Пети, Маши: " + sum);
    }
}