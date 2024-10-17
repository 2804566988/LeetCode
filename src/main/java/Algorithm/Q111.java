package Algorithm;

public class Q111 {
    public int minDepth(TreeNode root) {
        return minDepthTraverse(root);
    }

    public int minDepthTraverse(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int depth1 = minDepthTraverse(node.left);
        int depth2 = minDepthTraverse(node.right);
        //如果左右孩子结点至少有一个为空，那么就返回depth1+depth2+1(为空的结点深度会直接返回0)
        //如果都不为空则返回两个结点深度的校址
        return node.left == null || node.right == null ?
                depth1 + depth2 + 1 : Math.min(depth1, depth2) + 1;
    }
}
