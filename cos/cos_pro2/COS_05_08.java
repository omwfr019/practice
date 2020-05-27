package cos;

public class COS_05_08 {

	 public int solution(int usage) {
	        int answer = 0;
	        
	        if(usage > 30)
	            answer = 20 * 430 + 10 * 570 + (usage - 30) * 840;
	        else if(usage > 20)
	            answer = 20 * 430 + (usage - 20) * 570;
	        else
	            answer = usage * 430;
	        
	        return answer;
	    }
	    
	    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. 아래에는 잘못된 부분이 없으니 위의 코드만 수정하세요.
	    public static void main(String[] args) {
	        COS_05_08 sol = new COS_05_08();
	        int usage = 35;
	        int ret = sol.solution(usage);
	        
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	    }
	
}
