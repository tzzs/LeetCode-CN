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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        return (deep(root)>=0) ? true : false;
    }
    public int deep(TreeNode root){
        if(root==null){
            return 0;
        }
        int l = deep(root.left);
        int r = deep(root.right);
        if(l==-1||r==-1) return -1;
        if(Math.abs(l-r)>1) return -1;
        return l>r ? l+1 : r+1;
    }
}