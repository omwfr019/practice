package cos;

public class COS_05_03 {

	public int solution(int speed, int[] cars) {
        int answer = 0;
        
        for(int i = 0; i < cars.length; i++) {
            if(cars[i] >= speed * 11 / 10 && cars[i] < speed * 12 / 10)
                answer += 3;
            else if(cars[i] >= speed * 12 / 10  && cars[i] < speed * 13 / 10)
                answer += 5;
            else if(cars[i] >= speed * 13 / 10)
                answer += 7;
        }
        
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS_05_03 sol = new COS_05_03();
        int speed = 100;
        int[] cars = {110, 98, 125, 148, 120, 112, 89};
        int ret = sol.solution(speed, cars);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
	
}
