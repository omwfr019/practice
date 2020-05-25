package solving;

public class SumOfAllDigits {

	public static void main(String[] args) {
		//sumOfAllDigits(47862); //27
		//sumOfAllDigits(416872); //28
		//sumOfAllDigits(5674283); //35
		//sumOfAllDigits(475496215); //43
	}
	
	
	static void sumOfAllDigits1(int inputNumber) {
		int copyOfInputNumber = inputNumber;
		int sum = 0;
		
		while(copyOfInputNumber != 0) {
			int lastDigit = copyOfInputNumber%10;
			sum += lastDigit;
			copyOfInputNumber = copyOfInputNumber/10;
		}
		
		System.out.println("Sum Of All Digits In "+inputNumber+" = "+sum);
	}
	
	static void sumOfAllDigits2(int inputNumber) {
		int sum = 0;
		String num = Integer.toString(inputNumber);
		char[] strArray = num.toCharArray();
		
		for(char c : strArray) {
			sum += Character.getNumericValue(c);
			// or //sum += Integer.parseInt(String.valueOf(c));
		}
		
		System.out.println("sum : "+ sum);
	}

}
// 출처 : https://javaconceptoftheday.com/sum-of-all-digits-of-a-number-in-java/