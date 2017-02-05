import java.io.IOException;

import console.Reader;
import console.Writer;
import math.Calculator;
import utils.Validations;

/**
 * Main class
 */
public class App {
	public static void main(String[] args) throws IOException {
		Writer.printWelcomeMessage();

		Validations validations = new Validations();
		Calculator calc = new Calculator();
		Reader reader = new Reader();

		String firstValue;
		String secondValue;
		String operator;

		for (;;) {

			do {
				System.out.println("Print first number value : ");
				firstValue = reader.readValue();
			} while (!validations.isNumberCheck(firstValue));

			do {
				System.out.println("Print mathematical operator : ");
				operator = reader.readValue();
			} while (!validations.isMathOperationCheck(operator));

			do {
				System.out.println("Print second number value : ");
				secondValue = reader.readValue();
			} while (!validations.isNumberCheck(secondValue));

			System.out.print("Expression : " + firstValue + " " + operator + " " + secondValue);

			String result = String.valueOf(calc.calculateResult(firstValue, operator, secondValue));
			System.out.println(" = " + result);
			
			System.out.println("Do you want to continue? (1 - yes, 0 - no) ");
			if (reader.readValue().equals("0")) {
				return;
			}
			System.out.print("\033[H\033[2J");  
		    System.out.flush();  
		}
	}
}
