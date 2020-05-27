package cos_self;

public class COS_05_01_Self {	//???

	public static void main(String[] args) {
		int[][] ladders = {{1,2}, {3,4}, {2,3}, {4,5}, {5,6}};
		int win = 3;
		//System.out.println(solution(ladders, win));
		solution(ladders, win);
	}

	static void solution(int[][] ladders, int win) {
		int start = 0;
		int[][] temp = new int[ladders.length+1][ladders.length+1];
		System.out.println(ladders.length);
		System.out.println(ladders[0].length);
		
		for(int i=0; i<ladders.length; i++) {
			for(int j=0; j<ladders.length; j++) {
				
				temp[i][j] = 1;
			}
		}
		temp[temp.length-1][win] = 1;
		
		int x=0, y=0;
		for(int i=temp.length-1; i>=0; i--) {
			for(int j=temp[i].length-1; j>=0; j--) {
				System.out.print(temp[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
}
