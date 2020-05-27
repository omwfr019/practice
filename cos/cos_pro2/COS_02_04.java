package cos;

public class COS_02_04 {

	 public String solution(String[] words) {
	     // 여기에 코드를 작성해주세요.
	     String answer = "";
	     
	     for(int i=0; i<words.length; i++) {
	    	 if(words[i].length()>=5) {
	    		 answer += words[i];
	    	 }
	     }
	     
	     if(answer.isEmpty()) return "empty";
	     return answer;
	 }
	    
	 // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	 public static void main(String[] args) {
	     COS_02_04 sol = new COS_02_04();
	     String[] words1 = {"my", "favorite", "color", "is", "violet"};
	     String ret1 = sol.solution(words1);

	     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.  
	     System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");
	        
	     String[] words2 = {"yes", "i", "am"};
	     String ret2 = sol.solution(words2);

	     // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.  
	     System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	 }
	
}
