#include <stdio.h>

#define MAX_SIZE 8
int sorted[MAX_SIZE]; // �߰����� ���� �ʿ�

// i, j : ���ĵ� ����/������ ����Ʈ �ε���
// k : ���ĵ� ����Ʈ �ε���
/* 2���� ������ �迭 list[left...mid]�� list[mid+1...right]�� �պ� ���� */
/* (������ ���ڵ��� ���ĵǴ� ����) */
void merge(int list[], int left, int mid, int right)
{
	int i, j, k, l;
	i = left;
	j = mid + 1;
	k = left;

	/* ���� ���ĵ� list�� �պ� */
	while (i <= mid && j <= right) {
		if (list[i] <= list[j]) sorted[k++] = list[i++];
		else sorted[k++] = list[j++];
	}

	// ���� �ִ� ������ �ϰ� ����
	if (i > mid) {
		for (l = j; l <= right; l++)
			sorted[k++] = list[l];
	}
	else {
		for (l = i; l <= mid; l++) {
			sorted[k++] = list[l];
		}
	}

	// �迭 sorted[](�ӽ� �迭)�� ����Ʈ�� �迭 list[]�� �纹��
	for (l = left; l <= right; l++) {
		list[l] = sorted[l];
	}
}

// �պ� ����
void merge_sort(int list[], int left, int right) {
	int mid;

	if (left < right) {
		mid = (left + right) / 2;  //�߰� ��ġ�� ����Ͽ� ����Ʈ �յ� ����
		merge_sort(list, left, mid);  // ���� �κ� ����Ʈ ����
		merge_sort(list, mid + 1, right);  //���� �κ� ����Ʈ ����
		merge(list, left, mid, right);
	}
}

void main() {
	int i;
	int list[MAX_SIZE] = { 11, 6, 7, 1, 20, 3, 26, 0 };

	merge_sort(list, 0, MAX_SIZE-1);

	for (i = 0; i < MAX_SIZE; i++) {
		printf("%d\n", list[i]);
	}
}
// ��ó : https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html