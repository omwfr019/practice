#include <stdio.h>

#define MAX_SIZE 8
int sorted[MAX_SIZE]; // 추가적인 공간 필요

// i, j : 정렬된 왼쪽/오른쪽 리스트 인덱스
// k : 정렬될 리스트 인덱스
/* 2개의 인접한 배열 list[left...mid]와 list[mid+1...right]의 합병 과정 */
/* (실제로 숫자들이 정렬되는 과정) */
void merge(int list[], int left, int mid, int right)
{
	int i, j, k, l;
	i = left;
	j = mid + 1;
	k = left;

	/* 분할 정렬된 list의 합병 */
	while (i <= mid && j <= right) {
		if (list[i] <= list[j]) sorted[k++] = list[i++];
		else sorted[k++] = list[j++];
	}

	// 남아 있는 값들을 일괄 복사
	if (i > mid) {
		for (l = j; l <= right; l++)
			sorted[k++] = list[l];
	}
	else {
		for (l = i; l <= mid; l++) {
			sorted[k++] = list[l];
		}
	}

	// 배열 sorted[](임시 배열)의 리스트를 배열 list[]로 재복사
	for (l = left; l <= right; l++) {
		list[l] = sorted[l];
	}
}

// 합병 정렬
void merge_sort(int list[], int left, int right) {
	int mid;

	if (left < right) {
		mid = (left + right) / 2;  //중간 위치를 계산하여 리스트 균등 분할
		merge_sort(list, left, mid);  // 앞쪽 부분 리스트 정렬
		merge_sort(list, mid + 1, right);  //뒤쪽 부분 리스트 정렬
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
// 출처 : https://gmlwjd9405.github.io/2018/05/08/algorithm-merge-sort.html