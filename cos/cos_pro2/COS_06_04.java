package cos;

public class COS_06_04 {

	public int solution(String[][] cards) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        int cnt = 0;
		
		for(int i=0; i<2; i++) {
			for(int j=i+1; j<3; j++) {
				if(cards[i][0].equals(cards[j][0])) cnt++;
			}
		}
		
		answer = Integer.valueOf(cards[0][1]) + Integer.valueOf(cards[1][1]) + Integer.valueOf(cards[2][1]);
		if(cnt==2) answer *= 3;
		else if(cnt==1) answer *= 2;
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS_06_04 sol = new COS_06_04();
        String[][] cards1 = {{new String("blue"), new String("2")}, {new String("red"), new String("5")}, {new String("black"), new String("3")}};
        int ret1 = sol.solution(cards1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        String[][] cards2 = {{new String("blue"), new String("2")}, {new String("blue"), new String("5")}, {new String("black"), new String("3")}};
        int ret2 = sol.solution(cards2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }
	
}
