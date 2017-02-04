package math;

public class Calculator {
	public double calculateResult(String firstValue, String operator, String secondValue) {
		IOperations operations = new Operations();

		double x = Double.parseDouble(firstValue);
		double y = Double.parseDouble(secondValue);
		double result = 0.0;

		switch (operator) {
		case "+":
			result = operations.add(x, y);
			break;
		case "-":
			result = operations.subtract(x, y);
			break;
		case "*":
			result = operations.multiply(x, y);
			break;
		case "/":
			result = operations.divide(x, y);
			break;
		case "%":
			result = operations.divideWithReminder(x, y);
			break;
		default:
			result = 0.0;
		}

		return result;

	}
}
