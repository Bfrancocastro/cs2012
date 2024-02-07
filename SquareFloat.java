package lab1;

import java.util.Scanner;

public class SquareFloat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a float: ");

			if (sc.hasNextFloat()) {
				float value = sc.nextFloat();
				System.out.println("You entered: " + value);
				float square = squResult(value);
				System.out.println("Square of the input: " + square);
				break;
			} else {
				System.out.println("Invalid input! Please enter a valid float");
				sc.next();
			}

		}
		sc.close();
	}

	public static float squResult(float value) {
		float result;
		result = value * value;
		return result;
	}

}