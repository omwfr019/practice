#include <stdio.h>

// ��ȯ �Ǻ���ġ ����
int fibonacci_rec(int n) {
	if (n == 0) return 0;
	if (n == 1) return 1;
	return (fibonacci_rec(n - 2) + fibonacci_rec(n - 1));
}

// �ݺ� �Ǻ���ġ ����
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
	int n = (������ ��);
	printf("%d��° �� : %d\n", n, fibonacci_rec(n));
	printf("%d��° �� : %d\n", n, fibonacci_iter(n));
	return 0;
}
// ��ó : C���� ���� Ǯ� �ڷᱸ��