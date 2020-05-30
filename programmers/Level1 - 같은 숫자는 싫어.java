package programmers;

// Level 1 - 같은 숫자는 싫어
public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        int cnt = 1;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]!=arr[i])  cnt++;
        }
        answer = new int[cnt];
        cnt = 0;
        answer[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]!=arr[i]) answer[++cnt] = arr[i];
        }

        return answer;
    }
}