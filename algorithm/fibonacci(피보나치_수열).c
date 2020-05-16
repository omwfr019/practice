#include <stdio.h>

// 순환 피보나치 수열
int fibonacci_rec(int n) {
	if (n == 0) return 0;
	if (n == 1) return 1;
	return (fibonacci_rec(n - 2) + fibonacci_rec(n - 1));
}

// 반복 피보나치 수열
int fibonacci_iter(int n) {
	if (n == 0) return 0;
	if (n == 1) return 1;

	int result = 0;
	int pp = 0, p = 1;

	for (int i = 2; i <= n; i++) {
		result = p + pp;
		pp = p;
		p = result;
	}
	return result;
}

int main() {
	int n = (임의의 수);
	printf("%d번째 수 : %d\n", n, fibonacci_rec(n));
	printf("%d번째 수 : %d\n", n, fibonacci_iter(n));
	return 0;
}
// 출처 : C언어로 쉽게 풀어쓴 자료구조