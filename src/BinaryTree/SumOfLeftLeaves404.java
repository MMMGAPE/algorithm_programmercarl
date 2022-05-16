package BinaryTree;

public class SumOfLeftLeaves404 {
    public int sumOfLeftLeaves(TreeNodeSample root) {
        return sumLeftLeaves(root,0,"root");
    }
    public int sumLeftLeaves(TreeNodeSample node,int sum,String type){
        if (node == null){
            return 0;
        }else {
            if (node.left!=null){
                sum = sumLeftLeaves(node.left,sum,"left");
            }
            if (node.right!=null){
                sum = sumLeftLeaves(node.right,sum,"right");
            }
            if (node.left==null && node.right == null && type.equals("left")){
                sum = sum+node.val;
            }
            return sum;
        }
    }
}
