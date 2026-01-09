import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int MIN = 1;
        final int MAX = 100;
        final int MAX_ATTEMPTS = 5;

        int roundsPlayed = 0;
        int roundsWon = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;

        while (playAgain) {
            roundsPlayed++;
            int numberToGuess = random.nextInt(MAX - MIN + 1) + MIN;
            int attemptsLeft = MAX_ATTEMPTS;
            boolean guessedCorrectly = false;

            while (attemptsLeft > 0) {
                System.out.print("\nEnter your guess: ");
                int guess = scanner.nextInt();
                attemptsLeft--;

                if (guess == numberToGuess) {
                    System.out.println("Correct! You guessed the number.");
                    System.out.println("Attempts used: " + (MAX_ATTEMPTS - attemptsLeft));
                    roundsWon++;
                    guessedCorrectly = true;
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Too low.");
                } else {
                    System.out.println("Too high.");
                }

            }

            if (!guessedCorrectly) {
                System.out.println("\nYou are out of attempts.");
                System.out.println("The correct number was: " + numberToGuess);
            }

            System.out.print("\nDo you want to play another round? (yes/no): ");
            String response = scanner.next().toLowerCase();
            playAgain = response.equals("yes");
        }

        System.out.println("\nGame Over.");
        System.out.println("Rounds played: " + roundsPlayed);
        System.out.println("Rounds won: " + roundsWon);
        

        scanner.close();
    }
}
