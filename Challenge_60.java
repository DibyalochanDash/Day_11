package Challenge;

import java.util.Random;
import java.util.Scanner;

public class Challenge_60 {

	public static void main(String[] args) {

		
		//Create a program using do-while to implement a number guessing game.
		
		  Scanner scanner = new Scanner(System.in);
	        Random random = new Random();

	        int minRange = 1; // Minimum value for guessing
	        int maxRange = 100; // Maximum value for guessing
	        int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange; // Generate a random target number

	        int guess;
	        int attempts = 0;
	        boolean isCorrect = false;

	        System.out.println("Welcome to the Number Guessing Game!");
	        System.out.println("Guess a number between " + minRange + " and " + maxRange);

	        do {
	            System.out.print("Enter your guess: ");
	            guess = scanner.nextInt();
	            attempts++;

	            if (guess == targetNumber) {
	                isCorrect = true;
	            } else if (guess < targetNumber) {
	                System.out.println("Too low! Try again.");
	            } else {
	                System.out.println("Too high! Try again.");
	            }
	        } while (!isCorrect);

	        System.out.println("Congratulations! You guessed the number " + targetNumber + " correctly in " + attempts + " attempts.");

	        scanner.close();
	    }
	}

