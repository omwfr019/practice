#include <stdio.h>

#define SWAP(x, y, temp) ( temp = x, x = y, y = temp )
#define MAX_SIZE 5

// 선택 정렬
void selection_sort(int list[], int n){
	int i, j, least, temp;

	// 마지막 숫자는 자동 정렬 => (숫자 개수 - 1)
	for (i = 0; i < n - 1; i++){
		least = i;

		// 최솟값 탐색
		for(j = i+1; j < n; j++){
			if (list[j] < list[least]) least = j;
		}

		// 최솟값이 자기 자신이면 자료 이동을 하지 않음
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
// 출처 : https://gmlwjd9405.github.io/2018/05/06/algorithm-selection-sort.html