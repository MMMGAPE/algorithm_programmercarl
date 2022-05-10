package BinaryTree;

public class TreeNode<T> {
    T value;
    TreeNode<T> leftNode;
    TreeNode<T> rightNode;
    public TreeNode(T value){
        this.value = value;
    }
    public TreeNode(T value, TreeNode<T> leftNode, TreeNode<T> rightNode){
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
    public T getValue(){
        return this.value;
    }
    public T getLeftValue(){
        return this.leftNode.getValue();
    }
    public T getRightValue(){
        return this.rightNode.getValue();
    }
    public TreeNode<T> getLeftNode(){
        return this.leftNode;
    }
    public TreeNode<T> getRightNode(){
        return this.rightNode;
    }
    public void setValue(T value){
        this.value=value;
    }
}
