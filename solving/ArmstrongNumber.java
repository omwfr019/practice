package solving;

public class ArmstrongNumber {
	// Armstrong number : 숫자가 각 자릿수의 거듭 제곱의 합과 같은 경우.
	/* 
	 * 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
	 * 407 = 4^3 + 0^3 + 7^3 = 64 + 0 + 343 = 407
	 * 9474 = 9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474
	 * 54748 = 5^5 + 4^5 + 7^5 + 4^5 + 8^5 = 3125 + 1024 + 16807 + 1024 + 32768 = 54748
	 */

	public static void main(String[] args) {
		//checkArmstrongNumber(153);
		//checkArmstrongNumber(371);
		//checkArmstrongNumber(9474);
		//checkArmstrongNumber(54748);
		//checkArmstrongNumber(407);
		//checkArmstrongNumber(1674); //false
	}
	
	
	static void checkArmstrongNumber1 (int number) {
		int copyOfNumber = number;
		int noOfDigits = String.valueOf(number).length();
		int sum = 0;
		
		while(copyOfNumber != 0) {
			int lastDigit = copyOfNumber % 10;
			int lastDigitToThePowerOfNoOfDigits = 1;
			
			for(int i=0; i<noOfDigits; i++) {
				lastDigitToThePowerOfNoOfDigits = lastDigitToThePowerOfNoOfDigits * lastDigit;
			}
			sum = sum + lastDigitToThePowerOfNoOfDigits;
			copyOfNumber = copyOfNumber / 10;
		}
		
		if(sum == number) System.out.println(number+" is an armstrong number");
		else System.out.println(number+" is not an armstrong number");
	}
	
	
	static void checkArmstrongNumber2 (int number) {
		int numOfDigits = String.valueOf(number).length();
		int copyOfNum = number;
		int sum = 0;
		
		while(copyOfNum > 0) {
			sum += Math.pow(copyOfNum%10, numOfDigits);
			copyOfNum /= 10;
		}
		
		if(sum == number) System.out.println(number+" is an armstrong number");
		else System.out.println(number+" is not an armstrong number");
	}
	
	
	static void checkArmstrongNumber3 (int number) {
		String strNumber = String.valueOf(number);
		int value = 0;
		
		for(int i=0; i<strNumber.length(); i++) {
			value += Math.pow(Integer.parseInt(strNumber.substring(i, i+1)), strNumber.length());
		}
		
		if(value == number) System.out.println(number+" is an armstrong number");
		else System.out.println(number+" is not an armstrong number");
	}

}
// 출처 : https://javaconceptoftheday.com/armstrong-number-in-java/