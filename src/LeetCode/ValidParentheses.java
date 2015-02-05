package LeetCode;

import java.util.Stack;

public class ValidParentheses {
	private static String startTag = "([{"; 
	private static String closeTag = ")]}";
	public boolean isValid(String s) {
		Stack<String> stack = new Stack<String>();
		for (int i = 0; i < s.length(); i++) {
			String currentLetter = s.substring(i, i + 1);
			if (startTag.indexOf(currentLetter) > -1) {
				stack.push(currentLetter);
			} else if (closeTag.indexOf(currentLetter) > -1) {
				if(stack.size() == 0){
					return false;
				}else{
					String p = stack.pop();
					if ((currentLetter.equals(")") && !p.equals("("))
							|| (currentLetter.equals("]") && !p.equals("["))
							|| (currentLetter.equals("}") && !p.equals("{"))) {
						return false;
					}
				}
			}
		}
		return stack.size() == 0;
	}
}
