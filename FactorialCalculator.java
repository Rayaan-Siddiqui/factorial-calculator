import java.math.BigInteger;
import java.util.Scanner;

public class FactorialCalculator {
	
	public static void main(String[] args) {
		//Initialize variables
		int num;
		Scanner input = new Scanner(System.in);
		
		//Explain the program to user and ask for input
		System.out.println("This program can help you find the factorial of any number.");

		while (true) {
			System.out.print("Please enter a number (or -1 to exit): ");
			
			//read input
			num = input.nextInt();

			if (num == -1) {
				System.out.println("Exiting Program...");
				break;
			}

			findFactorial(num);
		}

		input.close();
	}

	public static void findFactorial(int inputNum) {
		//Initialize and declare new BigInteger variable with the value of the user's input.
		BigInteger factorial = BigInteger.valueOf(inputNum);
		
		//If statement checks if input is greater than zero and not zero.
		if (inputNum > 0 && inputNum != 0) {
			//For loop finds the factorial of the input.
			for (int i = inputNum - 1; i > 0; i--) {
				factorial = factorial.multiply(BigInteger.valueOf(i));
			}
			//Print the factorial.
			System.out.println("The factorial of " + inputNum + " is " + factorial);
			
		//If the integer does not meet requirements, this message is printed.
		} else {
			System.out.println("Please enter a positive integer.");
		}
	}
}
