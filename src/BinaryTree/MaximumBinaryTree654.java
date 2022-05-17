package BinaryTree;

import java.util.Arrays;

public class MaximumBinaryTree654 {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums==null||nums.length==0){
            return null;
        }
        TreeNode root = new TreeNode();
        int length = nums.length;
        int maxIndex = 0;
        for (int i = 0; i < length; i++) {
            if (length-1-i<i){
                break;
            }else {
                if (nums[i]>nums[maxIndex]){
                    maxIndex = i;
                }
                if (nums[length-1-i]>nums[maxIndex]){
                    maxIndex = length-1-i;
                }
            }
        }
        root.val = nums[maxIndex];
        root.left = constructMaximumBinaryTree(Arrays.copyOfRange(nums,0,maxIndex));
        root.right = constructMaximumBinaryTree(Arrays.copyOfRange(nums,maxIndex+1,length));
        return root;
    }
}
