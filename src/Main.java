import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int bomb = random.nextInt(9);
        int input = -1;

        while (input!=bomb) {
            System.out.println("\nKies een nummer van het keypad om in te drukken");
            input = scanner.nextInt();
            if (input == bomb) {
                Util.printExplosion();
            } else {
                Util.printBomb();
            }
        }
    }




    ;
}


