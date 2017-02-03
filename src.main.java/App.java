import console.Reader;
import console.Writer;
import utils.Validations;

public class App {
	public static void main(String[] args) {
		Writer.printWelcomeMessage();

		Reader reader = new Reader();
		Validations validations = new Validations();

		String firstValue;
		String secondValue;
		String operator;

		do {
			System.out.println("Print correct first number value : ");
			firstValue= reader.readValue();
		} while (!validations.isNumberCheck(firstValue));
		
		do {
			System.out.println("Print correct mathematical operator : ");
			operator = reader.readValue();
		} while (!validations.isMathOperationCheck(operator));
		
		do {
			System.out.println("Print correct second number value : ");
			secondValue = reader.readValue();
		} while (!validations.isNumberCheck(secondValue));
	}
}
