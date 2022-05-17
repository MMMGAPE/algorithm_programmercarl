package BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        return preOrder(root,result,"");
    }
    public List<String> preOrder(TreeNode root, List<String> result, String subResult){
        if (root == null){
            return result;
        }else{
            if (root.left==null&&root.right==null){
                subResult = subResult.concat(Integer.toString(root.val));
                result.add(subResult);
            }else{
                subResult = subResult.concat(Integer.toString(root.val)+"->");
                preOrder(root.left,result,subResult);
                preOrder(root.right, result, subResult);
            }
        }
        return result;
    }
}
