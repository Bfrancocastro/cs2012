package lab1;

import java.io.File;
import java.util.Scanner;
import java.io.PrintWriter;

public class SumAverage {
	public static void main(String[] args) throws Exception {
		File file = new File("src/lab1/SumAverage");
		Scanner input = new Scanner(file);

		int sum = 0;
		int count = 0;

		while (input.hasNext()) {
			sum += input.nextInt();
			System.out.println("Sum: " + sum);
			count++;
			System.out.println("count:" + count);
		}
		double average = (double) sum / count;
		System.out.println("Average: " + average);

		File fl = new File("src/lab1/Results");
		PrintWriter output = new PrintWriter(fl);

		output.print("Sum: ");
		output.print(sum);
		output.print(" Average: ");
		output.println(average);

		File refile = new File("src/lab1/SumAverage");
		Scanner result = new Scanner(refile);
		
		while(result.hasNext()) {
			output.println(result.nextInt());
		}
		
		result.close();
		output.close();
		input.close();

	}
}
