package swea.D1;

// 2027. 대각선 출력하기
class Solution {
	public static void main(String[] args) throws Exception {
		// Approach 1
		for (int line = 0; line < 5; line++) {
			for (int l = 0; l < line; l++) {
				System.out.print("+");
			}
			System.out.print("#");
			for (int r = 4; r > line; r--) {
				System.out.print("+");
			}
			System.out.println();
		}

		// Approach 2
		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				if (col == row) {
					System.out.print("#");
				} else {
					System.out.print("+");
				}
			}
			System.out.println();
		}
	}
}
