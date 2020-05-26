package solving;

import java.util.Scanner;

// Find Roman Equivalent Of A Decimal Number In Java.
/*
 * Symbol	Value
 * I		1
 * V		5
 * X		10
 * L		50
 * C		100
 * D		500
 * M		1000
 */
public class RomanEquivalentOfDecimal {

	public static void main(String[] args) {
		String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int[] decimals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Decimal Number Between 1 and 3999");
		int inputNumber = sc.nextInt();
		int copyOfInputNumber = inputNumber;
		String roman = "";
		
		if(inputNumber>=1 && inputNumber<=3999) {
			for(int i=0; i<13; i++) {
				while(inputNumber >= decimals[i]) {
					inputNumber = inputNumber - decimals[i];
					roman = roman + romanSymbols[i];
				}
			}
			System.out.println("Roman Equivalent Of "+copyOfInputNumber+" is : "+roman);
		} else {
			System.out.println("Invalid Number");
		}
	}

}
// 출처 : https://javaconceptoftheday.com/how-to-find-roman-equivalent-of-a-decimal-number-in-java/