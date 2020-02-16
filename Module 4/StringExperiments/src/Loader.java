
public class Loader {
    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(text + "\n");

        int VFirst = text.indexOf("л");
        int VLast = text.indexOf("у");
        int paymentVasya = Integer.parseInt(text.substring(VFirst + 1, VLast - 2).trim());

        int MFirst = text.lastIndexOf("-");
        int MLast = text.lastIndexOf("р");
        int paymentMasha = Integer.parseInt(text.substring(MFirst + 1, MLast).trim());

        int PFirst = text.indexOf("-");
        int PLast = text.lastIndexOf(",");
        int paymentPetr = Integer.parseInt(text.substring(PFirst + 1, PLast - 5).trim());

        System.out.println("З/п Васи " + paymentVasya + "р.");
        System.out.println("З/п Маши " + paymentMasha + "р.");
        System.out.println("Сумма заработка Васи и Маши: " + (paymentVasya + paymentMasha) + "р.");
        System.out.println("\nЗ/п Пети " + paymentPetr + "р.");

    }
}