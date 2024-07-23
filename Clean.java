package strings;

import java.util.Scanner;

public class Clean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String str = sc.nextLine();

		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '-' && Character.isAlphabetic(str.charAt(i + 1))) {
				temp += Character.toUpperCase(str.charAt(i + 1));
				i++;
			} else if ((str.charAt(i) + "").equals(" "))
				temp += "_";
			else if (str.charAt(i) == '4')
				temp += "a";
			else if (str.charAt(i) == '3')
				temp += "e";
			else if (str.charAt(i) == '0')
				temp += "o";
			else if (str.charAt(i) == '1')
				temp += "l";
			else if (str.charAt(i) == '7')
				temp += "t";
			else if (!Character.isAlphabetic(str.charAt(i)))
				continue;
			else
				temp += str.charAt(i);

		}
		System.out.println(temp);

	}

}
