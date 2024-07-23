package strings;

import java.util.Scanner;

/**
 * 2. Write a program to reverse the characters of a string.
 */
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();

		System.out.println(stringReverse(str));

	}

	private static String stringReverse(String str) {
		// TODO Auto-generated method stub
		if (str.length() < 1)
			return str;

		return str.charAt(str.length() - 1) + stringReverse(str.substring(0, str.length() - 1));
	}

}
