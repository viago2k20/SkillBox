public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.count += 7843;

        System.out.println("\nСумма цифр в числе " + container.count + " равна " + sumDigits(container.count));

    }// end of main

    public static Integer sumDigits(Integer number) {
        //TODO: write code here
        int result = 0;
        String str = Integer.toString(number);

        for (int i = 0; i < str.length(); i++) {
            result += Integer.parseInt(str.charAt(i) + "");
        }

        return result;
    }//end of sumDigits()
}// end of class
