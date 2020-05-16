#include <stdio.h>

#define MAX_SIZE 10

// gap만큼 떨어진 요소들을 삽입 정렬
// 정렬의 범위는 first에서 last까지
void inc_insertion_sort(int list[], int first, int last, int gap) {
	int i, j, key;

	for (i = first + gap; i <= last; i = i + gap) {
		key = list[i]; // 현재 삽입될 숫자인 i번째 정수를 key 변수로 복사

		// 현재 정렬된 배열은 i-gap까지이므로 i-gap번째부터 역순으로 조사
		// j 값은 first 이상이어야 함
		// key 값보다 정렬된 배열에 있는 값이 크면 j번째를 j+gap번째로 이동
		for (j = i - gap; j >= first && list[j] > key; j = j - gap) {
			list[j + gap] = list[j]; // 레코드를 gap만큼 오른쪽으로 이동
		}

		list[j + gap] = key;
	}
}

// 셸 정렬
void shell_sort(int list[], int n) {
	int i, gap;

	for (gap = n / 2; gap > 0; gap = gap / 2) {
		if ((gap % 2) == 0) {
			gap++; // gap을 홀수로 만듦
		}

		// 부분 리스트의 개수는 gap과 같음
		for (i = 0; i < gap; i++) {
			// 부분 리스트에 대한 삽입 정렬 수행
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
// 출처 : https://gmlwjd9405.github.io/2018/05/08/algorithm-shell-sort.html