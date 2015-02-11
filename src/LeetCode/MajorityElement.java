package LeetCode;

import java.util.HashMap;

public class MajorityElement {
	public int majorityElement(int[] num) {
		HashMap<Integer, Integer> a = new HashMap<Integer, Integer>();
		int l = num.length;
		Integer value = null;
		int newValue = 0;
		int maxValue = 0;
		int target = 0;
		for (int i = 0; i < l; i++) {
			value = a.get(num[i]);
			if (value != null) {
				newValue = value + 1;
			}else{
				newValue = 1;
			}
			a.put(num[i], newValue);
			if(newValue > maxValue){
				maxValue = newValue;
				target = num[i];
			}
		}

		return target;
	}
}