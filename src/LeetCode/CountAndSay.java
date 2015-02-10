package LeetCode;

public class CountAndSay {
	public String countAndSay(int n) {
		StringBuilder sb = new StringBuilder();
		int numberCount = 0;
		Character tempNumber = ' ';
		String initor = "1";
		for (int c = 2; c <= n; c++) {
			sb.setLength(0);
			numberCount = 0;
			tempNumber = ' ';
			for (int i = 0; i < initor.length(); i++) {
				if (initor.charAt(i) != tempNumber) {
					if (numberCount != 0) {
						sb.append(numberCount).append(tempNumber);
					}
					tempNumber = initor.charAt(i);
					numberCount = 1;
				} else {
					numberCount++;
				}
			}
			sb.append(numberCount).append(tempNumber);

			initor = sb.toString();
		}
		return initor;
	}
}
