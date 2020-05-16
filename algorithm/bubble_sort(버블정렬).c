#include <stdio.h>

#define MAX_SIZE 5


// ���� ����
void bubble_sort(int list[], int n){
	int i, j, temp;

	for (i = n - 1; i > 0; i--) {
		// 0 ~ (i-1)���� �ݺ�
		for (j = 0; j < i; j++) {
			// j��°�� j+1��°�� ��Ұ� ũ�� ���� �ƴϸ� ��ȯ
			if (list[j] > list[j + 1]) {
				temp = list[j];
				list[j] = list[j + 1];
				list[j + 1] = temp;
			}
		}
	}
}

void main()
{
	int i;
	int list[MAX_SIZE] = { 11, 6, 7, 1, 3 };

	bubble_sort(list, MAX_SIZE);

	for (i = 0; i < MAX_SIZE; i++) {
		printf("%d\n", list[i]);
	}
}
// ��ó : https://gmlwjd9405.github.io/2018/05/06/algorithm-bubble-sort.html