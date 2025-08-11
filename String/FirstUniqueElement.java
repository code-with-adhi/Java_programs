package String;

import java.util.Scanner;

public class FirstUniqueElement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = new String();
		System.out.println("Enter the string: ");
		s = sc.next();

		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j))
					count++;
			}
			if (count == 1) {
				System.out.println(s.charAt(i));
				break;
			}

		}
	}
}
