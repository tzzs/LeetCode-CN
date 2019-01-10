/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int findTilt(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.abs(sum(root.left) - sum(root.right)) + findTilt(root.left) + findTilt(root.right);
        }
    }

    public int sum(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return root.val + sum(root.left) + sum(root.right);
        }
    }

}

    