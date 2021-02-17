/*

Lena is preparing for an important coding competition that is preceded by a number of sequential preliminary contests. 
Initially, her luck balance is 0. 
She believes in "saving luck", and wants to check her theory. 
Each contest is described by two integers, L[i] and T[i]:

- L[i] is the amount of luck associated with a contest. 
  If Lena wins the contest, her luck balance will decrease by L[i]; 
  if she loses it, her luck balance will increase by L[i].
- T[i] denotes the contest's importance rating. 
  It's equal to 1 if the contest is important, and it's equal to 0 if it's unimportant.
  
If Lena loses no more than k important contests, what is the maximum amount of luck she can have after competing in all the preliminary contests? 
This value may be negative.

(https://www.hackerrank.com/challenges/luck-balance/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms)

*/



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        int result = 0;
        ArrayList<Integer> important = new ArrayList<>();
        
        for(int i=0; i<contests.length; i++){
            if(contests[i][1] == 0){
                result += contests[i][0];
            } else {
                important.add(contests[i][0]);
            }
        }
        
        Collections.sort(important, Collections.reverseOrder());
        
        for(int i=0; i<important.size(); i++){
            if(i < k) {
                result += (int)important.get(i);
            } else {
                result -= (int)important.get(i);
            }
        }

        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[][] contests = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] contestsRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 2; j++) {
                int contestsItem = Integer.parseInt(contestsRowItems[j]);
                contests[i][j] = contestsItem;
            }
        }

        int result = luckBalance(k, contests);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
