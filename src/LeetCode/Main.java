package LeetCode;

import java.util.Hashtable;

public class Main {
	public static void main(String[] args) throws Exception {
		MajorityElement zzc = new MajorityElement();

		System.out.println(zzc.majorityElement(new int[] { 1, 2, 3 }));
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