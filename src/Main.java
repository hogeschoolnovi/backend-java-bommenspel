import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] colors = {"groen", "oker", "blauw", "rood", "paars", "aqua", "wit", "geel", "roze"};
        int bomb = random.nextInt(9);
        String input = "";

        // We gebruikern hier ".equals()" met "!" (not) voor de expressie, omdat we Strings niet kunnen vergelijken met "=="
        while (!input.equals(colors[bomb-1])) {
            System.out.println("\nKies een kleur van het keypad om in te drukken");
            input = scanner.nextLine();
            // We kunnen hier nog steeds gemakkelijk een if/else-statement gebruiken.
            // Omdat we 9 kleuren hebben, denk je al gauw aan een switch-statement, maar alle cases zouden dan alsnog deze if en else bevatten.
            // Denk er hier ook aan om ".equals()" te gebruiken ipv "==".
            if(input.equals(colors[bomb-1])){
                Util.printExplosion();
            } else {
                Util.printBomb();
            }
        }
    }




    ;
}


