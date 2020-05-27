package cos_self;

public class COS_04_09_Self {

	public static void main(String[] args) {
		int[][] height = {{3,6,2,8}, {7,3,4,2}, {8,6,7,3}, {5,3,2,9}};
		System.out.println(solution(height));
	}
	
	static int solution(int[][] height) {
		int result = 0;
		
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
				result++;
			}
		}
		
		return result;
	}

}
