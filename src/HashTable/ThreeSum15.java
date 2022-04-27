package HashTable;

import apple.laf.JRSUIUtils;

import java.util.*;

public class ThreeSum15 {
    public static void main(String[] args) {
        int [] a= {-1,0,1,2,-1,-4};
        threeSum(a);
    }
    //暴力解法
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> internalResult = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println(k);
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> subset = new ArrayList<>();
                        subset.add(nums[i]);
                        subset.add(nums[j]);
                        subset.add(nums[k]);
                        int temp;
                        if (subset.get(0)>subset.get(1)){
                            temp = subset.get(0);
                            subset.set(0,subset.get(1));
                            subset.set(1,temp);
                        }
                        if (subset.get(0)>subset.get(2)){
                            temp = subset.get(0);
                            subset.set(0,subset.get(2));
                            subset.set(2,temp);
                        }
                        if (subset.get(1)>subset.get(2)){
                            temp = subset.get(1);
                            subset.set(1,subset.get(2));
                            subset.set(2,temp);
                        }
                        internalResult.add(subset);
                    }
                }
            }
        }
        return new ArrayList<>(internalResult);
    }
    public static List<List<Integer>> threeSumQuick(int[] nums){
        Set<List<Integer>> internalResult = new HashSet<>();
        Arrays.sort(nums);
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                int k = length-j-1;
                if (k < j){
                    break;
                }
                if (nums[i]+nums[j]+nums[k]<0){
                    break;
                }else if (nums[i]+nums[j]+nums[k]==0){
                    List<Integer> subset = new ArrayList<>();
                    subset.add(nums[i]);
                    subset.add(nums[j]);
                    subset.add(nums[k]);
                    internalResult.add(subset);
                }
            }
        }
        return new ArrayList<>(internalResult);
    }
}
