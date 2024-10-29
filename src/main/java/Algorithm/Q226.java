package Algorithm;

public class Q226 {
    public TreeNode invertTree(TreeNode root) {
        midTraverse(root);
        return root;
    }
    public void midTraverse(TreeNode node){
        TreeNode temp = new TreeNode();
        if(node == null){
            return;
        }
        temp = node.left;
        node.left = node.right;
        node.right = temp;
        midTraverse(node.left);
        midTraverse(node.right);
    }
}
