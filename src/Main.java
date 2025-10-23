public class Main {
    public static void main(String[] args)
    {
        WordMatch game1 = new WordMatch("mississippi");
        System.out.println(game1.scoreGuess("i"));
        System.out.println(game1.scoreGuess("iss"));
        System.out.println(game1.scoreGuess("issipp"));
        System.out.println(game1.scoreGuess("mississippi"));

        WordMatch game2 = new WordMatch("concatenation");
        System.out.println(game2.scoreGuess("ten"));
        System.out.println(game2.scoreGuess("nation"));
        System.out.println(game2.findBetterGuess("ten", "nation"));
        System.out.println(game2.scoreGuess("con"));
        System.out.println(game2.scoreGuess("cat"));
        System.out.println(game2.findBetterGuess("con", "cat"));
    }
}
