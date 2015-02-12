package LeetCode;

import java.util.Hashtable;

public class Main {
	public static void main(String[] args) throws Exception {
		FactorialTrailingZeroes solution = new FactorialTrailingZeroes();
		//System.out.println(solution.log(0, 5));
		
		startTimer("1808548329");
		System.out.println(solution.trailingZeroes(1808548329));
		System.out.println(endTimer("1808548329"));

		startTimer("2147483644");
		System.out.println(solution.trailingZeroes(2147483644));
		System.out.println(endTimer("2147483644"));
		
		startTimer("2147483645");
		System.out.println(solution.trailingZeroes(2147483645));
		System.out.println(endTimer("2147483645"));
		
		startTimer("2147483646");
		System.out.println(solution.trailingZeroes(2147483646));
		System.out.println(endTimer("2147483646"));

		startTimer("2147483647");
	    System.out.println(solution.trailingZeroes(2147483647));
		System.out.println(endTimer("2147483647"));
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