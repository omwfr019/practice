package solving;

import java.util.Scanner;

// Decimal To Binary, Decimal To Octal And Decimal To HexaDecimal In Java.
public class DecimalToOther {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal Number : ");
		int inputNumber = sc.nextInt();
		DecimalToBinary(inputNumber);
		DecimalToBinary2(inputNumber);
		DecimalToBinary3(inputNumber);
		DecimalToOctal(inputNumber);
		DecimalToHexaDecimal(inputNumber);
	}
	
	
	static void DecimalToBinary(int inputNumber) {
		int copyOfInputNumber = inputNumber;
		StringBuilder binary = new StringBuilder();
		int rem = 0; // store remainder
		while(inputNumber > 0) {
			rem = inputNumber % 2;
			binary.append(rem);
			inputNumber /= 2;
		}
		System.out.println("Binary Equivalent of "+copyOfInputNumber+" is "+binary.reverse());
	}
	
	static void DecimalToBinary2(int inputNumber) {
		int copyOfInputNumber = inputNumber;
		String binary = "";
		int rem = 0;
		while(inputNumber > 0) {
			rem = inputNumber % 2;
			binary = rem + binary;
			inputNumber /= 2;
		}
		System.out.println("Binary Equivalent of "+copyOfInputNumber+" is "+binary);
	}
	
	static void DecimalToBinary3(int inputNumber) {
		int copyOfInputNumber = inputNumber; 
		StringBuilder binary = new StringBuilder();
		while(inputNumber != 0){
			if(inputNumber%2 == 0) {
				binary.append("0");
			} else {
				binary.append("1");
			}
			inputNumber /= 2;
		}
		System.out.println("Binary Equivalent of "+copyOfInputNumber+" is "+binary.reverse().toString());
	}
	
	
	static void DecimalToOctal(int inputNumber) {
		int copyOfInputNumber = inputNumber;
		String octal = "";
		int rem = 0;
		while(inputNumber > 0) {
			rem = inputNumber % 8;
			octal = rem + octal;
			inputNumber /= 8;
		}
		System.out.println("Octal Equivalent of "+copyOfInputNumber+" is "+octal);
	}
	
	
	static void DecimalToHexaDecimal(int inputNumber) {
		int copyOfInputNumber = inputNumber;
		String hexa = "";
		char hexaDecimals[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int rem = 0;
		while(inputNumber > 0) {
			rem = inputNumber%16;
			hexa = hexaDecimals[rem] + hexa;
			inputNumber /= 16;
		}
		System.out.println("HexaDecimal Equivalent of "+copyOfInputNumber+" is "+hexa);
	}

}
// 출처 : https://javaconceptoftheday.com/decimal-to-binary-decimal-to-octal-decimal-to-hexadecimal-in-java/