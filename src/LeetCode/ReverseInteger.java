package LeetCode;

//add @ 2011-12-25 Easy
public class ReverseInteger {
    public int reverse(int x) {
		int flag = x < 0 ? -1 : 1;
		x = x * flag;
		String xString = Integer.toString(x);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = xString.length() - 1; i >= 0; i--) {
			sb.append(xString.charAt(i));
		}
		
		return Integer.parseInt(sb.toString()) * flag;
    }
}