import java.util.InputMismatchException;
import java.util.Scanner;

class GreaterNumberException extends Exception {
	public GreaterNumberException(String message) {
		System.out.println(message);
	}
}

class InputException extends Exception {
	public InputException(int message) {
		System.out.println("Number can’t be greater than " + message);
	}
}

public class CustomException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input, limit;
		System.out.println("Enter number Limit:");
		limit = sc.nextInt();
		while (true) {
			System.out.println("Please enter a number or enter -1 if you want to quit");
			try {
				input = sc.nextInt();

				if (input == -1)
					break;
				if (input > 100)
					throw new GreaterNumberException("Number can’t be greater than 100");
				else if (input > limit)
					throw new InputException(limit);
				else if (input % 2 == 0)
					System.out.println("You have entered an even number");
				else
					System.out.println("You have entered an odd number");
			} catch (InputMismatchException e) {
				sc.nextLine();
				System.out.println("You must enter an integer");
			} catch (InputException e) {
			} catch (GreaterNumberException e) {
			}
		}
		sc.close();
	}
}
