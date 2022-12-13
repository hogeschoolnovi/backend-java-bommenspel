import java.io.*;

public class Util {
    public static void printBomb() {
        print(new File("./resources/bomb.txt"));
    }

    public static void printExplosion() {
        print(new File("./resources/explosion.txt"));
    }

    private static void print(File file) {
        System.out.flush();
        for(int i = 0; i < 10; i++){
            System.out.println();
        }
        try {
            InputStream stream = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
            reader.lines().forEach(System.out::println);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
