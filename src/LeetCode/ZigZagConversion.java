package LeetCode;

import java.util.ArrayList;

public class ZigZagConversion {
	public String convert(String s, int nRows) {
		ArrayList<String[]> charContainer = new ArrayList<String[]>();

		String[] tempCharArray = new String[nRows];
		int tempCharIndex = 0;
		int constIndex = Math.max((int) (nRows / 2 - 1), 0);
		
		for (int i = 0; i < s.length(); i++) {
			if (tempCharIndex < nRows) {
				tempCharArray[tempCharIndex] = s.substring(i, i + 1);
				tempCharIndex++;
			} else {
				charContainer.add(tempCharArray);
				tempCharArray = new String[nRows];
				tempCharArray[constIndex] = s.substring(i, i + 1);
				charContainer.add(tempCharArray);
				tempCharArray = new String[nRows];
				tempCharIndex = 0;
			}
		}
		charContainer.add(tempCharArray);

		StringBuilder sb = new StringBuilder();
		int r = 0, c = 0;
		while (r < nRows) {
			while (c < charContainer.size()) {
				if(charContainer.get(c)[r] != null){
					sb.append(charContainer.get(c)[r]);
				}
				c++;
			}
			c = 0;
			r++;
		}
		
		return sb.toString();
	}
}
