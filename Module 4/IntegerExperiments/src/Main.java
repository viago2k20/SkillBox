public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;

        System.out.println(sumDigits(83720));


        System.out.println("\n---");
        int num = Integer.parseInt("09");
        System.out.println(num);

        String s = " 1234 ";
        System.out.println(s.trim());

        int i = Integer.parseInt (s.trim());
        System.out.println(i);
        i+=16;
        System.out.println(i);

    }// end of main

    public static Integer sumDigits(Integer number) {
        //TODO: write code here
        String str;
        str = Integer.toString(number);
        int result = 0;

        System.out.println("Длина строки: " + str.length());
        String nStr = (str.charAt(0) + "");//преобразуем символ в строку добавлением пустой строки ""

        System.out.println("Первый символ: " + nStr);

        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(str.charAt(i) + "");//
        }
        System.out.print("Сумма цифр в числе равна: ");

        return result;
    }
}// end of class
