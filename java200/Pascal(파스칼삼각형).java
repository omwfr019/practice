package java200;

/* 배열로 파스칼의 삼각형 만들기 */
public class Pascal {
	public static int[][] triAngle(int n){
		int[][] pt = new int[n][];	//zigzag
		for(int i=0; i<n; i++) {
			pt[i] = new int[i+1];
			pt[i][0] = 1;
			// nCr = n-1Cr-1 + n-1Cr
			for(int j=1; j<i; j++) {
				pt[i][j] = pt[i-1][j-1] + pt[i-1][j];
			}
			pt[i][i] = 1;
		}
		return pt;
	}
	
	public static int[] phibo(int n) {
		int[] pt = new int[n];	//zigzag
		pt[0]=1; pt[1]=1;
		for(int i=2; i<n; i++) {
			pt[i] = pt[i-1] + pt[i-2];
		}
		return pt;
	}
	
	public static void main(String[] args) {
		int[][] pt = Pascal.triAngle(10);
		for(int i=0; i<pt.length; i++) {
			for(int j=0; j<pt[i].length; j++) {
				System.out.printf("%d\t", pt[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		int[] bt = Pascal.phibo(20);
		for(int i=0; i<bt.length; i++) {
			System.out.printf("%d\t", bt[i]);
		}
	}
}
