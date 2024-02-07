package lab1;

import java.util.Scanner;

public class UserInputInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter an integer (or type 'quit' to exit): ");
			if (sc.hasNextInt()) {
				int inputInteger = sc.nextInt();
				System.out.println("You entered: " + inputInteger);
				break;
			} else {
				String invalidInput = sc.next();
				if (invalidInput.equalsIgnoreCase("quit")) {
					System.out.println("Exiting the program as per user's request.");
					break; 
				} else {
					System.out.println("Invalid input! Please enter a valid integer or 'quit'.");
				}
			}
		}
		sc.close();
	}

}
