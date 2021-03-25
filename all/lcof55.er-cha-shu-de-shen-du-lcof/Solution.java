/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;

        int ldeep = maxDepth(root.left);
        int rdeep = maxDepth(root.right);

        return ldeep > rdeep ? ldeep + 1 : rdeep + 1;
    }
}
