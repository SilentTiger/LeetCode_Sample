package LeetCode;

public class MergeSortedArray {
	public void merge(int A[], int m, int B[], int n) {
		int start = 0;
		for (int j = 0; j < n; j++) {
			for (int i = start; i < m; i++) {
				if (A[i] >= B[j]) {
					for (int k = A.length - 1; k > i; k--) {
						A[k] = A[k - 1];
					}
					A[i] = B[j];
					m++;
					break;
				}
				start++;
			}
			A[start] = B[j];
			start++;
		}
	}
}