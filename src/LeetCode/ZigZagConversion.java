package LeetCode;

import java.util.ArrayList;

public class ZigZagConversion {
	public String convert(String s, int nRows) {
		ArrayList<String[]> charContainer = new ArrayList<String[]>();

		String[] tempCharArray = new String[nRows];
		boolean toDown = true;
		int currentPosition = 0;

		for (int i = 0; i < s.length(); i++) {
			if (toDown) {
				tempCharArray[currentPosition] = s.substring(i, i + 1);
				currentPosition++;
				if (currentPosition == nRows) {
					currentPosition = Math.max(0, currentPosition - 2);
					charContainer.add(tempCharArray);
					tempCharArray = new String[nRows];
					if (currentPosition != 0) {
						toDown = false;
					}

				}
			} else {
				tempCharArray[currentPosition] = s.substring(i, i + 1);
				currentPosition = Math.max(0, currentPosition - 1);
				charContainer.add(tempCharArray);
				tempCharArray = new String[nRows];
				if (currentPosition == 0) {
					toDown = true;
				}
			}
		}
		charContainer.add(tempCharArray);

		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < nRows; j++) {
			for (int i = 0; i < charContainer.size(); i++) {
				if (charContainer.get(i)[j] != null) {
					sb.append(charContainer.get(i)[j]);
				}
			}
		}
		return sb.toString().trim();
	}
}
