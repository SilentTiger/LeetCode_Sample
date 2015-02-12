package LeetCode;

import java.util.ArrayList;

class MinStack {
	int currentMinValue = Integer.MAX_VALUE;
	ArrayList<Integer> minValueList = new ArrayList<Integer>();
	ArrayList<Integer> stackList = new ArrayList<Integer>();

	public void push(int x) {
		stackList.add(x);
		currentMinValue = Math.min(x, currentMinValue);
		minValueList.add(currentMinValue);
	}

	public void pop() {
		int lastIndex = stackList.size() - 1;
		stackList.remove(lastIndex);
		minValueList.remove(lastIndex);
		if(lastIndex == 0){
			currentMinValue = Integer.MAX_VALUE;
		}else{
			currentMinValue = minValueList.get(lastIndex - 1);
		}
	}

	public int top() {
		return stackList.get(stackList.size() - 1);
	}

	public int getMin() {
		return minValueList.get(minValueList.size() - 1);
	}
}
