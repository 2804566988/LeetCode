package Algorithm;

public class Q104 {
    public int maxDepth(TreeNode root) {
        return maxDepthTraverse(root);
    }

    public int maxDepthTraverse(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int depth1 = maxDepthTraverse(node.left);
        int depth2 = maxDepthTraverse(node.right);
        return Math.max(depth1, depth2) + 1;
    }
}
