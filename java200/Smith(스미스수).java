package java200;

/* 스미스 수 구하기 */
public class Smith {
	public static void printSmith(int t1, int t2) {
		for(int i=t1; i<t2; i++) {
			if(!Java200Math.isPrime(i)	// 소수는 소인수 분해가 되지 않기 때문에 소수는 스미스 수가 될 수 없음
					&& Java200Math.sumEach(i)==Java200Math.sumSmith(i)) {	// 각 자리의 합과 소인수 분해를 한 소수의 각 자리합이 같으면 스미스 수
				System.out.printf("%d는 스미스 수 ", i);
				Java200Math.printPrimeDivide(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// 10000~20000 사이의 스미스 수
		printSmith(10000, 20000);
	}
}
