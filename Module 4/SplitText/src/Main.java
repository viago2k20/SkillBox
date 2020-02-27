public class Main {
    public static void main(String []args){
        String txt = "'Phonebook information'\n" +
                "The personal information of 10.6 million guests who stayed at MGM Resorts hotels was hacked last summer.\n"+
                "MGM said most of the data that was stole was \"phonebook information\" like names, telephone numbers and email addresses, which are already publicly available.\n" +
                "But approximately 1,300 former guests were notified that more sensitive information including passport numbers had been revealed.\n" +
                "A further 52,000 customers were told that less sensitive personal information was exposed. This was only a portion of those impacted.\n" +
                "MGM said its notification to customers followed state laws. Most US states do not require companies to tell customers if data which is already public has been exposed during a hack.\n" +
                "MGM has resorts in Las Vegas, Atlantic City and Detroit in the US. It also has property in China and Japan and is developing a new resort in Dubai.";

        String pattern = "[.,]?\\s+";
        String[] msg = txt.replaceAll("[^([0-9],|.[0-9]+\\w)]|(\\.$)", " ").split(pattern);

        for(int i=0; i<msg.length; i++) {
            System.out.println(msg[i]);
        }
        System.out.println("\n"+msg.length);
    }
}
