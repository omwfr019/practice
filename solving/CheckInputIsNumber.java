package solving;

import java.util.Scanner;

// Java Program To Check Whether User Input Is Number Or Not.
public class CheckInputIsNumber {

	public static void main(String[] args) {
		System.out.println("Enter your mobile number");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if(numberOrNot(input)) {
			System.out.println("you have entered valid mobile number.");
		} else {
			System.out.println("you have entered invalid mobile number. try again...");
		}
	}
	
	static boolean numberOrNot(String input) {
		try {
			Integer.parseInt(input);
		} catch (NumberFormatException ex) {
			return false;
		}
		return true;
	}

}
// 출처 : https://javaconceptoftheday.com/java-program-to-check-user-input-is-number-or-not/