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

<br/><br/>

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

문제를 풀 때 주의한 점은 다음과 같다.

#### List에서 값을 가져오는 방법
List를 인자로 받았으므로 ArrayList, LinkedList가 특정되지 않음 ~> LinkedList에서 get()의 시간복잡도는 O(n). <br/>
이때 <b>for문</b>을 사용하면 for가 중첩되어 시간복잡도가 O(n^2)이 됨. <br/>

<b>forEach()</b>는 성능과 가독성에서 굳이 사용하지 않아도 된다고 판단.

<br/>

#### 형변환
비율을 구하기 위해 '개수/배열크기' 연산 시 'int/int' 타입으로 계산되므로 double로 형변환 필요

<br/>
  
#### 소수점 아래 6자리 출력
<b>Math.round()</b> => 소수점 아래 0을 출력하지 않아 자리수가 정해진 본 문제에선 적합하지 않다고 판단. <br/>
ex) System.out.println((double)Math.round(ratioPos*1000000)/1000000); => 0.5 출력 <br/>

<b>NumberFormat</b> : 다른 두 방법보다 번거로움. 장기적으로 유지보수 필요한 코드가 아니기 때문에 본 문제에선 사용하지 않음. <br/>

<b>개선점)</b> 문제를 풀 때 6자리를 "%.6f"로 표현했는데, 자리수를 변경해야 하는 경우가 나타난다면? 포멧을 일일이 변경해야 함.


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
