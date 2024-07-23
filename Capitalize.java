package strings;

import java.util.Scanner;

/**
 * 5. Write a program to capitalize the first letter of each words in a
 * sentence.
 */

public class Capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();

		System.out.println(stringCaptalize(str));

	}

	private static String stringCaptalize(String str) {
		// TODO Auto-generated method stub
		if (str.isEmpty() || !str.contains(" ")) {
			return str;
		}

		int spaceIndex = str.indexOf(" ");

		String firstWord = str.substring(0, spaceIndex);
		String restOfSentence = str.substring(spaceIndex + 1);

		return Character.toUpperCase(firstWord.charAt(0)) + firstWord.substring(1) + " "
				+ stringCaptalize(restOfSentence);

	}

}
