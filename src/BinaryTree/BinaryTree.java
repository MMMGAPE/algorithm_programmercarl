package BinaryTree;

import java.util.TreeMap;

public class BinaryTree<V> {
    V value;
    BinaryTree<V> leftNode;
    BinaryTree<V> rightNode;
    public BinaryTree(V value){
        this.value = value;
    }
    public BinaryTree(V value, BinaryTree<V> leftNode,BinaryTree<V> rightNode){
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
    public BinaryTree<V> getLeftNode(){
        return this.leftNode;
    }
    public BinaryTree<V> getRightNode(){
        return this.rightNode;
    }
    public void setValue(V value){
        this.value=value;
    }
}
