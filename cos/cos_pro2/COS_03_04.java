package cos;

public class COS_03_04 {

	public int solution(String[] words, String word) {
        // 여기에 코드를 작성해주세요.
        int count = 0;
        
        int j=0;
        for(int i=0; i<words.length; i++) {
        	while(words[i].length()>j && word.length()>j) {
        		if(words[i].charAt(j) != word.charAt(j)) count++;
        		j++;
        	}
        	j=0;
        }
        
        return count;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
        COS_03_04 sol = new COS_03_04();
        String[] words = {new String("CODE"), new String("COED"), new String("CDEO")};
        String word = new String("CODE");
        int ret = sol.solution(words, word);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
    }
	
}
