package java200;

public class Apartment {
	private char[] pass = {'0','1','2','3','4','5','6','7','8','9'};
	private int d = 0;	// d=0이면 동서남북 4방향으로만 이동 (d=1이면 대각선을 포함하여 8반향 이동)
	public Apartment(int d) {
		this.d = d;
	}
	public int findApart(char region[][], int x, int y, char step, int depth) {
		int count = 0;	// 연속으로 붙어있는 '*'의 수
		int right = region.length;	// 행의 크기
		int bottom = region[0].length;	// 열의 크기
		if(x<0 || x>=bottom || y<0 || y>=right || region[y][x]!='*') {	// 위쪽,아래쪽,왼쪽,오른쪽 벽을 넘으면 메서드를 끝냄. '*'가 아니라면 메서드를 끝냄
			return 0;
		}
		region[y][x] = pass[depth % 10];	// 0~9를 반복 표시. 아파트 세는 과정	// '*'의 연속 개수를 숫자로 표현 (몇 번째 '*'인지)
		count = 1 + findApart(region, x, y-1, step, depth+1)
			+ findApart(region, x+1, y, step, depth+1)
			+ findApart(region, x, y+1, step, depth+1)
			+ findApart(region, x-1, y, step, depth+1);	// '*'가 있는 한 지점(x,y)에 대하여 동서남북으로 이동시키며 '*'이 있는지 확인. '*'가 있는 지점부터 시작하므로 1을 더함
		if(d>0) {	// 대각선도 같은 아파트 단지로 인정
			count += findApart(region, x+1, y-1, step, depth+1)
				+ findApart(region, x+1, y+1, step, depth+1)
				+ findApart(region, x-1, y+1, step, depth+1)
				+ findApart(region, x-1, y-1, step, depth+1);	// 동서남북뿐만 아니라 대각선 이동도 하는 경우
		}
		region[x][y] = step;	// 연속해서 붙어 있는 첫 번째 '*'의 묶음("1","2","3",...)을 'A'로, 두 번째 묶음을 'B'라는 식으로 붙여 아파트 단지를 표시
		print(region);
		return count;	// 연속적으로 붙어 있는 '*' 개수를 반환
	}
	
	public static void print(char c[][]) {
		for (int i=0; i<c.length; i++) {
			for (int j=0; j<c[i].length; j++) {
				System.out.printf("%c", c[i][j]);
			}
			System.out.println();
		}
		System.out.println("-------------------");
	}
	
	
	public static void main(String[] args) {
		int d=0;	// d=0 대각선 인정 - 같은 단지, 대각선 불인정 d=1 - 다른 단지
		Apartment apt = new Apartment(d);
		char region[][] = {
								{ '0','0','0','0','0','0','0','0' },
								{ '0','0','0','*','*','0','*','0' },
								{ '0','*','0','0','*','0','*','0' },
								{ '0','*','0','0','*','0','*','*' },
								{ '0','*','0','0','0','*','0','*' },
								{ '0','*','*','0','*','0','0','*' },
								{ '0','0','*','0','*','0','0','*' },
								{ '*','*','0','*','*','0','0','0' },
						};
		int right = region.length;
		int bottom = region[0].length;
		int count = 0;
		char steps[] = new char[26];	// A단지,B단지,...,26단지 이하
		for (int i=0; i<steps.length; i++) {
			steps[i] = (char)('A'+i);	// 26개의 단지를 'A'~'Z'로 이름 짓기
		}
		int[] sizes = new int[bottom*right];	// 단지 내 아파트 수
		int blocknums = 0;	// 단지 수
		for (int iy=0; iy<right; ++iy) {	// 연속된 아파트('*')를 아파트 단지로 만들고, 단지 내 아파트 수를 구함 
			for (int ix=0; ix<bottom; ++ix) {
				count = apt.findApart(region, ix, iy, steps[blocknums], 0);
					if (count>0) {
						sizes[blocknums++] = count;
					}
			}
		}
		System.out.printf("아파트 단지= %d개\n", blocknums);
		for (int ix=0; ix<blocknums; ++ix) {
			System.out.printf("%c 단지 = 아파트 %d개\n", steps[ix], sizes[ix]);
		}
	}
}
