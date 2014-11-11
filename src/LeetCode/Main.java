package LeetCode;

import java.util.Hashtable;

public class Main {
	public static void main(String[] args) {
	}
	
	private static Hashtable<String, Long> timerData = new Hashtable<String, Long>();
	
	static void startTimer(String key) throws Exception{
		if(timerData.containsKey(key)){
			throw new Exception("duplicate timer key:" + key);
		}
		timerData.put(key, System.nanoTime());
	}
	
	static long endTimer(String key) throws Exception{
		if(!timerData.containsKey(key)){
			throw new Exception("timer key not exist:" + key);
		}
		long timeSpan = System.nanoTime() - timerData.get(key);
		timerData.remove(key);
		return timeSpan;
	}
}