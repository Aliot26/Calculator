package math;

/**
 * Interface, that provides possible arithmetical operations
 */
public interface IOperations {

	/**
	 * Addition operation
	 * @param x First value
	 * @param y	Second value
	 * @return Result value
	 */
	Double add(double x, double y);

	/**
	 * Subtraction operation
	 * @param x First value
	 * @param y	Second value
	 * @return Result value
	 */
	Double subtract(double x, double y);

	/**
	 * Multiplication operation
	 * @param x First value
	 * @param y	Second value
	 * @return Result value
	 */
	Double multiply(double x, double y);

	/**
	 * Division operation
	 * @param x First value
	 * @param y	Second value
	 * @return Result value
	 */
	Double divide(double x, double y);

	/**
	 * Division with reminder operation
	 * @param x First value
	 * @param y	Second value
	 * @return Result value
	 */
	Double divideWithRemainder(double x, double y);
}
