
public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 784335;

        System.out.println("\nСумма цифр в числе " + container.count + " равна " + sumDigits(container.count));
        System.out.println("\nСумма цифр в числе " + container.count + " равна " + sumDigitsChar(container.count));


    }// end of main

    public static Integer sumDigits(Integer number) {
        //TODO: write code here
        int result = 0;
        String str = Integer.toString(number);

        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(Character.toString(str.charAt(i)));
        }
        return result;
    }// end of sumDigits

    public static Integer sumDigitsChar(Integer number) {
        //TODO: write next code here
        int total = 0;

        char[] chars = number.toString().toCharArray();

        for (char i : chars) {
            total += Integer.parseInt(Character.toString(i), 10);
        }

        return total;
    }// end of sumDigitsChar

}// end of class
