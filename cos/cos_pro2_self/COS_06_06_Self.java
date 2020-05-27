package cos_self;

public class COS_06_06_Self {	//해답참고

	public static void main(String[] args) {
		System.out.println(solution("helloworld"));
		System.out.println(solution("Hello123"));
	}
	
	static boolean solution(String password) {
		boolean result = false;
		int capital=0, small=0, digit=0;

		for(int i=0; i<password.length(); i++) {
			if('a'<=password.charAt(i) && password.charAt(i)<='z')
				small++;
			else if('A'<=password.charAt(i) && password.charAt(i)<='Z')
				capital++;
			else if('0'<=password.charAt(i) && password.charAt(i)<='9')
				digit++;
		}
		
		if(capital>=1 && small>=2 && digit>=2) result = true;
		
		return result;
	}

}
