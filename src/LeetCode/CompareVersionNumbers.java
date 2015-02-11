package LeetCode;

public class CompareVersionNumbers {
	public int compareVersion(String version1, String version2) {
		String[] ver1 = version1.split("\\.");
		String[] ver2 = version2.split("\\.");

		int length = Math.max(ver1.length, ver2.length);

		int[] v1 = new int[length];
		int[] v2 = new int[length];

		for (int i = 0; i < ver1.length; i++) {
			v1[i] = Integer.parseInt(ver1[i]);
		}
		for (int i = 0; i < ver2.length; i++) {
			v2[i] = Integer.parseInt(ver2[i]);
		}

		int res = 0;
		for (int i = 0; i < length; i++) {
			if (v1[i] > v2[i]) {
				res = 1;
				break;
			} else if (v1[i] < v2[i]) {
				res = -1;
				break;
			}
		}

		return res;
	}
}
