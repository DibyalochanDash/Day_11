package Challenge;

import java.util.Scanner;

public class Challenge_56_57 {


	public static void main(String[] args) {
		  int score = 75; //Create a program to Based on a student's score, categorize as "High", "Moderate", or "Low" using the ternary operator (e.g., High for scores > 80, Moderate for 50-80, Low for < 50)

	        String category = categorizeScore(score);

	        System.out.println("Score " + score + " is categorized as: " + category);
	            
	        System.out.println();
	        
	       // Create a program to print the month of the year based on a number (1-12) input by the user.
	       
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number (1-12) to represent the month of the year: ");
	        int monthNumber = scanner.nextInt();

	        String month = getMonthName(monthNumber);

	        if (month != null) {
	            System.out.println("The month corresponding to number " + monthNumber + " is: " + month);
	        } else {
	            System.out.println("Invalid input. Please enter a number between 1 and 12.");
	        }

	        scanner.close();
	        
	        System.out.println();
	       
	        
	    }

	private static String getMonthName(int monthNumber) {
		 switch (monthNumber) {
         case 1: return "January";
         case 2: return "February";
         case 3: return "March";
         case 4: return "April";
         case 5: return "May";
         case 6: return "June";
         case 7: return "July";
         case 8: return "August";
         case 9: return "September";
         case 10: return "October";
         case 11: return "November";
         case 12: return "December";
         default: return null; // Return null for invalid month numbers
		 }
	}

	private static String categorizeScore(int score) {
           if (score >80) {
			return "High";
		} else if(score >50) {
           return "Moderate";
		}
		return "low";
	}

}
