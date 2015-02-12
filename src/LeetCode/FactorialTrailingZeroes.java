package LeetCode;

public class FactorialTrailingZeroes {
	public int trailingZeroes(int n) {
		if (n == 0) {
			return 1;
		}

		int res = 0;
		for (long i = 5; i <= n; i = i + 5) {
			res = count(i, res);
		}
		return res;
	}

	public int count(long i, int count) {
		if (i % 5 == 0) {
			count++;
			return count(i / 5, count);
		}
		return count;
	}

	public int count2(long i, int count) {
		int c = 0;
		if (i >= 1220703125) {
			c = 13;
		} else if (i >= 244140625) {
			c = 12;
		} else if (i >= 48828125) {
			c = 11;
		} else if (i >= 9765625) {
			c = 10;
		} else if (i >= 1953125) {
			c = 9;
		} else if (i >= 390625) {
			c = 8;
		} else if (i >= 78125) {
			c = 7;
		} else if (i >= 15625) {
			c = 6;
		} else if (i >= 3125) {
			c = 5;
		} else if (i >= 625) {
			c = 4;
		} else if (i >= 125) {
			c = 3;
		} else if (i >= 25) {
			c = 2;
		} else if (i >= 5) {
			c = 1;
		}
		return count + c;
	}
}
