#include <stdio.h>

#define MAX_SIZE 5


// 삽입 정렬
void insertion_sort(int list[], int n){
	int i, j, key;

	// 인덱스 0은 이미 정렬됨.
	for (i = 1; i < n; i++) {
		key = list[i]; // 현재 삽입될 숫자인 i번째 정수를 key 변수로 복사

		// 현재 정렬된 배열은 i-1까지이므로 i-1번째부터 역순으로 조사
		// key 값보다 정렬된 배열에 있는 값이 크면 j번째를 j+1번째로 이동
		for (j = i - 1; j >= 0 && list[j] > key; j--) {
			list[j + 1] = list[j]; // 레코드의 오른쪽으로 이동
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
// 출처 : https://gmlwjd9405.github.io/2018/05/06/algorithm-insertion-sort.html