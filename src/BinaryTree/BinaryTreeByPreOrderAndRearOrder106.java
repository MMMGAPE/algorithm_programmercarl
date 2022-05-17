package BinaryTree;

import java.util.Arrays;

public class BinaryTreeByPreOrderAndRearOrder106 {
    public static void main(String[] args) {
        int[] a = {2,1};
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, 1)));
        buildTree(a,a);
    }
    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = new TreeNode();
        if(inorder.length==0||postorder.length==0){
            return null;
        }else if (inorder.length==1||postorder.length==1){
            root.val = postorder[0];
            root.left = null;
            root.right = null;
        }else{
            root.val = postorder[postorder.length-1];
            int rootLocation = 0;
            for (int i = 0; i < inorder.length; i++) {
                if (inorder[i]==root.val){
                    rootLocation = i;
                    break;
                }
            }
            if (0<rootLocation&&rootLocation<inorder.length-1){
                int[] leftTreeInorder = Arrays.copyOfRange(inorder,0,rootLocation);
                int[] leftTreePostorder = Arrays.copyOfRange(postorder,0,rootLocation);
                int[] rightTreeInorder = Arrays.copyOfRange(inorder,rootLocation+1,inorder.length);
                int[] rightTreePostorder = Arrays.copyOfRange(postorder,rootLocation,postorder.length-1);
                root.left = buildTree(leftTreeInorder,leftTreePostorder);
                root.right = buildTree(rightTreeInorder,rightTreePostorder);
            } else if (rootLocation == 0){
                int[] rightTreeInorder = Arrays.copyOfRange(inorder,1,inorder.length);
                int[] rightTreePostorder = Arrays.copyOfRange(postorder,0,postorder.length-1);
                root.left = null;
                root.right = buildTree(rightTreeInorder,rightTreePostorder);
            } else if (rootLocation == inorder.length - 1){
                int[] leftTreeInorder = Arrays.copyOfRange(inorder,0,rootLocation);
                int[] leftTreePostorder = Arrays.copyOfRange(postorder,0,rootLocation);
                root.left = buildTree(leftTreeInorder,leftTreePostorder);
                root.right = null;
            }
        }
        return root;
    }
}
