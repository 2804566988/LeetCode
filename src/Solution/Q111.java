package Solution;

import com.sun.source.tree.Tree;
import junit.framework.TestResult;

public class Q111 {
    public int minDepth(TreeNode root) {
        return minDepthTraverse(root);
    }

    public int minDepthTraverse(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth1 = minDepthTraverse(root.left);
        int depth2 = minDepthTraverse(root.right);
        //如果左右孩子结点至少有一个为空，那么就返回depth1+depth2+1(为空的结点深度会直接返回0)
        //如果都不为空则返回两个结点深度的校址
        return root.left == null || root.right == null ?
                depth1 + depth2 + 1 : Math.min(depth1, depth2) + 1;
    }
}
