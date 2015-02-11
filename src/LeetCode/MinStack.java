package LeetCode;

import java.util.LinkedList;

class MinStack {
	LinkedList<Integer> sortList = new LinkedList<Integer>();
	LinkedList<Integer> stackList = new LinkedList<Integer>();

	public void push(int x) {
		Integer v = x;
		stackList.addLast(v);
		
		if(sortList.size() == 0){
			sortList.addLast(v);
			return;
		}

		int length = sortList.size();
		for (int targetIndex = 0; targetIndex < length; targetIndex++) {
			if(sortList.get(targetIndex) > v){
				if(targetIndex > 0){
					sortList.add(targetIndex - 1, v);
				}else{
					sortList.addFirst(v);
				}
				return;
			}
		}
		sortList.addLast(v);
	}

	public void pop() {
		Integer target = stackList.removeLast();
		sortList.remove(target);
	}

	public int top() {
		return stackList.getLast();
	}

	public int getMin() {
		return sortList.getFirst();
	}
}
