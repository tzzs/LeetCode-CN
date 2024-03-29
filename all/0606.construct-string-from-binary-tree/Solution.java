/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public String tree2str(TreeNode root) {
        if (root == null)
            return "";

        if (root.right == null) {
            if (root.left == null) {
                return String.valueOf(root.val);
            } else {
                return String.valueOf(root.val) + "(" + tree2str(root.left) + ")";
            }
        }

        return String.valueOf(root.val) + "(" + tree2str(root.left) + ")(" + tree2str(root.right) + ")";
    }
}
