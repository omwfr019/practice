package solving;

//Find Largest Number Less Than Given Number And Without Given Digit.
public class FindLargestNumber {

	public static void main(String[] args) {
		System.out.println(getLLessThanN(123, 2)); //119
		System.out.println(getLLessThanN(4582, 5)); //4499
		System.out.println(getLLessThanN(98512, 5)); //98499
		System.out.println(getLLessThanN(548624, 8)); //547999
	}
	
	static int getLLessThanN(int number, int digit) {
		char c = Integer.toString(digit).charAt(0);
		//char c = Character.forDigit(digit, 10);
		
		for(int i=number; i>0; --i) {
			if(Integer.toString(i).indexOf(c) == -1) {
				return i;
			}
		}
		
		return -1;
	}

}
// 출처 : https://javaconceptoftheday.com/how-to-find-largest-number-less-than-given-number-and-without-given-digit/