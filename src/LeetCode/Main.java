package LeetCode;

import java.util.ArrayList;
import java.util.Hashtable;

public class Main {
	public static void main(String[] args) throws Exception {
		MinStack solution = new MinStack();
		solution.push(-10);
		solution.push(14);
		solution.getMin();
		solution.getMin();
		solution.push(-20);
		solution.getMin();
		solution.getMin();
		solution.top();
		solution.getMin();
		solution.pop();
		solution.push(10);
		solution.push(-7);
		solution.getMin();
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