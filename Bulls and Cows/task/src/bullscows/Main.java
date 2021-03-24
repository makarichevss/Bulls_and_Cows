package bullscows;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		int codeLength = 0;
		int codeSymbols = 0;
		boolean isGuessed = false;
		int turn = 1;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please, enter the secret code's length:");
		try {
			codeLength = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.printf("Error: \"%s\" isn't a valid number.\n", codeLength);
			return;
		}
		System.out.println("Input the number of possible symbols in the code:");
		try {
			codeSymbols = Integer.parseInt(scanner.nextLine());
		} catch (NumberFormatException e) {
			System.out.printf("Error: \"%s\" isn't a valid number.\n", codeSymbols);
			return;
		}

		if (codeLength <= codeSymbols && codeLength != 0 && codeSymbols < 37) {
			System.out.println("Okay, let's start a game!");
			RandomNumbers random = new RandomNumbers();
			System.out.printf("The secret is prepared: %s.\n", random.generateSecretCode(codeLength, codeSymbols));
			while (!isGuessed) {
				System.out.printf("Turn %d:\n", turn);
				String number = scanner.next();
				isGuessed = random.guessNumber(number);

				if (isGuessed) {
					System.out.println("Congratulations! You guessed the secret code.");
				} else {
					turn++;
				}
			}
		} else if (codeLength > codeSymbols) {
			System.out.printf("Error: it's not possible to generate a code with a length of " +
					"%s with %s unique symbols.", codeLength, codeSymbols);

		} else {
			System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
		}
	}
}

class RandomNumbers {
	private String charPool;
	private String secretCode;

	public RandomNumbers() {
		StringBuilder pool = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			pool.append(i);
		}
		for (int i = 97; i < 123; i++) {
			pool.append((char) i);
		}
		charPool = pool.toString();
		System.out.println(charPool);
	}

	public boolean guessNumber(String number) {
		int bulls = 0;
		int cows = 0;
		for (int i = 0; i < number.length(); i++) {
			if (secretCode.charAt(i) == number.charAt(i)) {
				bulls++;
			} else if (secretCode.contains(String.valueOf(number.charAt(i)))) {
				cows++;
			}
		}

		String result;
		if (bulls != 0) {
			if (cows != 0) {
				result = String.format("%d bull(s) and %d cow(s)", bulls, cows);
			} else {
				result = String.format("%d bull(s)", bulls);
			}
		} else {
			if (cows != 0) {
				result = String.format("%d cow(s)", cows);
			} else {
				result = "None";
			}
		}
		System.out.printf("Grade: %s.\n", result);
		return bulls == secretCode.length();
	}
	
	public String generateSecretCode(int len, int asterisk) {
		StringBuilder code = new StringBuilder();
		StringBuilder result = new StringBuilder();
		Random random = new Random();
		int randomCode;
		while (code.length() < len) {
			randomCode = random.nextInt(asterisk);
			if (!code.toString().contains(String.valueOf(charPool.charAt(randomCode)))
					&& code.length() < len) {
				code.append(charPool.charAt(randomCode));
				result.append("*");
			}
		}
		secretCode = code.toString();
		if (asterisk < 10) {
			result.append(" (0-9)");
		} else {
			result.append(" (0-9, a-");
			result.append(charPool.charAt(asterisk - 1));
			result.append(")");
		}
		return result.toString();
	}
}