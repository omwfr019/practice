#include <stdio.h>

#define MAX_SIZE 10

// gap��ŭ ������ ��ҵ��� ���� ����
// ������ ������ first���� last����
void inc_insertion_sort(int list[], int first, int last, int gap) {
	int i, j, key;

	for (i = first + gap; i <= last; i = i + gap) {
		key = list[i]; // ���� ���Ե� ������ i��° ������ key ������ ����

		// ���� ���ĵ� �迭�� i-gap�����̹Ƿ� i-gap��°���� �������� ����
		// j ���� first �̻��̾�� ��
		// key ������ ���ĵ� �迭�� �ִ� ���� ũ�� j��°�� j+gap��°�� �̵�
		for (j = i - gap; j >= first && list[j] > key; j = j - gap) {
			list[j + gap] = list[j]; // ���ڵ带 gap��ŭ ���������� �̵�
		}

		list[j + gap] = key;
	}
}

// �� ����
void shell_sort(int list[], int n) {
	int i, gap;

	for (gap = n / 2; gap > 0; gap = gap / 2) {
		if ((gap % 2) == 0) {
			gap++; // gap�� Ȧ���� ����
		}

		// �κ� ����Ʈ�� ������ gap�� ����
		for (i = 0; i < gap; i++) {
			// �κ� ����Ʈ�� ���� ���� ���� ����
			inc_insertion_sort(list, i, n - 1, gap);
		}
	}
}

void main()
{
	int i;
	int list[MAX_SIZE] = { 11, 6, 7, 1, 20, 3, 26, 0, 5, 15 };

	shell_sort(list, MAX_SIZE);

	for (i = 0; i < MAX_SIZE; i++) {
		printf("%d\n", list[i]);
	}
}
// ��ó : https://gmlwjd9405.github.io/2018/05/08/algorithm-shell-sort.html