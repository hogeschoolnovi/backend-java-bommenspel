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

        while (input!=colors[bomb]) {
            System.out.println("\nKies een kleur van het keypad om in te drukken");
            input = scanner.nextLine();
            switch(input) {
                case "groen" -> {

                }
                case "oker" -> {

                }
                case "blauw" -> {

                }
                case "rood" -> {

                }
                case "paars" -> {

                }
                case "aqua" -> {

                }
                case "wit" -> {

                }
                case "geel" -> {

                }
                case "roze" -> {

                }
            }
        }
    }




    ;
}


