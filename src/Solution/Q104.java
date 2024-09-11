package Solution;

public class Q104 {
    int maxDepth;
    public int maxDepth(TreeNode root) {
        maxDepthRec(root,0);
        return maxDepth;
    }

    public void maxDepthRec(TreeNode node,int depth){
        if(node == null){
            maxDepth = Math.max(maxDepth,depth);
            return;
        }
        maxDepthRec(node.left,depth+1);
        maxDepthRec(node.right,depth+1);
    }
}
