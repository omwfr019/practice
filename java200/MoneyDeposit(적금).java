package java200;

/* for를 이용하여 적금 구하기 */
public class MoneyDeposit {
	// money : 월 입금액, month : 개월 수, ratio : 연 복리 %
	public static double saveUs(int money, int month, double ratio) {
		double tot = 0.0;
		double r = ratio/100/12; // r=월 복리. n%->0.0n%를 만들기 위해 %를 100으로 나누고, 연 복리를 월 복리로 변경시키기 위해 12로 나눔.
		double a = money;
		for(int i=0; i<month; i++) {
			a = a*(1+r); // 원리합계 계산
			tot += a; // 원리합계 총합
		}
		return tot;
	}
	
	public static void main(String[] args) {
		double tot = MoneyDeposit.saveUs(800000, 36, 1.5); //월 800,000원 입금 36개월 연 복리 1.5
		System.out.printf("적금 : %.0f\n", tot);
	}
}
