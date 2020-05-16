package java200;

public class Java200Math {
	
	// 약수 : 나누어 떨어지는 수
	public static void printDivide(int n) {
		if(n==1) {
			System.out.println("[1]"); // 1의 약수는 1
		} else {
			System.out.printf("[1,"); // 2이상은 반드시 1로 시작
			for(int i=2; i<n; i++) {
				if(n%i==0) { // 정수 n이 나누어 떨어지면 약수
					System.out.printf("%d,", i);
				}
			}
			System.out.println(n+"]"); // 정수 n도 자신의 약수
		}
	}
	// 소인수 분해 : 소수로 나누는 것
	public static void printPrimeDivide(int n) {
		int a = 2; // 2부터 나누기
		while(n!=1) { // n이 1이 될 때까지 반복
			if(n%a==0) { // n이 a로 나누어 떨어지면 소수로 나누어 떨어지므로 소인수 분해 과정이 됨
				if(n/a==1) { // 몫이 1이면 n과 a가 같음 => 소인수 분해의 마지막 수
					System.out.println(a);
				} else {
					System.out.print(a+"x");
				}
				n/=a; // 소수로 나눔
			} else {
				a++; // 나누어 떨어지지 않으면 a의 값을 1 증가
			}
		}
	}

	// 각 자리의 합
	public static int sumEach(int n) {
		int tot = 0;
		while(n!=0) {
			tot += n%10;	// 3->2->1
			n/=10;			// 123->12->1->0
		}
		return tot;
	}
	
	// 소수 판별
	public static boolean isPrime(int n) {
		boolean isS = true;
		for (int i=2; i<(int)Math.sqrt(n); i++) {
			if(n%i==0) {
				isS = false;
				break;
			}
		}
		return isS;
	}
	
	// 소인수 분해 한 소수의 각 자리합
	public static int sumSmith(int n) {
		int tot = 0;
		int a = 2;
		while(n!=1) {
			if(n%a==0) {
				tot += sumEach(a);
				n/=a;
			} else {
				a++;
			}
		}
		return tot;
	}
	
	// 친화수 구하기
	// 친화수 : a와 b라는 서로 다른 두 자연수가 있을 때, a의 자신을 제외한 약수를 모두 더하면 b가 되고, b의 자신을 제외한 약수를 모두 더하면 a가 되는 두 수의 쌍.
	public static void printAmicable(int t1, int t2) {
		for(int i=t1; i<t2; i++) {
			int a = i;
			int b = divide(a);	// 약수의 합
			int c = divide(b);	// 약수의 합
			//System.out.println(i);
			if(a<b && a==c) {	// 같은 수 반복 금지. (220,284)와 (284,220)은 동일한 것이라 증가순(220<284)으로만 친화수를 구함.
				System.out.printf("(%d, %d)는 친화수: ", a, b);
				printDivide(a);	// 약수를 출력
				printDivide(b);	// 약수를 출력
			}
		}
	}
	public static int divide(int num) {
		int tot = 1;
		for(int i=2; i<num; i++) {
			if(num%i==0)  tot+=i;
		}
		return tot;
	}
	
	public static void main(String[] args) {
		printDivide(194560);
		printPrimeDivide(194560);
		System.out.println("--------------------------");
		printAmicable(2,20000);	// 두 수 사이의 친화수
		//printPerfect(2,20000);	// 완전수
		//printSociable(2,20000);	// 5개 사이의 친화수
	}
	
} 
