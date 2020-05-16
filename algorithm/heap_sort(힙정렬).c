#include <stdio.h>

#define MAX_ELEMENT 200  // �� �ȿ� ����� ����� ����

typedef struct {
	int key;
} element;

typedef struct {
	element heap[MAX_ELEMENT];
	int heap_size;
} HeapType;

void init (HeapType *h) {
	h->heap_size = 0;
}

/* ���� ����� ������ heap_size�� �� h�� item�� ���� */
void insert_max_heap(HeapType *h, element item) {
	int i;
	i = ++(h->heap_size);  // �� ũ�⸦ �ϳ� ����

	/* Ʈ���� �Ž��� �ö󰡸鼭 �θ� ���� ���ϴ� ���� */
	// i�� ��Ʈ ���(index: 1)�� �ƴϰ�, ������ item�� ���� i�� �θ� ���(index: i/2)���� ũ��
	while ((i != 1) && (item.key > h->heap[i/2].key)) {
		// i��° ���� �θ� ��带 ��ȯ.
		h->heap[i] = h->heap[i / 2];
		// �� �ܰ� ���� �ö�
		i /= 2;
	}
	h->heap[i] = item;  //���ο� ��带 ����
}

// �ִ� ��(max heap) ���� �Լ�
element delete_max_heap(HeapType *h) {
	int parent, child;
	element item, temp;

	item = h->heap[1];  // ��Ʈ ��� ���� ��ȯ�ϱ� ���� item�� �Ҵ�
	temp = h->heap[(h->heap_size)--];  // ������ ��带 temp�� �Ҵ��ϰ� �� ũ�⸦ �ϳ� ����.
	parent = 1;
	child = 2;

	while (child <= h->heap_size) {
		// ���� ����� �ڽ� ��� �� �� ū �ڽ� ��带 ã��. (��Ʈ ����� ���� �ڽ� ���(index: 2)���� �� ����)
		if ((child < h->heap_size) && ((h->heap[child].key) < h->heap[child + 1].key)) {
			child++;
		}
		// �� ū �ڽ� ��庸�� ������ ��尡 ũ��, while�� ����
		if (temp.key >= h->heap[child].key) {
			break;
		}

		// �� ū �ڽ� ��庸�� ������ ��尡 ������, �θ� ���� �� ū �ڽ� ��带 ��ȯ
		h->heap[parent] = h->heap[child];
		// �� �ܰ� �Ʒ��� �̵�
		parent = child;
		child *= 2;
	}

	// ������ ��带 �籸���� ��ġ�� ����
	h->heap[parent] = temp;
	// �ִ�(��Ʈ ��� ��)�� ��ȯ
	return item;
}

// �켱���� ť�� ���� �̿��� ����
void heap_sort(element a[], int n) {
	int i;
	HeapType h;

	init(&h);

	for (i = 0; i < n; i++) {
		insert_max_heap(&h, a[i]);
	}

	for (i = (n - 1); i >= 0; i--) {
		a[i] = delete_max_heap(&h);
	}
}
// ��ó : https://gmlwjd9405.github.io/2018/05/10/algorithm-heap-sort.html