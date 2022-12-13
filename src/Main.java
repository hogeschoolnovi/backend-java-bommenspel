import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int bomb = random.nextInt(9);
        int input = -1;

        // We gebruiken hier een while-loop. Een for-loop gebruiken we wanneer we door een lijst of array van waardes willen loopen.
        // We hebben hier geen lijst met waardes om doorheen te loopen.
        while (input!=bomb) {
            System.out.println("\nKies een nummer van het keypad om in te drukken");
            input = scanner.nextInt();
            // We gebruiken hier het best een if/else statement omdat we slechts 2 mogelijkheden hebben.
            if (input == bomb) {
                Util.printExplosion();
            } else {
                Util.printBomb();
            }
        }
    }





    ;
}


