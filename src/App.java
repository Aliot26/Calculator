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

		System.out.println("Expression : " + firstValue + " " + operator + " " + secondValue);

		String result = String.valueOf(calc.calculateResult(firstValue, operator, secondValue));
		System.out.println("Result value : " + result);
	}
}
