package LeetCode;

public class ExcelSheetColumnTitle {
	public String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();

		int m = 26;
		char t = 'A';
		n--;
		while (n / m != 0) {
			sb.append(Character.toChars((n % m) + t)[0]);
			n = n / m;
			n--;
		}
		sb.append(Character.toChars((n % m) + t)[0]);

		sb.reverse();
		return sb.toString();
	}
}