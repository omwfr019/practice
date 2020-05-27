package cos_self;

public class COS_03_05_Self {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {13, 33, 45, 11, 20}, "Bus"));
		System.out.println(solution(new int[] {25, 11, 27, 56, 7, 19, 52, 31, 77, 8}, "Ship"));
	}
	
	static int solution(int[] memberAge, String transportation) {
		int adult = 0, child = 0;
		
		for(int i=0; i<memberAge.length; i++) {
			if("Bus".equals(transportation)) {
				if(memberAge[i] < 20) {
					child += 15000;
				} else {
					adult += 40000;
				}
			} else if("Ship".equals(transportation)) {
				if(memberAge[i] < 20) {
					child += 13000;
				} else {
					adult += 30000;
				}
			} else if("Airplane".equals(transportation)) {
				if(memberAge[i] < 20) {
					child += 45000;
				} else {
					adult += 70000;
				}
			}
		}
		if(memberAge.length >= 10) {
			adult *= 0.9;
			child *= 0.8;
		}
		
		return adult+child;
	}

}
