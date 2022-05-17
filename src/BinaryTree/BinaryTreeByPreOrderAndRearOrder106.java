package BinaryTree;

import java.util.Arrays;

public class BinaryTreeByPreOrderAndRearOrder106 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(Arrays.copyOfRange(a, 0, a.length-1)));
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode root = new TreeNode();
        if(inorder.length==0 && postorder.length==0||inorder.length==0||postorder.length==0){
            return null;
        }else{
            root.val = postorder[postorder.length-1];
            int rootLocation = 0;
            for (int i = 0; i < inorder.length-1; i++) {
                if (inorder[i]==root.val){
                    rootLocation = i;
                    break;
                }
            }
            if (inorder.length==1){
                if (inorder[0]==postorder[0]){
                    root.left = null;
                    root.right = null;
                }
            }else{
                if (0<rootLocation&&rootLocation<inorder.length-1){
                    int[] leftTreeInorder = Arrays.copyOfRange(inorder,0,rootLocation);
                    int[] leftTreePostorder = Arrays.copyOfRange(postorder,0,rootLocation);
                    int[] rightTreeInorder = Arrays.copyOfRange(inorder,rootLocation+1,inorder.length);
                    int[] rightTreePostorder = Arrays.copyOfRange(postorder,rootLocation+1,postorder.length-1);
                    root.left = buildTree(leftTreeInorder,leftTreePostorder);
                    root.right = buildTree(rightTreeInorder,rightTreePostorder);
                } else if (rootLocation ==0&&inorder.length-1>1){
                    int[] rightTreeInorder = Arrays.copyOfRange(inorder,rootLocation+1,inorder.length);
                    int[] rightTreePostorder = Arrays.copyOfRange(postorder,rootLocation+1,postorder.length-1);
                    root.left = null;
                    root.right = buildTree(rightTreeInorder,rightTreePostorder);
                } else if (rootLocation == inorder.length - 1){
                    int[] leftTreeInorder = Arrays.copyOfRange(inorder,0,rootLocation);
                    int[] leftTreePostorder = Arrays.copyOfRange(postorder,0,rootLocation);
                    root.left = buildTree(leftTreeInorder,leftTreePostorder);
                    root.right = null;
                }
            }

        }
            return root;
    }

}
