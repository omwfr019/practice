package solving;

public class CheckNumberIsBinary {

	public static void main(String[] args) {
		//isBinaryOrNot(128956);
        //isBinaryOrNot(101110);
        //isBinaryOrNot(42578);
        //isBinaryOrNot(10110101);
	}
	
	static void isBinaryOrNot1(int number) {
		boolean isBinary = true;
		int copyOfNumber = number;
		
		while(copyOfNumber != 0) {
			int temp = copyOfNumber%10;
			if(temp > 1) {
				isBinary = false;
				break;
			} else {
				copyOfNumber /= 10;
			}
		}
		
		if (isBinary) {
			System.out.println(number+" is a binary number");
		} else {
			System.out.println(number+" is not a binary number");
		}
	}
	
	static void isBinaryOrNot2(int number) {
		boolean isBinary = true;
		int copyOfNumber = number;
		
		while(copyOfNumber != 0) {
			int temp = copyOfNumber%10;
			if(!(temp==0 || temp==1)) {
				isBinary = false;
				break;
			} else {
				copyOfNumber /= 10;
			}
		}
		
		if (isBinary) {
			System.out.println(number+" is a binary number");
		} else {
			System.out.println(number+" is not a binary number");
		}
	}

}
// 출처 : https://javaconceptoftheday.com/java-program-check-whether-given-number-binary-or-not/