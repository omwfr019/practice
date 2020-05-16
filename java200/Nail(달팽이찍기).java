package java200;

/* 달팽이 만들기 */
public class Nail {
	private int m;	//행
	private int n;	//열
	private int[][] loc;
	public Nail(int m, int n) {
		super();
		this.m = m;
		this.n = n;
		loc = new int[m][n];
	}
	
	public void init() {
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				//System.out.printf("(%2d:[%d,%d])", loc[i][j],i,j);
				loc[i][j] = 0;
			}
		}
	}
	
	// 시계 방향
	public void SMake() {
		int x = 0;
		int y = 0; //(0,0)에서 시작
		int d = 0;	//d=0(오른쪽)에서 시작
		
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				loc[x][y] = i*n+j+1;	//넣고
				if(d==0) {	//오른쪽으로 이동
					if(y+1<n && loc[x][y+1]==0) {
						y++;
					} else {	//오른쪽 벽이나 숫자
						d = 1;	//아래
						x++;	//0,5(y++)=>0,6(x++)->1,6
					}
				} else if(d==1) {	//아래로 이동
					if(x+1<n && loc[x+1][y]==0) {
						x++;	//아래로
					} else {	//아래 벽이나 숫자
						d = 2;	//왼쪽으로
						y--;	//5,6(x++)=>6,6(y--)->6,5
					}
				} else if(d==2) {	//왼쪽으로
					if(y-1>=0 && loc[x][y-1]==0) {
						y--;	//왼쪽으로
					} else {	//왼쪽 벽이나 숫자
						d = 3;	//위로
						x--;	//6,1(y--)=>6,0(x--)->5,0
					}
				} else if(d==3) {
					if(x-1>=0 && loc[x-1][y]==0) {
						x--;	//위로 이동
					} else {	//위쪽 벽이나 숫자
						d = 0;	//오른쪽
						y++;	//2,0(x--)=>1,0(y++)->1,1
					}
				}
			}
		}
	}
	
	// 시계 반대 방향
	public void TMake() {
		int x=0, y=0;
		int d=1;
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				loc[x][y] = i*n+j+1;	//넣고
				if(d==0) { //오른쪽으로 (2)
					if(y+1<n && loc[x][y+1]==0) {
						y++;	//오른쪽
					} else {
						d=3;
						x--;	//위로
					}
				} else if(d==1) { //아래로 (1)
					if(x+1<n && loc[x+1][y]==0) {
						x++;	//아래로
					} else {
						d=0;
						y++;	//오른쪽
					}
				} else if(d==2) {	//왼쪽으로 (4)
					if(y-1>=0 && loc[x][y-1]==0) {
						y--;	//왼쪽
					} else {
						d=1;
						x++;	//아래
					}
				} else if(d==3) {	//위로 (3)
					if(x-1>=0 && loc[x-1][y]==0) {
						x--;	//위로
					} else {
						d=2;
						y--;	//왼쪽
					}
				}
			}
		}
	}
	
	public void print() {
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				//System.out.printf("(%2d:[%d,%d])", loc[i][j],i,j);
				System.out.printf("%2d|",loc[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Nail snail = new Nail(7,7);
		snail.SMake();
		snail.print();
		System.out.println("---------------------");
		snail.init();
		snail.TMake();
		snail.print();
	}
}
