package console;

import java.util.Scanner;

/**
 * Reader class with Scanner implementation
 */
public class Reader {
	/**
	 * Method for reading user input 
	 * @return Input string
	 */
	public String readValue() {
		Scanner scanner = new Scanner(System.in);
		String value;

		do {
			value = scanner.nextLine();
			if (value.isEmpty()) {
				System.out.println("You cannot leave empty string!\n");
			}
		} while (value.isEmpty());
		return value;
	}
}
