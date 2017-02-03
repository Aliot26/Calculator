package utils;

public class Validations {
	public Boolean isNumberCheck(String value) {
		try {
			Integer.parseInt(value);
		} catch (NumberFormatException e) {
			System.out.println("It's not a number!\n");
			return false;
		}

		return true;
	}

	public Boolean isMathOperationCheck(String operator) {
		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")
				|| operator.equals("^")) {
			return true;
		}

		System.out.println("It's not correct math operator!\n");
		return false;
	}
}
