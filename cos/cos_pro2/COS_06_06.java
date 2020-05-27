package cos;

public class COS_06_06 {
	
	public boolean solution(String password) {
        boolean answer = true;

        int capitalCount = 0, smallCount = 0, digitCount = 0;
        for(int i = 0; i < password.length(); i++) {
        	if(password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
			capitalCount++;
		else if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
			smallCount++;
		else if(password.charAt(i) >= '0' && password.charAt(i) <= '9')
			digitCount++;
        }

        if(capitalCount>=1 && smallCount>=2 && digitCount>=2)
        	answer = true;
        else
        	answer = false;

        return answer;
    }

    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	COS_06_06 sol = new COS_06_06();
    	String password1 = new String("helloworld");
    	boolean ret1 = sol.solution(password1);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

    	String password2 = new String("Hello123");
    	boolean ret2 = sol.solution(password2);

    	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
    	System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }

}
