package configuration;

public class randomMaiGenerator {
    public static void main(String[] args) {
        String emailAddress = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        while (emailAddress.length() < 5) {
            int character = (int) (Math.random() * 26);
            emailAddress += alphabet.substring(character, character + 1);
            emailAddress += Integer.valueOf((int) (Math.random() * 99)).toString();
            emailAddress += "@" + "com.pl";
            System.out.println(emailAddress);
        }
    }
}
