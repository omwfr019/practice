package cos;

public class COS_06_10 {

	public int solution(int weight, int[] boxes) {
        int answer = 0;

        for(int i = 0; i < boxes.length; i++) 
        	if(weight*0.9 > boxes[i] || weight*1.1 < boxes[i])
        		answer++;
        	
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS_06_10 sol = new COS_06_10();
        int weight = 600;
        int[] boxes = {653, 670, 533, 540, 660};
        int ret = sol.solution(weight, boxes);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
	
}
