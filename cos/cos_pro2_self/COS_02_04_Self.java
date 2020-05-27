package cos_self;

public class COS_02_04_Self {

	public static void main(String[] args) {
		String[] words = {"my", "favorite", "color", "is", "violet"};
		System.out.println(solution(words));
		System.out.println(solution(new String[] {"a", "b", "cd", "efg"}));
	}
	
	static String solution(String[] words) {
		StringBuilder result = new StringBuilder();
		
		for(int i=0; i<words.length; i++) {
			if(words[i].length()>=5) {
				result.append(words[i]);
			}
		}
		if(result.length()==0) return "empty";
		return result.toString();
	}
	
}
