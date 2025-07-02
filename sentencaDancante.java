import java.util.Scanner;

public class sentencaDancante {

    public static Scanner tecladoScanner = new Scanner(System.in);

    public static char[] sentencaDancante(char[] charSentenca){    
        char caracDeAjuda = ' ';

        for (int i = 0; i < charSentenca.length - 1; i++) {
            caracDeAjuda = charSentenca[i - 1];
        }
    }

    public static void main(String[] args) {
        while (true) {
            String sentenca = tecladoScanner.nextLine();
            char[] charSentenca = sentenca.toCharArray();
        }
    }
}
