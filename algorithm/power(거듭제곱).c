#include <stdio.h>

// ¼øÈ¯ °ÅµìÁ¦°ö
double power_recursion(double x, int n) {
	if (n == 0) return 1.0;
	//else return ( x * power_recursion(x, n-1) );
	else if ((n % 2) == 0) return power_recursion(x*x, n / 2);
	else return x*power_recursion(x*x, (n - 1) / 2);
}

// ¹Ýº¹ °ÅµìÁ¦°ö
double power_iteration(double x, int n) {
	double result = 1.0;

	for (int i = 0; i<n; i++)
		result *= x;
	return result;
}

int main() {
	double x = (¹Ø);
	int n = (Áö¼ö);
	printf("¼øÈ¯ °ÅµìÁ¦°ö : %lf\n", power_recursion(x, n));
	printf("¹Ýº¹ °ÅµìÁ¦°ö : %lf\n", power_iteration(x, n));
	return 0;
}
// ÃâÃ³ : C¾ð¾î·Î ½±°Ô Ç®¾î¾´ ÀÚ·á±¸Á¶