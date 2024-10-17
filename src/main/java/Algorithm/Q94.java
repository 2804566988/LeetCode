package Algorithm;

import java.util.ArrayList;
import java.util.List;

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
public class Q94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        midSeq(root,list);
        return list;
    }
    public void midSeq(TreeNode node, List<Integer> list){
        if(node == null){
            return;
        }
        midSeq(node.left,list);
        list.add(node.val);
        midSeq(node.right,list);
    }
}