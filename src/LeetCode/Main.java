package LeetCode;

import java.util.Hashtable;

public class Main {
	public static void main(String[] args) throws Exception {
		MergeSortedArray mSA = new MergeSortedArray();
		int[] A = new int[5];
		A[0] = 5;
		A[1] = 8;
		A[2] = 10;

		int[] B = new int[5];
		B[0] = 7;
		B[1] = 9;

		mSA.merge(A, 3, B, 2);

		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]);
			System.out.print(',');
		}
	}

	private static Hashtable<String, Long> timerData = new Hashtable<String, Long>();

	static void startTimer(String key) throws Exception {
		if (timerData.containsKey(key)) {
			throw new Exception("duplicate timer key:" + key);
		}
		timerData.put(key, System.nanoTime());
	}

	static long endTimer(String key) throws Exception {
		long now = System.nanoTime();
		if (!timerData.containsKey(key)) {
			throw new Exception("timer key not exist:" + key);
		}
		long timeSpan = now - timerData.get(key);
		timerData.remove(key);
		return timeSpan;
	}
}