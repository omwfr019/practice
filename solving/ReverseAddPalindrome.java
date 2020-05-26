package solving;

import java.util.Scanner;

// Reverse And Add A Number Until You Get A Palindrome.
// 회문Palindrome : 역순으로 읽어도 같은 말이나 구절 또는 숫자.
public class ReverseAddPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int inputNumber = sc.nextInt();
		reverseAndAdd(inputNumber);
	}
	
	static int reverseNumber(int number) {
		int reverse = 0;
		int rem = 0;
		while(number != 0) {
			rem = number % 10;
			reverse = (reverse*10) + rem;
			number /= 10;
		}
		return reverse;
	}
	
	static boolean checkPalindrome(int number) {
		int reverse = reverseNumber(number);
		if(reverse == number) {
			return true;
		} else {
			return false;
		}
	}
	
	static void reverseAndAdd(int number) {
		if(checkPalindrome(number)) {
			System.out.println("Given Number is already a palindrome");
		} else {
			while(!checkPalindrome(number)) {
				int reverse = reverseNumber(number);
				int sum = number + reverse;
				System.out.println(number+" + "+reverse+" = "+sum);
				number = sum;
			}
		}
	}

}
// 출처 : https://javaconceptoftheday.com/how-to-reverse-and-add-number-until-you-get-palindrome/