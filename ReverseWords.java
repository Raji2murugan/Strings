package strings;

import java.util.Scanner;

/**
 * 3. Write a program to reverse the words in a sentence.
 */

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();

		System.out.println(stringReverse(str));

	}

	private static String stringReverse(String str) {
		// TODO Auto-generated method stub
        if (str.isEmpty() || !str.contains(" ")) {
            return str;
        }

        int spaceIndex = str.indexOf(" ");

        String firstWord = str.substring(0, spaceIndex);
        String restOfSentence = str.substring(spaceIndex + 1);

        return stringReverse(restOfSentence) + " " + firstWord;
	}

}
