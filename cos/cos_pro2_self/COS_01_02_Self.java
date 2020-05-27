package cos_self;

import java.util.Scanner;

public class COS_01_02_Self {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = sc.nextInt();
		char grade = sc.next().charAt(0);
		int result = 0;
		result = solution(price, grade);
	}
	
	static int solution(int price, char grade) {
		int copyOfPrice = price;
		char[] shopGrade = {'S', 'G', 'V'};
		int[] discount = {5, 10, 15};
		
		int n = -1;
		for(int i=0; i<shopGrade.length; i++) {
			if (shopGrade[i] == grade) {
				copyOfPrice -= (copyOfPrice * discount[i]/100);
				n = i;
			}
		}
		
		System.out.println(price+"원의 "+discount[n]+"%는 "+copyOfPrice+"원 입니다.");
		return price;
	}
	
}
