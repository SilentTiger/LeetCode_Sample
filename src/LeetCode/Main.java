package LeetCode;

import java.util.Hashtable;

public class Main {
	public static void main(String[] args) throws Exception {
		RemoveElement solution = new RemoveElement();
		// System.out.println(solution.log(0, 5));

		startTimer("1808548329");
		System.out.println(solution.removeElement(new int[] { 2 }, 3));
		System.out.println(endTimer("1808548329"));

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