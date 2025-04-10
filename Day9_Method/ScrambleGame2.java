import java.util.Scanner;
import java.util.Random;

public class ScrambleGame2 {
    private static final String[] WORDS = {
        "game", "dota2", "chaos", "houseman", "wife", "love", "beautiful", "dragon", "boxing"
    };
    private static final int MAX_ATTEMPTS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int playerScore = 0;
        boolean keepPlaying = true;

        System.out.println("Welcome to Word Scramble Wizard!");
        System.out.println("Unscramble the magic word to score points!");

        while (keepPlaying) {
            String originalWord = WORDS[random.nextInt(WORDS.length)];
            String scrambledWord;

            // Ensure scrambled word is not identical to original
            do {
                scrambledWord = scrambleWord(originalWord, random);
            } while (scrambledWord.equals(originalWord));

            System.out.println("\nScrambled word: " + scrambledWord);

            boolean wordGuessed = false;
            int attemptsLeft = MAX_ATTEMPTS;

            while (attemptsLeft > 0 && !wordGuessed) {
                System.out.print("Your guess (" + attemptsLeft + " attempt(s) left): ");
                String guess = scanner.nextLine().trim();

                if (guess.equalsIgnoreCase(originalWord)) {
                    System.out.println("Correct! You've unscrambled the word.");
                    playerScore++;
                    wordGuessed = true;
                } else {
                    attemptsLeft--;
                    if (attemptsLeft > 0) {
                        System.out.println("Wrong! Try again.");
                    }
                }
            }

            if (!wordGuessed) {
                System.out.println("Out of attempts! The correct word was: " + originalWord);
            }

            System.out.println("Current Score: " + playerScore);
            System.out.print("Do you want to play again? (yes/no): ");
            keepPlaying = scanner.nextLine().trim().equalsIgnoreCase("yes");
        }

        System.out.println("\nThanks for playing! Final score: " + playerScore);
        scanner.close();
    }

    private static String scrambleWord(String word, Random random) {
        char[] chars = word.toCharArray();
        for (int i = chars.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }
}
