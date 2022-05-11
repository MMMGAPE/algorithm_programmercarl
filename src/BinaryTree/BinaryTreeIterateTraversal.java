package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeIterateTraversal<T> {

    public List<T> preorderTraversal(TreeNode<T> rootNode){
        List<T> result = new ArrayList<>();
        Stack<TreeNode<T>> stack = new Stack<>();
        if (rootNode==null){
            return result;
        }else {
            stack.push(rootNode);
            while(!stack.isEmpty()){
                TreeNode<T> node = stack.pop();
                result.add(node.getValue());
                if (node.rightNode!=null){
                    stack.push(node.getRightNode());
                }
                if (node.leftNode!=null){
                    stack.push(node.getLeftNode());
                }
            }
        }
        return result;
    }

    public List<T> midOrderTraversal(TreeNode<T> rootNode){
        List<T> result = new ArrayList<>();
        Stack<TreeNode<T>> stack = new Stack<>();
        if (rootNode==null){
            return result;
        }else {
            stack.push(rootNode);
            while (!stack.isEmpty()){
                TreeNode<T> stackTopNode = stack.peek();
                if (stackTopNode.rightNode!=null){
                    stack.push(stackTopNode.rightNode);
                }else {
                    TreeNode<T> popNode = stack.pop();
                    result.add(popNode.value);
                    if (popNode.leftNode != null){
                        stack.push(popNode.leftNode);
                    }
                }
            }
        }
        return result;
    }

    public List<T> rearOrderTraversal(TreeNode<T> rootNode){
        List<T> result = new ArrayList<>();
        Stack<TreeNode<T>> stack = new Stack<>();
        if (rootNode==null){
            return result;
        }else{
            stack.push(rootNode);
            while (!stack.isEmpty()){
                TreeNode<T> stackTopNode = stack.peek();
                if (stackTopNode.rightNode!=null){
                    stack.push(stackTopNode.rightNode);
                }else {
                    if (stackTopNode.leftNode != null){
                        stack.push(stackTopNode.leftNode);
                    }else {
                        result.add(stack.pop().value);
                    }
                }
            }
        }
        return result;
    }
}
