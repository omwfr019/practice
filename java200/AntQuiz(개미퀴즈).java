package java200;

/* 문자열 특징을 이용하여 개미 퀴즈 구하기 */
/*
 * 1
 * 11
 * 12
 * 1121
 * 122111
 * 112213
 */
public class AntQuiz {
	public String ant(String s) {
		String t = "";
		char c = s.charAt(0);
		int count = 1;
		for(int i=1; i<s.length(); i++) {
			if(c==s.charAt(i)) {
				count++;
			} else {
				t = t+c+count;
				c = s.charAt(i);
				count++;
			}
		}
		t = t+c+count;
		return t;
	}
	public void ant(int stage) {
		String s = "11";
		for(int i=0; i<stage; i++) {
			System.out.println(s);
			s = ant(s);
		}
	}
	public static void main(String[] args) {
		AntQuiz quiz = new AntQuiz();
		quiz.ant(10);
	}
}
