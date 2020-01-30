public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;

        System.out.println("Сумма цифр в числе " + container.count + " равна " + sumDigits(container.count));

    }// end of main

    public static Integer sumDigits(Integer number) {
        //TODO: write code here
        int result = 0;
        String str = Integer.toString(number);

        String nStr = (str.charAt(0) + "");//преобразуем символ в строку добавлением пустой строки ""

        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(str.charAt(i) + "");
        }

        return result;
    }//end of sumDigits()
}// end of class
