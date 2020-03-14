public class Main {
    public static void main(String[] args) {
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] color = text.split(",?\\s+");
        for (int i =0; i < color.length; i++)
            System.out.println(color[(color.length-1)-i]);
    }
}
