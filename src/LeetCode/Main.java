package LeetCode;

import java.util.Hashtable;

public class Main {
	public static void main(String[] args) throws Exception {
		LRUCache l = new LRUCache(10);
		l.set(10, 10);
		l.set(9, 9);
		l.set(8, 8);
		l.set(7, 7);
		l.get(9);
		l.get(9);
		l.list();
	}
	
	private static Hashtable<String, Long> timerData = new Hashtable<String, Long>();
	
	static void startTimer(String key) throws Exception{
		if(timerData.containsKey(key)){
			throw new Exception("duplicate timer key:" + key);
		}
		timerData.put(key, System.nanoTime());
	}
	
	static long endTimer(String key) throws Exception{
		long now = System.nanoTime();
		if(!timerData.containsKey(key)){
			throw new Exception("timer key not exist:" + key);
		}
		long timeSpan = now - timerData.get(key);
		timerData.remove(key);
		return timeSpan;
	}
}