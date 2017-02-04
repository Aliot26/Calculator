import console.Reader;
import console.Writer;
import math.Calculator;
import utils.Validations;

public class App {
	public static void main(String[] args) {
		Writer.printWelcomeMessage();

		Validations validations = new Validations();
		Calculator calc = new Calculator();
		Reader reader = new Reader();

		String firstValue;
		String secondValue;
		String operator;

		for (;;) {

			do {
				System.out.println("Print correct first number value : ");
				firstValue = reader.readValue();
			} while (!validations.isNumberCheck(firstValue));

			do {
				System.out.println("Print correct mathematical operator : ");
				operator = reader.readValue();
			} while (!validations.isMathOperationCheck(operator));

			do {
				System.out.println("Print correct second number value : ");
				secondValue = reader.readValue();
			} while (!validations.isNumberCheck(secondValue));

			System.out.print("Expression : " + firstValue + " " + operator + " " + secondValue);

			String result = String.valueOf(calc.calculateResult(firstValue, operator, secondValue));
			System.out.println(" = " + result);
			
			System.out.println("Do you want to continue? (1 - yes, 0 - no) ");
			if (reader.readValue().equals("0")) {
				return;
			}
		}
	}
}
