import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();

        int amountOfLetters = 23;

        String[] password = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "@", "$", "#", "!", "%", "&", "*"};

        int amountOfLettersInPassword = rand.nextInt(amountOfLetters);

        for (int i = 0; i < amountOfLettersInPassword; i++) {
            int NumberForPassword = rand.nextInt(amountOfLetters);
            System.out.println(password[NumberForPassword]);
        }

    }
}
