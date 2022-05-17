package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeIterateTraversal {

    public List<Integer> preorderTraversal(TreeNode rootNode){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (rootNode==null){
            return result;
        }else {
            stack.push(rootNode);
            while(!stack.isEmpty()){
                TreeNode node = stack.pop();
                result.add(node.val);
                if (node.right!=null){
                    stack.push(node.right);
                }
                if (node.left!=null){
                    stack.push(node.left);
                }
            }
        }
        return result;
    }

    public List<Integer> midOrderTraversal(TreeNode rootNode){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (rootNode==null){
            return result;
        }else {
            stack.push(rootNode);
            while (!stack.isEmpty()){
                TreeNode stackTopNode = stack.peek();
                if (stackTopNode.right!=null){
                    stack.push(stackTopNode.right);
                }else {
                    TreeNode popNode = stack.pop();
                    result.add(popNode.val);
                    if (popNode.left != null){
                        stack.push(popNode.left);
                    }
                }
            }
        }
        return result;
    }

    public List<Integer> rearOrderTraversal(TreeNode rootNode){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (rootNode==null){
            return result;
        }else{
            stack.push(rootNode);
            while (!stack.isEmpty()){
                TreeNode stackTopNode = stack.peek();
                if (stackTopNode.right!=null){
                    stack.push(stackTopNode.right);
                }else {
                    if (stackTopNode.left != null){
                        stack.push(stackTopNode.left);
                    }else {
                        result.add(stack.pop().val);
                    }
                }
            }
        }
        return result;
    }
}
