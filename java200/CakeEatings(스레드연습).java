package java200;

/* 쓰레드와 wait, notifyAll 메서드 이해하기 */
public class CakeEatings {
	public static void main(String[] args) {
		CakePlate cake = new CakePlate();
		CakeEater eater = new CakeEater(cake);
		CakeMaker baker = new CakeMaker(cake);
		baker.start();
		eater.start();
	}
}

class CakePlate {
	private int breadCount = 0;
	int cnt = 0;
	public CakePlate() {
	}
	
	public synchronized void makeBread() {
		if(breadCount >= 10) {
			try {
				System.out.println("빵이 남는다");
				wait();
			} catch (InterruptedException ire) {}
		}
		breadCount++;	//빵이 10개가 안 되면 더 만들기
		cnt++;
		System.out.println("빵을 1개 더 만듦. 총 : "+breadCount+"개" + " |"+cnt);
		this.notifyAll();
	}
	
	public synchronized void eatBread() {
		if(breadCount<1) {
			try {
				System.out.println("빵이 모자라 기다림");
				wait();
			} catch(InterruptedException ire) {}
		}
		breadCount--;	//빵이 있으니 먹기
		System.out.println("빵을 1개 먹음. 총 : "+breadCount+"개");
		this.notifyAll();
	}
}

class CakeMaker extends Thread {
	private CakePlate cake;
	public CakeMaker(CakePlate cake) {
		setCakePlate(cake);
	}
	public void setCakePlate(CakePlate cake) {
		this.cake = cake;
	}
	public CakePlate getCakePlate() {
		return cake;
	}
	public void run() {
		for(int i=0; i<50; i++) {
			cake.makeBread();
		}
	}
}


class CakeEater extends Thread {
	private CakePlate cake;
	public CakeEater(CakePlate cake) {
		setCakePlate(cake);
	}
	public void setCakePlate(CakePlate cake) {
		this.cake = cake;
	}
	public CakePlate getCakePlate() {
		return cake;
	}
	public void run() {
		for(int i=0; i<50; i++) {
			cake.eatBread();
		}
	}
}