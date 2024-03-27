package Challenge;

public class Challenge_53_54_55 {

	public static void main(String[] args) {
		
                   
		int num1 = 10;
        int num2 = 20;

        int min = findMinimum(num1, num2);

        System.out.println("Minimum of " + num1 + " and " + num2 + " is: " + min);
         //Create a program to find the minimum of two numbers.
        
        
       // Create a program to find if the given number is even or odd.
        int number = 5; // Change the number here to test different numbers

        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        
        
        // Create a program to calculate the absolute value of a given integer.
        
        int numbers = -5; // Change the number here to test different integers

        int absValue = calculateAbsoluteValue(number);

        System.out.println("The absolute value of " + number + " is: " + absValue);
        
   
	}

	private static int calculateAbsoluteValue(int numbers) {
		
		return Math.abs(numbers);
	}

	private static boolean isEven(int number) {
		
		return number % 2 == 0;
	}

	private static int findMinimum(int num1, int num2) {
		  
		return Math.min(num1, num2);
		
	}

}
