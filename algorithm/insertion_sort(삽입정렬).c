#include <stdio.h>

#define MAX_SIZE 5


// ���� ����
void insertion_sort(int list[], int n){
	int i, j, key;

	// �ε��� 0�� �̹� ���ĵ�.
	for (i = 1; i < n; i++) {
		key = list[i]; // ���� ���Ե� ������ i��° ������ key ������ ����

		// ���� ���ĵ� �迭�� i-1�����̹Ƿ� i-1��°���� �������� ����
		// key ������ ���ĵ� �迭�� �ִ� ���� ũ�� j��°�� j+1��°�� �̵�
		for (j = i - 1; j >= 0 && list[j] > key; j--) {
			list[j + 1] = list[j]; // ���ڵ��� ���������� �̵�
		}
		list[j + 1] = key;
	}
}

void main()
{
	int i;
	int list[MAX_SIZE] = { 13, 6, 8, 1, 4 };

	insertion_sort(list, MAX_SIZE);

	for (i = 0; i < MAX_SIZE; i++) {
		printf("%d\n", list[i]);
	}
}
// ��ó : https://gmlwjd9405.github.io/2018/05/06/algorithm-insertion-sort.html