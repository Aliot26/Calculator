package utils;

/**
 * Validation class for user input check
 */
public class Validations {
	/**
	 * Check if user input value is number
	 * @param value Entered value
	 * @return Boolean value as the validation result
	 */
	public Boolean isNumberCheck(String value) {
		try {
			Double.parseDouble(value);
		} catch (NumberFormatException e) {
			System.out.println("It's not a number!\n");
			return false;
		}
		return true;
	}

	/**
	 * Check if user input value is mathematical operation
	 * @param operator Entered value
	 * @return Boolean value as the validation result
	 */
	public Boolean isMathOperationCheck(String operator) {
		if (operator.equals("+") || operator.equals("-") || operator.equals("*") 
				|| operator.equals("/") || operator.equals("%")) {
			return true;
		}
		System.out.println("It's not correct math operator!\n");
		return false;
	}
}
