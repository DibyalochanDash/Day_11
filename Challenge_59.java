package Challenge;

import java.util.Scanner;

public class Challenge_59 {

	public static void main(String[] args) {
		//Create a program using do-while to find password checker until a valid password is entered.
     Scanner sc = new Scanner(System.in);
		String password = "jimmy21";
		
		CheckPassword(password,sc);
	}

	private static void CheckPassword(String password ,Scanner sc) {
		 String check;
	        boolean isValid = false;
	        
		do {
			System.out.println("Enter Password ");
			check = sc.nextLine();
			if (check.equals(password)) {
				isValid = true;
				System.out.println("Password is Correct.");
			} else {
				System.out.println("Password is Incorect");
			}
			
		} while (!isValid);
		
	}

}
