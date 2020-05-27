package cos;

public class COS_04_09 {

	public int solution(int[][] height) {
        // 여기에 코드를 작성해주세요.
        int count = 0;
        
		for(int i=0; i<height.length; i++) {
			for(int j=0; j<height[i].length; j++) {
				if(i-1 >= 0 && height[i][j] > height[i-1][j]) {
					continue;
				}
				if(i+1 < 4 && height[i][j] > height[i+1][j]) {
					continue;
				}
				if(j-1 >=0 && height[i][j] > height[i][j-1]) {
					continue;
				}
				if(j+1 < 4 && height[i][j] > height[i][j+1]) {
					continue;
				}
				count++;
			}
		}

        
        return count;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS_04_09 sol = new COS_04_09();
        int[][] height = {{3, 6, 2, 8}, {7, 3, 4, 2}, {8, 6, 7, 3}, {5, 3, 2, 9}};
        int ret = sol.solution(height);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
	
}
