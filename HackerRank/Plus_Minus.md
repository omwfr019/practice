Plus Minus
=============

<br/>

## 문제
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. <br/>
Print the decimal value of each fraction on a new line with 6 places after the decimal.

Input Format
> The first line contains an integer, n, the size of the array.
> The second line contains n space-separated integers that describe arr[n].

Out Format
> Print the following 3 lines, each to 6 decimals:
> 1. proportion of positive values
> 2. proportion of negative values
> 3. proportion of zeros

Link : https://www.hackerrank.com/challenges/plus-minus/problem

<br/><br/><br/>

## 설계
1. 양수, 0, 음수의 개수를 저장할 변수 선언(int) & 양수, 0, 음수의 비율을 저장할 변수 선언(double)
2. List에서 숫자(value)를 한개씩 get
   => foreach문 사용
3. 가져온 숫자가 양수, 0, 음수인지 판별하여 1번에서 선언한 개수 변수에 1씩 더함
4. 배열의 모든 숫자 판별이 끝나면 '각 개수 변수/배열사이즈'의 결과를 비율 변수에 저장
5. 비율 변수의 값들을 출력

```
  public static void plusMinus(List<Integer> arr) {
        int size = arr.size();
        int cntPos=0, cntNeg=0, cntZero=0;
        double ratioPos=0.0, ratioNeg=0.0, ratioZero=0.0;
        
        // 양수, 0, 음수의 개수 count
        for(Integer num : arr) {
            if(num > 0) { cntPos++; }
            else if(num < 0) { cntNeg++; } 
            else { cntZero++; }
        }
        
        // 양수, 0, 음수의 비율을 구함
        ratioPos = (double)cntPos / size;
        ratioNeg = (double)cntNeg / size;
        ratioZero = (double)cntZero / size;
        
        // 각 비율을 출력
        System.out.println(String.format("%.6f", ratioPos));
        System.out.println(String.format("%.6f", ratioNeg));
        System.out.println(String.format("%.6f", ratioZero));
    }
```

<br/><br/>

문제를 풀 때 주의하여 풀었던 점은 다음과 같다.
1. List에서 값을 가져오는 방법

3. 형변환
  
3. 소수점 아래 6자리 출력


<br/><br/>

형변환 부분을 생략하려면 int 대신 처음부터 double 변수를 사용하면 된다. <br/>
개수를 저장하는 변수(int)를 쓰지 않으려면, 비율을 저장하는 변수(double) 자체에 개수를 count 해줄 수 있다.

```
  public static void plusMinus(List<Integer> arr) {
        int size = arr.size();
        double ratioPos=0.0, ratioNeg=0.0, ratioZero=0.0;
        
        // 양수, 0, 음수의 개수 count
        for(Integer num : arr) {
            if(num > 0) { ratioPos++; }
            else if(num < 0) { ratioNeg++; } 
            else { ratioZero++; }
        }
        
        // 양수, 0, 음수의 비율을 구함
        ratioPos = ratioPos / size;
        ratioNeg = ratioNeg / size;
        ratioZero = ratioZero / size;
        
        // 각 비율을 출력
        System.out.println(String.format("%.6f", ratioPos));
        System.out.println(String.format("%.6f", ratioNeg));
        System.out.println(String.format("%.6f", ratioZero));
    }
```
