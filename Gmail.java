package strings;

import java.util.Scanner;

/**
 * 4. Write a program to validate email address (contains @ and proper domain
 * format). Note: Don't use regular expressions
 */

public class Gmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the email ");
		String email = sc.nextLine();

		System.out.println(checkMail(email));

	}

	private static boolean checkMail(String email) {

		int at = email.indexOf('@');
		if (at == -1 || email.indexOf('@', at + 1) != -1) {
			return false;
		}

		String name = email.substring(0, at);
		String domain = email.substring(at + 1);

		if (name.isEmpty() ||!Character.isAlphabetic(name.charAt(0)) ||Character.isDigit(name.charAt(0))) {
			return false;
		}

		int dot = domain.indexOf('.');
		if (dot == -1 || dot == 0 || dot == domain.length() - 1) {
			return false;
		}

		String domainName = domain.substring(0, dot);
		String topLevelDomain = domain.substring(dot + 1);
		if (domainName.isEmpty() || topLevelDomain.isEmpty()) {
			return false;
		}

		return true;
	}

}
