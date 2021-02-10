/*

A student is taking a cryptography class and has found anagrams to be very useful. 
Two strings are anagrams of each other if the first string's letters can be rearranged to form the second string. 
In other words, both strings must contain the same exact letters in the same exact frequency. 
For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.

The student decides on an encryption scheme that involves two large strings. 
The encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Determine this number.

Given two strings, a and b, that may or may not be of the same length, determine the minimum number of character deletions required to make a and b anagrams. 
Any characters can be deleted from either of the strings.

(https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings)

2021-02-10

*/




import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int result = 0;
        int cntSame = 0;
        
        char[] aryA = a.toCharArray();
        char[] aryB = b.toCharArray();
        Arrays.sort(aryA);
        Arrays.sort(aryB);
        a = new String(aryA);
        b = new String(aryB);
        
        if(a.length() < b.length()) {
            cntSame = cntAnagramChar(b, a);
        } else {
            cntSame = cntAnagramChar(a, b);
        }
        result = (a.length()-cntSame) + (b.length()-cntSame);
        
        return result;
    }
    
    static int cntAnagramChar(String trgStr, String srcStr) {
        int result = 0;
        int startIdx = 0;
        String target = trgStr;
        
        for(int i=1; i<=srcStr.length(); i++) {
            if(startIdx >= target.length()) {
                return result;
            }
            
            String srcChar = srcStr.substring(i-1,i);
            target = target.substring(startIdx, target.length());
            
            int targetIdx = target.indexOf(srcChar);
            if(targetIdx != -1) {
                startIdx = targetIdx + 1;
                result++;
            } 
            else {
                startIdx = 0;
            }
        }
        
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
