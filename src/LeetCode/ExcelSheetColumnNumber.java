package LeetCode;

public class ExcelSheetColumnNumber {
	public int titleToNumber(String s) {
		int res = 0;
		int stringLength = s.length();
		for (int i = stringLength - 1; i >= 0; i--) {
			res += ((s.charAt(i) - '@') * Math.pow(26, (stringLength - i - 1)));
		}
		return res;
	}
}
