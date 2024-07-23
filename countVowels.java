package strings;

import java.util.Scanner;

/**
 * 1. Create a program to count vowels in a given string using string functions
 */
public class countVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();

		System.out.println(vowelCount(str));

	}

	private static int vowelCount(String str) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (("aeiou").contains(str.charAt(i) + "") || ("AEIOU").contains(str.charAt(i) + ""))
				count++;
		}
		return count;
	}

}
