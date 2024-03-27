package Challenge;

import java.util.Scanner;

public class Challenge_58 {

	public static void main(String[] args) {
		 // Create a program to create a simple calculator that uses a switch statement to perform basic arithmetic operations like addition, subtraction, multiplication, and division.
        
        
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator!");
        System.out.println("Enter two numbers:");

        System.out.print("Number 1: ");
        double num1 = sc.nextDouble();

        System.out.print("Number 2: ");
        double num2 = sc.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter operation number: ");
        int choice = sc.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("Result of addition: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("Result of subtraction: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("Result of multiplication: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result of division: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operation!");
        }

        sc.close();
        
        

	}

}
