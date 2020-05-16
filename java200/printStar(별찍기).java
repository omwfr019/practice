package java200;

public class printStar {
	
	/* 역삼각형 별찍기 */
	public static void printStarDecrease(int n) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<2*(n-i); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/* 다이아몬드 별찍기 */
	public static void stepDia(int n) {
		/* self
		for(int i=0; i<n; i++) {
			if(i<=n/2) {
				for(int j=0; j<n-i; j++) {
					System.out.print(" ");
				}
				for(int k=0; k<2*(i+1)-1; k++) {
					System.out.print("*");
				}
			} else {
				for(int j=0; j<i+1; j++) {
					System.out.print(" ");
				}
				for(int k=0; k<2*(n-i)-1; k++) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		*/
		for(int i=0; i<n; i++) {
			for(int j=0; j<Math.abs(i-n/2); j++) {
				System.out.print(" ");
			}
			for(int k=0; k<n-2*Math.abs(i-n/2); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		printStarDecrease(5);
		stepDia(9);
	}
}
