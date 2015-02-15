package LeetCode;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		return isEqual(p, q);
	}

	public boolean isEqual(TreeNode p, TreeNode q) {
		if (p != null && q != null) {
			if (p.val != q.val) {
				return false;
			} else {
				return isEqual(p.left, q.left) && isEqual(p.right, q.right);
			}
		} else if (p == null && q == null) {
			return true;
		} else {
			return false;
		}
	}
}
