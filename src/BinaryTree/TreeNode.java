package BinaryTree;

public class TreeNode<V> {
    V value;
    TreeNode<V> leftNode;
    TreeNode<V> rightNode;
    public TreeNode(V value){
        this.value = value;
    }
    public TreeNode(V value, TreeNode<V> leftNode, TreeNode<V> rightNode){
        this.value = value;
        this.leftNode = leftNode;
        this.rightNode = rightNode;
    }
    public V getValue(){
        return this.value;
    }
    public V getLeftValue(){
        return this.leftNode.getValue();
    }
    public V getRightValue(){
        return this.rightNode.getValue();
    }
    public TreeNode<V> getLeftNode(){
        return this.leftNode;
    }
    public TreeNode<V> getRightNode(){
        return this.rightNode;
    }
    public void setValue(V value){
        this.value=value;
    }
}
