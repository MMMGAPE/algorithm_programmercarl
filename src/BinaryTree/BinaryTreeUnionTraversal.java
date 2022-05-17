package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeUnionTraversal {
    enum traversalType{
        priority,intermediate,rear
    }
    public List<Integer> preorderTraversal(TreeNode rootNode, traversalType type){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (rootNode==null){
            return result;
        }else {
            stack.push(rootNode);
            while(!stack.isEmpty()){
                TreeNode stackTopNode = stack.peek();
                if (stackTopNode!=null){
                    //前序遍历
                    if (type == traversalType.priority){
                        stack.pop();
                        if (stackTopNode.right!=null){
                            stack.push(stackTopNode.right);
                        }
                        if (stackTopNode.left != null){
                            stack.push(stackTopNode.left);
                        }
                        stack.push(stackTopNode);
                        stack.push(null);
                    }
                    //中序遍历
                    if (type == traversalType.priority){
                        stack.pop();
                        if (stackTopNode.right!=null){
                            stack.push(stackTopNode.right);
                        }
                        stack.push(stackTopNode);
                        stack.push(null);
                        if (stackTopNode.left != null){
                            stack.push(stackTopNode.left);
                        }
                    }
                    //后序遍历
                    if (type == traversalType.rear){
                        stack.pop();
                        stack.push(stackTopNode);
                        stack.push(null);
                        if (stackTopNode.right!=null){
                            stack.push(stackTopNode.right);
                        }
                        if (stackTopNode.left != null){
                            stack.push(stackTopNode.left);
                        }
                    }

                }else {
                    stack.pop();
                    result.add(stack.pop().val);
                }
            }
        }
        return result;
    }
}
