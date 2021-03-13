2D Array - DS
===============


### 문제
Given a 6X6 2D Array. An hourglass in A is a subset of values with indices falling in this pattern in arr's graphical representation: <br/>
> a &nbsp; b &nbsp; c <br/>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;d <br/>
> e &nbsp; f &nbsp; g <br/>

The are 16 hourglasses in arr. <br/>
An hourglass sum is the sum of an hourglass' values. <br/>
Calculate the hourglass sum for every hourglass in arr, then print the maximum hourglass sum. <br/>
The array will always be 6X6.

(https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays)

<br/>


### 설계
1. 각 모래시계의 합을 저장할 변수 sum, 가장 큰 합을 저장할 변수 max를 선언.
2. 모래시계 모양의 중심이 되는 (x, y)와 윗줄의 (x-1, y-1), (x-1, y), (x-1, y+1), 아랫줄의 (x+1, y-1), (x+1, y), (x+1, y+1)의 값을 더함. <br/>
   이 과정을 반복하며 각 모래시계 모양의 합계(sum)을 구함. sum이 max보다 크면 sum을 max에 할당. <br/>
  2.1. 기준점 (x, y)는 모래시계 모양에서 가로/세로 두번째 줄에 해당. 따라서 x, y는 첫번째 줄인 0이 아닌 1부터 시작. <br/>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;같은 맥락으로 모래시계의 가로/세로 세번째 줄이 되는 마지막 줄(5)을 제외하고 반복을 마침. <br/>
  2.2. 첫 번재 모래시계의 sum을 무조건 max에 할당. 0으로 초기화 하면 배열의 모든 값이 마이너스일 경우 처음 초기화 한 값이 max가 되기 때문. <br/>
  2.3. 각 모래시계의 sum을 구하기 전 이전 값이 더해지지 않도록 0으로 초기화.
3. 2번의 반복이 끝나면 max값을 반환.

<br/>

#### 구현
```java
static int hourglassSum(int[][] arr) {
  int max = 0;
  int sum = 0;

  for(int x=1; x<arr.length-1; x++) {
      for(int y=1; y<arr[x].length-1; y++) {
          sum += arr[x][y];
          for(int i=-1; i<=1; i++) {
              sum += arr[x-1][y+i];
              sum += arr[x+1][y+i];
          }

          if(x==1 && y==1) { max = sum; }

          if(sum > max) { max = sum; }

          sum = 0;
      }
  }
  return max;
}
```

<br/><br/>

### 전체 코드
```java
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int max = 0;
        int sum = 0;
        
        for(int x=1; x<arr.length-1; x++) {
            for(int y=1; y<arr[x].length-1; y++) {
                sum += arr[x][y];
                for(int i=-1; i<=1; i++) {
                    sum += arr[x-1][y+i];
                    sum += arr[x+1][y+i];
                }
                
                if(x==1 && y==1) { max = sum; }
                
                if(sum > max) { max = sum; }
                                
                sum = 0;
            }
        }
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

```
