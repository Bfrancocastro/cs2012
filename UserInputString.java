package lab1;

import java.util.Scanner;

public class UserInputString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("You have entered: " + str);

		System.out.print("Enter an integer: ");
		int num = sc.nextInt();
		System.out.println("You have entered: " + num);

		System.out.print("Enter any number: ");
		if (sc.hasNextInt()) {
			System.out.println("You have entered an intger.");
		} else if (sc.hasNextFloat()) {
			System.out.println("You have enetered a float.");
		} else {
			System.out.println("You have entered a string.");
		}
		sc.close();
	}

}
