import java.util.Scanner;
import java.util.Random;

public class ScrambleGame {
    public static void main(String[] args) {
        // Predefined list of words
        String[] words = {"game" , "dota2", "chaos", "houseman", "wife" , "love", "beautifull", "dragon", "boxing"};
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        boolean keepPlaying = true;
        int playerScore = 0;

        System.out.println("Welcome to Word Scramble Wizard!");
        System.out.println("Unscramble the magic word to score!");
        
        while (keepPlaying) {
            String word = words[rand.nextInt(words.length)];
            String scrambleWord = scrambleWord(word, rand);
            System.out.println("Scrambled word : " + scrambleWord);
            boolean wordGuessed = false;
            int attempts = 3;

            while (attempts > 0 && !wordGuessed) {
                System.out.print("Your guess : ");
                String userGuess = scanner.nextLine();
                
                if (userGuess.equalsIgnoreCase(word)) {
                    System.out.println("Correct! You've unscrambled the word.");
                    playerScore++;
                    wordGuessed = true;
                    System.out.println("Your score : " + playerScore);
                } else {
                    attempts--;
                    System.out.println("Wrong! Remaining Attemps : " + attempts);
                    System.out.println("Try again!");
                }
            } 

            if (!wordGuessed) {
                System.out.println("The correct word was : " + word);
            }

            System.out.println("Your current score : " + playerScore);
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.nextLine();
            keepPlaying = response.equalsIgnoreCase("yes");
        }
        System.out.println("Thank you for playing, your final score is " + playerScore);
        scanner.close();
    }

    public static String scrambleWord(String word, Random random) {
        char[] letters = word.toCharArray();
        for (int i = 0; i < letters.length; i++){
            int j = random.nextInt(letters.length);
            char temp = letters[i];
            letters[i] = letters[j];
            letters[j] = temp; 
        }

        return new String(letters);
    }

}
