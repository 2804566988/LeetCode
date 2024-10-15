package Algorithm;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class Q101 {
    public boolean isSymmetric(TreeNode root) {
        return isSameTraverse(root.left,root.right);
    }

    public boolean isSameTraverse(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null){
            return true;
        }else if(node1 == null || node2 == null){
            return false;
        }else if(node1.val != node2.val){
            return false;
        }
        return isSameTraverse(node1.left,node2.right) &&
                isSameTraverse(node1.right,node2.left);
    }
}
