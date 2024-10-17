package Algorithm;

public class Q112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return pathSum(root,targetSum);
    }
    public boolean pathSum(TreeNode node,int targetSum){
        //排除空树的清空
        if(node == null){
            return false;
        }
        //目标值减去当前结点值，到叶子结点时如果目标值为0
        targetSum -= node.val;
        if(node.left == null && node.right == null && targetSum == 0){
                return true;
        }
        return pathSum(node.left,targetSum)
                || pathSum(node.right,targetSum);
    }
}
