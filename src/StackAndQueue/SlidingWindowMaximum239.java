package StackAndQueue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowMaximum239 {
    public static void main(String[] args) {
        int[] param = {};
        int k = 10007;
        System.out.println(maxSlidingWindow(param,k));
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int resultLength = nums.length-k+1;
        int[] result = new int[resultLength];
        int[] window;
        int max = -100000;
        if (k==1){
            result = nums;
        }else{
            window = Arrays.copyOfRange(nums,0,k);
            max = Arrays.stream(window).max().getAsInt();
            result[0]=max;
            for (int i = k; i < nums.length; i++) {
                if (nums[i]>=max){
                    max = nums[i];
                    window[i%k] = nums[i];
                }else if(window[i%k] == max){
                    window[i%k] = nums[i];
                    max = Arrays.stream(window).max().getAsInt();
                }else{
                    window[i%k] = nums[i];
                }
                result[i-k+1] = max;
            }
        }
        return result;
    }
}
