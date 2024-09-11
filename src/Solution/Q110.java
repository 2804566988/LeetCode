package Solution;

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
public class Q110 {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        isBBT(root);
        return flag;
    }
    public int isBBT(TreeNode node){
        if(node == null){
            return 0;
        }
        int depth1 = isBBT(node.left);
        int depth2 = isBBT(node.right);
        if(Math.abs(depth1 - depth2) > 1){
            flag = false;
        }
        return node.left == null || node.right == null ?
                depth1 + depth2 + 1 : Math.max(depth1,depth2)+1;
    }
}
