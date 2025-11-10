import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException
    {
        System.out.print(read());
//        WordMatch game1 = new WordMatch("mississippi");
//        System.out.println(game1.scoreGuess("i"));
//        System.out.println(game1.scoreGuess("iss"));
//        System.out.println(game1.scoreGuess("issipp"));
//        System.out.println(game1.scoreGuess("mississippi"));
//
//        WordMatch game2 = new WordMatch("concatenation");
//        System.out.println(game2.scoreGuess("ten"));
//        System.out.println(game2.scoreGuess("nation"));
//        System.out.println(game2.findBetterGuess("ten", "nation"));
//        System.out.println(game2.scoreGuess("con"));
//        System.out.println(game2.scoreGuess("cat"));
//        System.out.println(game2.findBetterGuess("con", "cat"));
    }

    public static int read() throws FileNotFoundException
    {
        File f = new File("Guesses.txt");
        Scanner s = new Scanner(f);
        int total = 0;


        while (s.hasNext()) {
            WordMatch w = new WordMatch(s.next());
            total += w.scoreGuess(w.findBetterGuess(s.next(), s.next()));
        }
        return total;
    }
}
