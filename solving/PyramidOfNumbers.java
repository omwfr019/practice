package solving;

import java.util.Scanner;

public class PyramidOfNumbers {

	public static void main(String[] args) {
		site();
		self();
	}
	
	static void self () {
		System.out.println("----------------------------");
		
		System.out.println("<Pattern 1>");
		for(int i=1; i<=9; i++) {
			for(int b=9-i; b>0; b--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n<Pattern 2>");
		for(int i=1; i<=9; i++) {
			for(int b=9-i; b>0; b--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n<Pattern 3>");
		for(int i=1; i<=9; i++) {
			for(int b=9-i; b>0; b--) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("\n<Pattern 4>");
		for(int i=1; i<=9; i++) {
			for(int b=9-i; b>0; b--) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			for(int k=i-1; k>=1; k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n<Pattern 5>");
		for(int i=1; i<=9; i++) {
			for(int b=0; b<i-1; b++) {
				System.out.print("  ");
			}
			for(int j=1; j<=10-i; j++) {
				System.out.print(j+" ");
			}
			for(int k=9-i; k>0; k--) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n<Pattern 6>");
		for(int i=1; i<=9; i++) {
			for(int b=9; b>i; b--) {
				System.out.print("  ");
			}
			for(int j=i-1; j>=0; j--) {
				System.out.print((9-j)+" ");
			}
			for(int k=1; k<i; k++) {
				System.out.print((9-k)+" ");
			}
			System.out.println();
		}
		
		System.out.println("----------------------------");
	}
	
	
	static void site () {
		Scanner sc = new Scanner(System.in);
		System.out.print("\n숫자를 입력하세요 : ");
		int noOfRows = sc.nextInt();
		int rowCount = 1;
		
		System.out.println("----------------------------");
		
		System.out.println("<Pattern 1>");
		for(int i=noOfRows; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=rowCount; j++) {
				System.out.print(rowCount+" ");
			}
			System.out.println();
			rowCount++;
		}
		
		rowCount = 1;
		System.out.println("\n<Pattern 2>");
		for(int i=noOfRows; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=rowCount; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
			rowCount++;
		}
		
		rowCount = 1;
		System.out.println("\n<Pattern 3>");
		for(int i=noOfRows; i>0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=rowCount; j++) {
				System.out.print("* ");
			}
			System.out.println();
			rowCount++;
		}
		
		rowCount = 1;
		System.out.println("\n<Pattern 4>");
		for(int i=noOfRows; i>0; i--) {
			for(int j=1; j<=i*2; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=rowCount; j++) {
				System.out.print(j+" ");
			}
			for(int j=rowCount-1; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			rowCount++;
		}
		
		rowCount = noOfRows;
		System.out.println("\n<Pattern 5>");
		for(int i=0; i<noOfRows; i++) {
			for(int j=1; j<=i*2; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=rowCount; j++) {
				System.out.print(j+" ");
			}
			for(int j=rowCount-1; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			rowCount--;
		}
		
		rowCount = 1;
		System.out.println("\n<Pattern 6>");
		for(int i=noOfRows; i>=1; i--) {
			for(int j=1; j<=i*2; j++) {
				System.out.print(" ");
			}
			for(int j=i; j<=noOfRows; j++) {
				System.out.print(j+" ");
			}
			for(int j=noOfRows-1; j>=i; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
			rowCount++;
		}
		
		System.out.println("----------------------------");
	}

}
// 출처 : https://javaconceptoftheday.com/how-to-create-pyramid-of-numbers-in-java/