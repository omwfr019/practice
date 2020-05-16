#include <stdio.h>

// ��ȯ �ŵ�����
double power_recursion(double x, int n) {
	if (n == 0) return 1.0;
	//else return ( x * power_recursion(x, n-1) );
	else if ((n % 2) == 0) return power_recursion(x*x, n / 2);
	else return x*power_recursion(x*x, (n - 1) / 2);
}

// �ݺ� �ŵ�����
double power_iteration(double x, int n) {
	double result = 1.0;

	for (int i = 0; i<n; i++)
		result *= x;
	return result;
}

int main() {
	double x = (��);
	int n = (����);
	printf("��ȯ �ŵ����� : %lf\n", power_recursion(x, n));
	printf("�ݺ� �ŵ����� : %lf\n", power_iteration(x, n));
	return 0;
}
// ��ó : C���� ���� Ǯ� �ڷᱸ��