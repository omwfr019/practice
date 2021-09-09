Mini-Max Sum
==============


### 문제

Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
Then print the respective minimum and maximum values as a single line of two space-separated long integers.

(https://www.hackerrank.com/challenges/mini-max-sum/problem)



<br/>

### 설계
1. for문을 돌며 모든 숫자의 합을 구한다.
2. 동시에 최솟값, 최댓값을 구한다. <br/>
   (단, 기준 숫자는 배열의 제일 처음 값으로 한다. 그러므로 반복문은 두 번째 숫자부터 시작해야 한다.)
3. 최대합은 가장 작은 숫자를 제외한 나머지를 더한 것이므로 전체합에서 최솟값을 빼주고, 최소합은 가장 큰 숫자를 제외한 나머지를 더한 것이므로 전체합에서 최댓값을 빼준다.

#### 구현

```java
  public static void miniMaxSum(List<Integer> arr) {
        long sum = arr.get(0);
        long max = arr.get(0), min = arr.get(0);
        long maxsum = 0, minsum = 0;
        
        for (int i=1; i<arr.size(); i++){
            sum += arr.get(i);
            if(max < arr.get(i)) max = arr.get(i);
            if(min > arr.get(i)) min = arr.get(i);
        }
        
        maxsum = sum - min;
        minsum = sum - max;
        
        System.out.printf("%d %d", minsum, maxsum);
    }
```

<br/>

### 전체 코드
```java
  import java.io.*;
  import java.math.*;
  import java.security.*;
  import java.text.*;
  import java.util.*;
  import java.util.concurrent.*;
  import java.util.function.*;
  import java.util.regex.*;
  import java.util.stream.*;
  import static java.util.stream.Collectors.joining;
  import static java.util.stream.Collectors.toList;

  class Result {

      /*
       * Complete the 'miniMaxSum' function below.
       *
       * The function accepts INTEGER_ARRAY arr as parameter.
       */

      public static void miniMaxSum(List<Integer> arr) {
          long sum = arr.get(0);
          long max = arr.get(0), min = arr.get(0);
          long maxsum = 0, minsum = 0;

          for (int i=1; i<arr.size(); i++){
              sum += arr.get(i);
              if(max < arr.get(i)) max = arr.get(i);
              if(min > arr.get(i)) min = arr.get(i);
          }

          maxsum = sum - min;
          minsum = sum - max;

          System.out.printf("%d %d", minsum, maxsum);
      }

  }

  public class Solution {
      public static void main(String[] args) throws IOException {
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

          List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
              .map(Integer::parseInt)
              .collect(toList());

          Result.miniMaxSum(arr);

          bufferedReader.close();
      }
  }

```
