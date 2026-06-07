import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        // Create random number between 1 and 100
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        Scanner input = new Scanner(System.in);
        int guess = 0;
        int attempts = 0;

        System.out.println(" Welcome to Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100");

        // Loop until correct guess
        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            guess = input.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println(" Too High!");
            } else if (guess < secretNumber) {
                System.out.println(" Too Low!");
            } else {
                System.out.println(" Correct! You guessed the number.");
                System.out.println("Total attempts: " + attempts);
            }
        }

        input.close();
    }
}
