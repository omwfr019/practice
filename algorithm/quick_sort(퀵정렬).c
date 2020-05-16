#include <stdio.h>

#define MAX_SIZE 9
#define SWAP(x, y, temp) ( temp=x, x=y, y=temp )


// 1. 피벗을 기준으로 2개의 부분 리스트로 나눔.
// 2. 피벗보다 작은 값은 모두 왼쪽 부분 리스트로, 큰 값은 오른쪽 부분 리스트로 옮김.
/* 2개의 비균등 배열 list[left...pivot-1]와 list[pivot+1...right]의 합병 과정 */
/* (실제로 숫자들이 정렬되는 과정) */
int partition(int list[], int left, int right) {
	int pivot, temp;
	int low, high;

	low = left;
	high = right + 1;
	pivot = list[left];  // 정렬할 리스트의 가장 왼쪽 데이터를 피벗으로 선택 (임의의 값)

	/* low와 high가 교차할 때까지 반복(low<high) */
	do {
		/* list[low]가 피벗보다 작으면 계속 low를 증가 */
		do {
			low++;  // low는 left+1 에서 시작
		} while (low <= right && list[low] < pivot);

		/* list[high]가 피벗보다 크면 계속 high를 감소 */
		do {
			high--;
		} while (high >= left && list[high] > pivot);

		// 만약 low와 high가 교차하지 않았으면 list[low]를 list[high]와 교환
		if (low < high) {
			SWAP(list[low], list[high], temp);
		}
	} while (low < high);

	// low와 high가 교차했으면 반복문을 빠져나와 list[left]와 list[right]를 교환
	SWAP(list[left], list[high], temp);
	
	// 피벗의 위치인 high를 반환
	return high;
}

// 퀵 정렬
void quick_sort(int list[], int left, int right) {

	/* 정렬할 범위가 2개 이상의 데이터라면 (리스트의 크기가 0이나 1이 아니면) */
	if (left < right) {
		// partition 함수를 호출하여 피벗을 기준으로 리스트를 비균등 분할
		int q = partition(list, left, right);  // q : 피벗의 위치

		// 피벗을 제외한 2개의 부분 리스트를 대상으로 순환 호출
		quick_sort(list, left, q - 1);  // (left ~ 피벗-1 ) 앞쪽 부분 리스트 정렬
		quick_sort(list, q + 1, right);  // (피벗 바로 뒤 ~ right) 뒤쪽 부분 리스트 정렬
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
// 출처 : https://gmlwjd9405.github.io/2018/05/10/algorithm-quick-sort.html