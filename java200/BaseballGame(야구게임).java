package java200;

import java.util.Arrays;
import java.util.Scanner;

/* 야구 게임(숫자 맞추기) 만들기 */
// 투수가 만든 0~9 사이의 서로 다른 세 수를 10회 이내에 타자가 맞추는 숫자 맞추기 게임.
// 세 수의 위치와 값이 모두 같으면 스트라이크, 값은 같은데 위치가 다르면 볼.
public class BaseballGame {
	public static void main(String[] args) {
		Pitcher pit = new Pitcher();	//공 던지는 투수
		Hitter hit = new Hitter();	//공 던지는 타자
		Umpire ump = new Umpire();	//스트라이크, 볼 심판
		int iterCount = 0;	//10번 이내에 끝내기
		pit.make();	//공 던지기 (투수가 서로 다른 세 수를 만듦)
		ump.setPitBall(pit.getGong());	//심판에게 투수 공 넣기 (투수가 만든 세 수를 심판에게 대입)
		System.out.println("Play Base Ball~~~~~~");
		while(true) {
			iterCount++;
			hit.make();	//타자 - 공 맞추기 (타자가 투수의 세 수를 맞추기 위해 세 수를 입력)
			System.out.printf("%d번째 입력한 공 : %d, %d, %d\n",
					iterCount, hit.getGong()[0], hit.getGong()[1], hit.getGong()[2]);
			ump.setHitBall(hit.getGong());	//심판에게 타자 공 넣기 (타자가 입력한 세 수를 심판에게 대입)
			int strike = ump.strike();	//심판이 스트라이크의 수를 구함
			int ball = ump.ball();	//심판이 볼 수를 구함
			System.out.printf("%d번째 %dstrike %dball\n", iterCount, strike, ball);
			if(iterCount<10 && strike==3) {	//3 스트라이크 (10회 이하에 3개의 수를 모두 맞춤)
				System.out.println("You Win!");
				break;
			} else if(iterCount>=10 && strike<3) {	//10회 초과
				System.out.println("You Lose!");
				System.out.printf("투수 : %d, %d, %d\n", pit.getGong()[0], pit.getGong()[1], pit.getGong()[2]);
				break;
			}
		}
	}
}


class Pitcher {
	private int[] gong;
	private int n;	//3
	private int num = 10;
	public Pitcher() {
		this(10, 3);
	}
	public Pitcher(int num, int n) {
		super();
		this.n = n;
		this.num = num;
		gong = new int[n];	//gong 3개
		Arrays.fill(gong, -1);
	}
	
	public int[] getGong() {	//투수가 만든 세 수를 반환
		return gong;
	}
	
	public int makeOne() {
		return (int)(Math.random()*num);	//0~9
	}
	
	public boolean contains(int gn) {
		boolean isC = false;
		for(int i=0; i<n; i++) {	//입력받은 정수가 배열에 이미 존재하는지 판별
			if(gn==gong[i]) {
				isC = true;
				break;
			}
		}
		return isC;
	}
	
	public void make() {
		Arrays.fill(gong, -1);
		int count = 0;
		while(count!=n) {	//서로 다른 세 수가 채워질 때까지
			int temp = makeOne();
			if( !contains(temp) ) {	//임의의 정수가 배열에 있는지 판별
				gong[count++] = temp;	//없다면 저장
			}
		}
	}
	
	public void print() {
		System.out.println("Pitcher");
		for(int i=0; i<n; i++) {
			System.out.printf("%d\t", gong[i]);
		}
		System.out.println();
	}
}


class Hitter {
	private int[] gong;
	private int n;	//3
	private int num = 10;
	public Hitter() {
		this(10, 3);
	}
	public Hitter(int num, int n) {
		this.n = n;
		this.num = num;
		gong = new int[n];	//gong 3개
		Arrays.fill(gong, -1);
	}
	
	public int[] getGong() {
		return gong;
	}
	
	public void make() {
		//과제 => 서로 다르게 하시오
		System.out.println("0~9 사이 서로 다른 정수를 붙여서 입력해주세요. 예)123");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		for(int i=0; i<n; i++) {
			gong[i] = s.charAt(i)-'0';	//'1'-'0'	//"123".charAt(0)="1" | "1"-"0"=1
		}
	}
	
	public void print() {
		System.out.println("Hitter");
		for(int i=0; i<n; i++) {
			System.out.printf("%d\t", gong[i]);
		}
		System.out.println();
	}
}


class Umpire {
	private int[] pitBall;	//투수의 세 수를 저장
	private int[] hitBall;	//타자의 세 수를 저장
	private int n;
	public Umpire(int n) {
		this.n = n;
		pitBall = new int[n];
		hitBall = new int[n];
		Arrays.fill(pitBall, -1);
		Arrays.fill(hitBall, -1);
	}
	public Umpire() {
		this(3);
	}
	
	public void setPitBall(int[] pitBall) {
		System.arraycopy(pitBall, 0, this.pitBall, 0, pitBall.length);	//투수의 배열을 깊은 복사로 저장
	}
	
	public void setHitBall(int[] hitBall) {
		System.arraycopy(hitBall, 0, this.hitBall, 0, hitBall.length);	//타자의 배열을 깊은 복사로 저장
	}
	
	public int strike() {
		int count = 0;
		for(int i=0; i<n; i++) {
			if(pitBall[i]==hitBall[i]) {
				count++;
			}
		}
		return count;
	}
	
	public int ball() {
		int count = 0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i!=j && pitBall[i]==hitBall[j]) {
					count++;
				}
			}
		}
		return count;
	}
}