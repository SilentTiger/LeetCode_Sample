package LeetCode;

import java.util.Arrays;

public class RemoveElement {
	public int removeElement(int[] A, int elem) {
		int startIndex = 0, endIndex = A.length - 1, tmp = 0;
		while (startIndex <= endIndex) {
			if (A[startIndex] != elem) {
				startIndex++;
			} else {
				endIndex = getEndIndex(A, endIndex, elem);
				if (endIndex <= startIndex) {
					break;
				} else {
					tmp = A[startIndex];
					A[startIndex] = A[endIndex];
					A[endIndex] = tmp;
				}
			}
		}

		A = Arrays.copyOfRange(A, 0, startIndex);
		return startIndex;
	}

	public int getEndIndex(int[] A, int endIndex, int elem) {
		for (; endIndex >= 0; endIndex--) {
			if (A[endIndex] != elem) {
				return endIndex;
			}
		}
		return 0;
	}
}
