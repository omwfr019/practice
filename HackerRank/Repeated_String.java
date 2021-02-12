/*

There is a string, s, of lowercase English letters that is repeated infinitely many times. 
Given an integer, n, find and print the number of letter a's in the first n letters of the infinite string.

(https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup)

2021-02-04

*/



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString_1(String s, long n) {    // Method 1 (v1)
        long result = 0;
        int cntAinS = 0;
        String remChar = s.substring(0, (int)(n%s.length()));
        
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'a') {
                cntAinS++;
            }
            if (i < remChar.length() && s.charAt(i) == 'a') {
                result++;
            }
        }
        result += cntAinS * (n/s.length());
        
        return result;
    }
    
    static long repeatedString(String s, long n) {  // Method 1 (v2) - v1의 가독성 개선
        long result = 0;
        int cntAInS = 0;
        long cntRepeatS = n / s.length();
        long remRepeatS = n % s.length();
        String remainderS = s.substring(0, (int)remRepeatS);

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                cntAInS++;
            }
        }
        result += cntAInS * cntRepeatS;
        
        for(int i=0; i<remainderS.length(); i++){
            if(remainderS.charAt(i) == 'a'){
                result++;
            }
        }
        
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
