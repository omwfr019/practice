package cos;

public class COS_01_02 {

	public int solution(int price, String grade) {
        // Write code here.
        int answer = 0;
        
        if(grade.equals("S")) {
        	answer = (int)(price - price*(5/(double)100));
        } else if(grade.equals("G")) {
        	answer = (int)(price - price*(10/(double)100));
        } else if(grade.equals("V")) {
        	answer = (int)(price - price*(15/(double)100));
        }
        
        return answer;
    }    

    // The following is main method to output testcase.
    public static void main(String[] args) {
        COS_01_02 sol = new COS_01_02();
        int price1 = 2500;
        String grade1 = new String("V");
        int ret1 = sol.solution(price1, grade1);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret1 + " .");
        
        int price2 = 96900;
        String grade2 = new String("S");
        int ret2 = sol.solution(price2, grade2);
        
        // Press Run button to receive output.
        System.out.println("Solution: return value of the method is " + ret2 + " .");
    }
	
}
