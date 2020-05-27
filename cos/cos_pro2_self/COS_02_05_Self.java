package cos_self;

public class COS_02_05_Self {

	public static void main(String[] args) {
		int attack = 30;
		int recovery = 10;
		int hp = 60;
		System.out.println(solution(attack, recovery, hp));
	}
	
	static int solution(int attack, int recovery, int hp) {
		int result = 0;
		while(hp>0) {
			hp -= attack;
			hp += recovery;
			result++;
		}
		return result;
	}
	
}
