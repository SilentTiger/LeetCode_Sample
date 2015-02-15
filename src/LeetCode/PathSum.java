package LeetCode;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		return checkSum(root, 0, sum);
	}

	public boolean checkSum(TreeNode node, int currentSum, int sum) {
		if (node == null) {
			return false;
		}
		if (node.left == null && node.right == null) {
			if (currentSum + node.val == sum) {
				return true;
			}
		}

		if (node.left != null) {
			if (checkSum(node.left, currentSum + node.val, sum)) {
				return true;
			}
		}
		if (node.right != null) {
			if (checkSum(node.right, currentSum + node.val, sum)) {
				return true;
			}
		}

		return false;
	}
}
