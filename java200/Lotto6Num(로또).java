package java200;

import java.util.Arrays;

/* 겹치는 수가 없는 로또 만들기 */
public class Lotto6Num {
	private int[] lots;
	private int base;	//45
	private int ballNum;	//6
	public Lotto6Num(int base, int ballNum) {
		this.ballNum = ballNum;
		this.base = base;
		lots = new int[ballNum];	//배열 생성
	}
	public Lotto6Num() {
		this(45, 6);
	}
	
	public void print() {
		for(int i=0; i<lots.length; i++) {
			if (i==lots.length-1) {
				System.out.printf("%d", lots[i]);
			} else {
				System.out.printf("%d,", lots[i]);
			}
		}
		System.out.println();
	}
	
	private int rand() {
		return (int)(Math.random()*base)+1;
	}
	
	public boolean contain(int n) {
		boolean isC = false;
		for (int i=0; i<lots.length; i++) {
			if(lots[i]==n) {
				isC = true;
				break;
			}
		}
		return isC;
	}
	
	public void make() {
		Arrays.fill(lots, 0);	// 배열을 0으로 초기화
		int count = 0;
		while(count != ballNum) {
			int temp = rand();
			if(! contain(temp)) {
				lots[count++] = temp;
			}
		}
		Arrays.sort(lots);
	}
	
	public int[] getLots() {
		return lots;
	}
	
	public static void main(String[] args) {
		Lotto6Num lot = new Lotto6Num(45, 6);
		lot.make();
		lot.print();
	}
}
