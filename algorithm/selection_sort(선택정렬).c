#include <stdio.h>

#define SWAP(x, y, temp) ( temp = x, x = y, y = temp )
#define MAX_SIZE 5

// ���� ����
void selection_sort(int list[], int n){
	int i, j, least, temp;

	// ������ ���ڴ� �ڵ� ���� => (���� ���� - 1)
	for (i = 0; i < n - 1; i++){
		least = i;

		// �ּڰ� Ž��
		for(j = i+1; j < n; j++){
			if (list[j] < list[least]) least = j;
		}

		// �ּڰ��� �ڱ� �ڽ��̸� �ڷ� �̵��� ���� ����
		if (i != least){
			SWAP(list[i], list[least], temp);
		}
	}
}

void main()
{
	int i;
	int list[MAX_SIZE] = { 2, 13, 11, 6, 5 };

	selection_sort(list, MAX_SIZE);

	for (i = 0; i < MAX_SIZE; i++) {
		printf("%d\n", list[i]);
	}
}
// ��ó : https://gmlwjd9405.github.io/2018/05/06/algorithm-selection-sort.html