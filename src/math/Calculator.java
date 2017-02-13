package math;

/**
 * Class that performs expression calculation
 */
public class Calculator {
	/**
	 * Calculate mathematical expression
	 * @param firstValue
	 * @param operator
	 * @param secondValue
	 * @return Double result value
	 */
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
			result = operations.divideWithRemainder(x, y);
			break;
		default:
			result = 0.0;
		}
		return result;
	}
}
