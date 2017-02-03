package math;

public class Operations implements IOperations {

	@Override
	public Double add(double x, double y) {
		return x + y;
	}

	@Override
	public Double subtract(double x, double y) {
		return x - y;
	}

	@Override
	public Double multiply(double x, double y) {
		return x * y;
	}

	@Override
	public Double divide(double x, double y) {
		if (y != 0) {
			return x / y;
		} else {
			throw new ArithmeticException("Division by zero!");
		}
	}

	@Override
	public Double involute(double x) {
		return Math.pow(x, 2.0);
	}

}
