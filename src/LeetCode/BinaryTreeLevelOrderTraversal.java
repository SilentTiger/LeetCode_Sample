package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		ArrayList<TreeNode> currentLevel = new ArrayList<TreeNode>();
		ArrayList<Integer> currentLevelValue = new ArrayList<Integer>();
		ArrayList<TreeNode> nextLevel = new ArrayList<TreeNode>();

		if (root != null) {
			currentLevel.add(root);
		}

		while (currentLevel.size() > 0) {
			TreeNode t = currentLevel.remove(0);
			currentLevelValue.add(t.val);
			if (t.left != null) {
				nextLevel.add(t.left);
			}
			if (t.right != null) {
				nextLevel.add(t.right);
			}
			if (currentLevel.size() == 0) {
				res.add(currentLevelValue);
				currentLevelValue = new ArrayList<Integer>();
				currentLevel = nextLevel;
				nextLevel = new ArrayList<TreeNode>();
			}
		}
		
		return res;
	}
}
