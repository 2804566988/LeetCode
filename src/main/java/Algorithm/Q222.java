package Algorithm;

public class Q222 {
    public int countNodes(TreeNode root) {
        return count(root);
    }
    public int count(TreeNode node){
        if(node == null){
            return 0;
        }
        int cnt1 = count(node.left);
        int cnt2 = count(node.right);
        return cnt1 + cnt2 + 1;
    }
}
