package BinaryTree;

import java.util.*;

public class FindBottomLeftTreeValue513 {
    public int findBottomLeftValue(TreeNodeSample root) {
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        BottomLeftValue(root,pq,0);
        return pq.peek().getKey();
    }
    public void BottomLeftValue(TreeNodeSample node,PriorityQueue<Map.Entry<Integer,Integer>> pq,int level){
        if (node!=null){
            level++;
            if (node.left!=null){
                BottomLeftValue(node.left,pq,level);
            }
            if (node.right!=null){
                BottomLeftValue(node.right,pq,level);
            }
            if (node.left == null&&node.right==null){
                Map<Integer,Integer> map = new HashMap<>();
                map.put(node.val,level);
                pq.addAll(map.entrySet());
            }
        }
    }
}
