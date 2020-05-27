package cos;

public class COS_03_10 { //해답참고

	public int solution(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) 
            for (int j = 0; j < arr.length; j++) 
                if (arr[i]%2 == 0 && arr[i]/2 == arr[j]) {
                    answer++;
                    break;
                }
        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
        COS_03_10 sol = new COS_03_10();
        int[] arr = {4, 8, 3, 6, 7, 4};
        int ret = sol.solution(arr);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
	
}
