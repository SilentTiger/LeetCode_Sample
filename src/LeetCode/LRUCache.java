package LeetCode;

//add @ 2013-11-09 Hard
public class LRUCache {
	int[][] cache;
	int index = -1;
	int[] swapTmp = new int[3];

	public LRUCache(int capacity) {
		cache = new int[capacity][3];
	}

	public int get(int key) {
		for (int i = 0; i < cache.length; i++) {
			if (cache[i][0] == key) {
				cache[i][2]++;
				if (i >= 1 && cache[i][2] > cache[i - 1][2]) {
					swapTmp = cache[i];
					cache[i] = cache[i - 1];
					cache[i - 1] = swapTmp;
				}
				return swapTmp[1];
			}
		}
		return -1;
	}

	public void set(int key, int value) {
		if (index < cache.length) {
			index++;
		}
		cache[index][0] = key;
		cache[index][1] = value;
		cache[index][2] = 1;
	}

	public void list(){
		for(int i = 0;i< cache.length;i++){
			System.out.print(cache[i][0]);
			System.out.print(",");
			System.out.print(cache[i][1]);
			System.out.print(",");
			System.out.print(cache[i][2]);
			System.out.print("\r\n");
		}
	}
}