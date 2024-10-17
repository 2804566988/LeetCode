package Algorithm;

import java.util.ArrayList;
import java.util.List;

public class Q144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Traversal(root,list);
        return list;
    }
    public void Traversal(TreeNode node,List<Integer> list){
        if(node == null){
            return ;
        }
        list.add(node.val);
        Traversal(node.left,list);
        Traversal(node.right,list);
    }
}
