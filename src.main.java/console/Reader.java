package console;

import java.util.Scanner;

public class Reader {
	
	public String readValue() {
		Scanner scanner = new Scanner(System.in);
		String value;

		do {
			value = scanner.nextLine();

			if (value.isEmpty()) {
				System.out.println("You cannot leave empty string!\n");
			}
		} while (value.isEmpty());

		scanner.close();
		return value;
	}
}
