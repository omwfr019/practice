package java200;

/* 게임 (Fifteen Game) 만들기 */
// 15 게임 : 비어 있는 한 개의 공간을 이용하여 번호를 순서대로 정렬하는 게임
// 행의 수 + 0이 있는 행의 위치 + 큰 수가 앞에 있는 바뀐 수의 총합 = 홀수

public class FifteenPuzzleMain {
	public static void main(String[] args) {
		int[][] m = {{1,2,3,4},
					 {5,6,0,7},
					 {9,10,11,8},
					 {13,14,15,12}
					};
		FifteenPuzzle puzzle = new FifteenPuzzle();	//짝수에 적용 가능
		puzzle.makePuzzle(true); 	//과정 보여 주기
		puzzle.print();
	}
}

/* ================================== */
class FifteenPuzzle {
	private int[][] puzzle;
	private int n;
	public FifteenPuzzle(int n) {
		init(n);
	}
	public FifteenPuzzle() {
		this(4);
	}
	
	public void init(int n) {
		this.n = n;
		puzzle = new int[n][n];
		for(int i=0; i<n*n; i++) {
			puzzle[i/n][i%n] = i;
			// 0 ~ n*n-1
		}
	}
	
	public int getPuzzle(int r, int c) {
		return puzzle[r][c];
	}
	
	private int num() {
		int row = puzzle.length;
		return (int)((row*row)*Math.random());	//0~15 사이 임의의 수
	}
	
	public void shuffle() {
		int row = puzzle.length;
		int col = puzzle[0].length;
		int[] sh = new int[row*col];
		FifteenPuzzleUtil.toTwoOne(puzzle, sh);
		
		for(int i=0; i<sh.length; i++) {
			int temp = num();	//?? 숫자 중복 ??
			int mtemp = sh[i];
			sh[i] = sh[temp];
			sh[temp] = mtemp;
		}
		FifteenPuzzleUtil.toOneTwo(sh, puzzle);
	}
	
	private int invertnumber() {
		int row = puzzle.length;
		int col = puzzle[0].length;
		int[] sh = new int[row*col];
		int location = 0;
		FifteenPuzzleUtil.toTwoOne(puzzle, sh);
		for(int i=0; i<sh.length; i++) {	//0의 위치를 찾음
			if(sh[i]==0) {location=i; break;}
		}
		int ivn = 0;
		for(int i=0; i<sh.length; i++) {
			for(int j=i+1; j<sh.length; j++) {
				if(i!=location && j!=location && sh[i]>sh[j]) {	//0을 제외하고 큰 수가 앞에 있어서 순서가 바뀐 경우의 수를 구함
					ivn++;
				}
			}
		}
		return ivn;
	}
	
	private int zero() {
		int row = puzzle.length;
		int col = puzzle[0].length;
		int[] sh = new int[row*col];
		FifteenPuzzleUtil.toTwoOne(puzzle, sh);
		int znum = 0;
		for(int i=0; i<sh.length; i++) {
			if(sh[i]==0) {
				znum = i/col;	//2차원을 1차원으로 변경한 후 몫(/)을 구하면 0이 있는 행의 위치를 구할 수 있음
				break;
			}
		}
		return znum;
	}
	
	public int evenpuzzle() {
		int num = 0;
		int invert = invertnumber();
		num += invert;	//큰 수가 앞에 있어 순서가 바뀐 수
		num += puzzle.length;	//행의 수 
		num += zero();	//0이 있는 행의 위치
		return num;
	}
	
	public void makePuzzle(boolean show) {
		int num = 0;
		do {	//총 합이 홀수가 될 때까지 4X4 배열을 만들고 섞음
			shuffle();
			num = evenpuzzle();
			if(show) {
				if(puzzle.length%2==0 && num%2==1) {	//홀수면 가능
					System.out.println("Even Possible Middle!");
					System.out.printf("Row : %d \n", puzzle.length);
					System.out.printf("IVN : %d \n", invertnumber());
					System.out.printf("Zero : %d \n", zero());
					System.out.printf("TOT : %d \n", num);
					System.out.println("--------------------");
				} else if(puzzle.length%2==0) {
					System.out.println("Even Impossible Middle!");
					System.out.printf("Row : %d \n", puzzle.length);
					System.out.printf("IVN : %d \n", invertnumber());
					System.out.printf("Zero : %d \n", zero());
					System.out.printf("TOT : %d \n", num);
					print();
					System.out.println("--------------------");
				}
			}
		} while((puzzle.length+num)%2==0);
	}
	
	public void print() {
		int n = puzzle.length;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%2d\t", puzzle[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
}

/* ================================== */
class FifteenPuzzleUtil {
	// 2차원 배열 -> 1차원 배열
	public static void toTwoOne(int[][] org, int[] tar) {
		int row = org.length;
		int col = org[0].length;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				tar[i*col+j] = org[i][j];
			}
		}
	}
	// 2차원 배열 -> 1차원 배열
	public static void toOneTwo(int[] org, int[][] tar) {
		int n = org.length;
		int col = tar[0].length;
		for(int i=0; i<n; i++) {
			tar[i/col][i%col] = org[i];
		}
	}
}