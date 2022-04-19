package HashTable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int lengthOfArrays = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int[] result = {0,0};
        for (int i = 0; i < lengthOfArrays; i++) {
            Integer intermediate = target - nums[i];
            if(map.containsKey(intermediate)){
                result[0] = i;
                result[1] = map.get(intermediate);
            }else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
}
