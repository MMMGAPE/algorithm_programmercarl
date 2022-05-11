package BinaryTree;

public class TreeNodeSample { 
    int val;
    TreeNodeSample left;
    TreeNodeSample right;
    TreeNodeSample() {}
    TreeNodeSample(int val) { this.val = val; }
    TreeNodeSample(int val, TreeNodeSample left, TreeNodeSample right) {
      this.val = val;
      this.left = left;
      this.right = right;
    }
}
