package java200;

public class JSort {
	
	/* 버블 정렬 */
	public static void BubbleSort(int[] n) {
		for(int i=0; i<n.length-1; i++) {
			for(int j=0; j<n.length-1-i; j++) {
				if(n[j]>n[j+1]) {
					int temp = n[j];
					n[j] = n[j+1];
					n[j+1] = temp;
				}
			}
		}
	}
	
	/* 퀵 정렬 */
	public static void QuickSort(int[] nn, int start, int end) {
		int left = start;
		int right = end;
		int mid = nn[(start+end)/2];
		do {
				// A1
			while((nn[left]<mid) && (left<end)) {
				left++;	// 왼쪽부터 오른쪽으로 배열[mid]값보다 크거나 같은 값을 찾을 때까지 left를 증가
				
			}	// A2
			while((mid<nn[right]) && (right>start)) {
				right--; // 오른쪽에서 왼쪽으로 배열[mid]값보다 작거나 같은 값을 찾을 때까지 right를 감소 
				
			}
				// B
			if(left<=right) {	// left<=right라면 서로의 값으로 변경(스왑)
				
				int temp = nn[left];
				nn[left] = nn[right];
				nn[right] = temp;
				left++;
				right--;
			}
		} while(left<right);	//ㅣleft>right가 되면 [0(start)~left-], [right+1~7(end)] 두 부분으로 배열을 나눔
		// C
		if(start<right) {
			QuickSort(nn, start, right);
		}
		// D
		if(left<end) {
			QuickSort(nn, left, end);
		}
	}
	public static void QuickSort(int[] n) {
		QuickSort(n, 0, n.length-1);
	}
	
	public static void print(int[] n) {
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		int[] m = {32, 2, 53, 5, 6, 19, 61, 0, 12, 44, 80, 77};
		int[] n = new int[m.length];
		System.arraycopy(m, 0, n, 0, m.length);
		JSort.print(n);
		long a = System.nanoTime();
		JSort.BubbleSort(n);
		// Sort.InserSort(n);
		long b = System.nanoTime();
		System.out.println((b-a) + " nano sec");
		JSort.print(n);
		
		System.out.println("---------------------");
		System.arraycopy(m, 0, n, 0, m.length);
		JSort.print(n);
		a = System.nanoTime();
		JSort.QuickSort(n);
		b = System.nanoTime();
		System.out.println((b-a)+" nano sec");
		JSort.print(n);
	}
	
}
