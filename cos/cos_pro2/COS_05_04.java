package cos;

public class COS_05_04 {

	public int solution(int taekwondo, int running, int[] shooting) {
        int answer = 0;

        if(taekwondo >= 25)
            answer += 250;
        else
            answer += taekwondo * 8;

        answer += 250 + (60 - running) * 5;

        int count = 0;
        for(int i = 0; i < shooting.length; i++) {
            answer += shooting[i];
            if(shooting[i] == 10)
                count++;
        }
        if(count >= 7)
            answer += 100;

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	COS_05_04 sol = new COS_05_04();
    	int taekwondo = 27;
    	int running = 63;
    	int[] shooting = {9, 10, 8, 10, 10, 10, 7, 10, 10, 10};
    	int ret = sol.solution(taekwondo, running, shooting);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
	
}
