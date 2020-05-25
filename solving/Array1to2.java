package solving;

// 1차원 배열 -> 2차원 배열
public class Array1to2 {

	public static void main(String[] args) {
		int a[] = { 1,3,5,7,9,11,13,15,17,19 };
		int n = 3; //column
		int b[][] = new int[a.length/n+1][n];
		int cnt = -1;
		
		for(int i=0; i<b.length; i++) {
			System.out.println("i= "+i);
			for(int j=0; j<n; j++) {
				++cnt;
				if(a.length > cnt) {
					b[i][j] = a[cnt];
					System.out.println("b["+i+"]["+j+"]= "+b[i][j]);
				}
			}
		}
		for(int i=0; i<b.length; i++) { // 출력
			for(int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
