import java.util.Scanner;

//3431. 준환이의 운동관리
/*
최근 경도비만 판정을 받은 준환이는 적절한 몸을 유지하기 위하여 1주일에 L분 이상 U분 이하의 운동을 하여야 한다.
준환이는 이번 주에 X분만큼 운동을 하였다.
당신은 준환이가 제한되어 있는 시간을 넘은 운동을 한 것인지, 그것이 아니라면 몇 분 더 운동을 해야 제한을 맞출 수 있는지 출력하는 프로그램을 작성해야 한다.

[입력]
첫 번째 줄에 테스트 케이스의 수 T가 주어진다.
각 테스트 케이스의 첫 번째 줄에는 세 정수 L, U, X(0≤ L ≤ U ≤ 107, 0 ≤ X ≤ 107)가 공백으로 구분되어 주어진다.

[출력]
각 테스트 케이스마다 I가 필요한 양보다 더 많은 운동을 하고 있다면 -1을 출력하고, 아니라면 추가로 몇 분을 더 운동해야 하는지 출력한다.
*/

class SWEA3431
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		int T;
		T=sc.nextInt();

		for(int test_case = 1; test_case <= T; test_case++)
		{
			int L = sc.nextInt();
			int U = sc.nextInt();
			int X = sc.nextInt();
			int result = 0;
         
		        if(X > U) {
		            result = -1;
		        } else if(X < L){
		          	result = L - X;
		        }
		        System.out.printf("#%d %d\n", test_case, result);
		}
     
		sc.close();
	}
}
