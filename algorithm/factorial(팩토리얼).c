#include <stdio.h>

// ��ȯ ���丮��
int factorial_recursion(int n) {
	if (n <= 1) return 1;
	else return (n * factorial_recursion(n - 1));
}

// �ݺ� ���丮��
int factorial_loop(int n) {
	int result = 1;

	for (int i = n; i>0; i--)
		result *= i;
	return result;
}

int main() {
	int n = (������ ��);
	printf("��ȯ ���丮�� : %d\n", factorial_recursion(n));
	printf("�ݺ� ���丮�� : %d\n", factorial_loop(n));
	return 0;
}
// ��ó : C���� ���� Ǯ� �ڷᱸ��