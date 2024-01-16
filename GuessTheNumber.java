import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int rangeStart = 1;
        int rangeEnd = 100;
        int targetNumber = random.nextInt(rangeEnd - rangeStart + 1) + rangeStart;
        int attempts = 0;
        int maxAttempts = 5;

        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + rangeStart + " and " + rangeEnd);
        System.out.println("Can you guess it?");

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            scanner.nextLine(); // Consume the remaining newline character

            attempts++;

            if (guess == targetNumber) {
                System.out.println("Congratulations! You guessed the number correctly.");
                System.out.println("You took " + attempts + " attempt(s) to guess the number.");
                break;
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }

            if (attempts == maxAttempts) {
                System.out.println("Oops! You have reached the maximum number of attempts.");
                System.out.println("The number I was thinking of was: " + targetNumber);
            }
        }

        scanner.close();
    }
}
