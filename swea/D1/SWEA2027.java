package swea.D1;

// 2027. 대각선 출력하기
public class SWEA2027 {
	public static void main(String[] args) throws Exception {
		for(int line=0; line<5; line++) {
			for(int i=0; i<line; i++) {
				System.out.print("+");
			}
			System.out.print("#");
			for(int k=4; k>line; k--) {
				System.out.print("+");
			}
			System.out.println();
		}
	}

}
