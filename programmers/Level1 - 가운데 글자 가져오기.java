package programmers;

// Level 1 - 가운데 글자 가져오기
class Solution {
    public String solution(String s) {
        String answer = "";
        int cnt = s.length();
        
        answer = String.valueOf(s.charAt(cnt/2));
        if(cnt%2==0){
            answer = String.valueOf(s.charAt(cnt/2-1) + answer);
        }
        
        return answer;
    }
}