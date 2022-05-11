package BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class SymmetricTree101 {
    public boolean isSymmetric(TreeNodeSample root) {
        return check(root,root);
    }
    public boolean check(TreeNodeSample p,TreeNodeSample q){
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val==q.val && check(p.left,q.left) && check(p.right,q.right);
    }

}
