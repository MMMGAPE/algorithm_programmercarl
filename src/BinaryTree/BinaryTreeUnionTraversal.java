package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeUnionTraversal<T> {
    enum traversalType{
        priority,intermediate,rear
    }
    public List<T> preorderTraversal(TreeNode<T> rootNode,traversalType type){
        List<T> result = new ArrayList<>();
        Stack<TreeNode<T>> stack = new Stack<>();
        if (rootNode==null){
            return result;
        }else {
            stack.push(rootNode);
            while(!stack.isEmpty()){
                TreeNode<T> stackTopNode = stack.peek();
                if (stackTopNode!=null){
                    //前序遍历
                    if (type == traversalType.priority){
                        stack.pop();
                        if (stackTopNode.rightNode!=null){
                            stack.push(stackTopNode.rightNode);
                        }
                        if (stackTopNode.leftNode != null){
                            stack.push(stackTopNode.leftNode);
                        }
                        stack.push(stackTopNode);
                        stack.push(null);
                    }
                    //中序遍历
                    if (type == traversalType.priority){
                        stack.pop();
                        if (stackTopNode.rightNode!=null){
                            stack.push(stackTopNode.rightNode);
                        }
                        stack.push(stackTopNode);
                        stack.push(null);
                        if (stackTopNode.leftNode != null){
                            stack.push(stackTopNode.leftNode);
                        }
                    }
                    //后序遍历
                    if (type == traversalType.rear){
                        stack.pop();
                        stack.push(stackTopNode);
                        stack.push(null);
                        if (stackTopNode.rightNode!=null){
                            stack.push(stackTopNode.rightNode);
                        }
                        if (stackTopNode.leftNode != null){
                            stack.push(stackTopNode.leftNode);
                        }
                    }

                }else {
                    stack.pop();
                    result.add(stack.pop().value);
                }
            }
        }
        return result;
    }
}
