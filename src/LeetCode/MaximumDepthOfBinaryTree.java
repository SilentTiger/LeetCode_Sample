package LeetCode;

import java.util.ArrayList;

public class MaximumDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		int levelIndex = 0;
		ArrayList<TreeNode> currentLevel = new ArrayList<TreeNode>();
		ArrayList<TreeNode> nextLevel = new ArrayList<TreeNode>();

		if (root != null) {
			currentLevel.add(root);
			levelIndex++;
		} else {
			return 0;
		}

		while (currentLevel.size() > 0) {
			TreeNode t = currentLevel.remove(0);
			if (t.left != null) {
				nextLevel.add(t.left);
			}
			if (t.right != null) {
				nextLevel.add(t.right);
			}
			if (currentLevel.size() == 0) {
				levelIndex++;
				currentLevel = nextLevel;
				nextLevel = new ArrayList<TreeNode>();
			}
		}

		return levelIndex - 1;
	}
}
