#include <stdio.h>

// 순환 팩토리얼
int factorial_recursion(int n) {
	if (n <= 1) return 1;
	else return (n * factorial_recursion(n - 1));
}

// 반복 팩토리얼
int factorial_loop(int n) {
	int result = 1;

	for (int i = n; i>0; i--)
		result *= i;
	return result;
}

int main() {
	int n = (임의의 수);
	printf("순환 팩토리얼 : %d\n", factorial_recursion(n));
	printf("반복 팩토리얼 : %d\n", factorial_loop(n));
	return 0;
}
// 출처 : C언어로 쉽게 풀어쓴 자료구조