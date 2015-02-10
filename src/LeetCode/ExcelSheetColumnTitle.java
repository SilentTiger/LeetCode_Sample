package LeetCode;

public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		while (n / 27 != 0) {
			sb.append(Character.toChars((n % 27 == 0 ? 1 : n % 27) + '@')[0]);
			n = n / 27;
		}
		sb.append(Character.toChars((n % 27 == 0 ? 1 : n % 27) + '@')[0]);
		sb.reverse();
		return sb.toString();
	}
}
