#include <stdio.h>

#define MAX_SIZE 9
#define SWAP(x, y, temp) ( temp=x, x=y, y=temp )


// 1. �ǹ��� �������� 2���� �κ� ����Ʈ�� ����.
// 2. �ǹ����� ���� ���� ��� ���� �κ� ����Ʈ��, ū ���� ������ �κ� ����Ʈ�� �ű�.
/* 2���� ��յ� �迭 list[left...pivot-1]�� list[pivot+1...right]�� �պ� ���� */
/* (������ ���ڵ��� ���ĵǴ� ����) */
int partition(int list[], int left, int right) {
	int pivot, temp;
	int low, high;

	low = left;
	high = right + 1;
	pivot = list[left];  // ������ ����Ʈ�� ���� ���� �����͸� �ǹ����� ���� (������ ��)

	/* low�� high�� ������ ������ �ݺ�(low<high) */
	do {
		/* list[low]�� �ǹ����� ������ ��� low�� ���� */
		do {
			low++;  // low�� left+1 ���� ����
		} while (low <= right && list[low] < pivot);

		/* list[high]�� �ǹ����� ũ�� ��� high�� ���� */
		do {
			high--;
		} while (high >= left && list[high] > pivot);

		// ���� low�� high�� �������� �ʾ����� list[low]�� list[high]�� ��ȯ
		if (low < high) {
			SWAP(list[low], list[high], temp);
		}
	} while (low < high);

	// low�� high�� ���������� �ݺ����� �������� list[left]�� list[right]�� ��ȯ
	SWAP(list[left], list[high], temp);
	
	// �ǹ��� ��ġ�� high�� ��ȯ
	return high;
}

// �� ����
void quick_sort(int list[], int left, int right) {

	/* ������ ������ 2�� �̻��� �����Ͷ�� (����Ʈ�� ũ�Ⱑ 0�̳� 1�� �ƴϸ�) */
	if (left < right) {
		// partition �Լ��� ȣ���Ͽ� �ǹ��� �������� ����Ʈ�� ��յ� ����
		int q = partition(list, left, right);  // q : �ǹ��� ��ġ

		// �ǹ��� ������ 2���� �κ� ����Ʈ�� ������� ��ȯ ȣ��
		quick_sort(list, left, q - 1);  // (left ~ �ǹ�-1 ) ���� �κ� ����Ʈ ����
		quick_sort(list, q + 1, right);  // (�ǹ� �ٷ� �� ~ right) ���� �κ� ����Ʈ ����
	}
}

void main() {
	int i;
	int list[MAX_SIZE] = { 10, 3, 5, 16, 8, 1, 0, 9, 13 };

	quick_sort(list, 0, MAX_SIZE - 1);

	for (i = 0; i < MAX_SIZE; i++) {
		printf("%d\n", list[i]);
	}
}
// ��ó : https://gmlwjd9405.github.io/2018/05/10/algorithm-quick-sort.html