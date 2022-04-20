package HashTable;


import java.util.HashMap;
import java.util.Map;

public class FourSumII454 {
    public static void main(String[] args) {
        int[] a ={1,2};
        int[] b = {-2,-1};
        int[] c = {-1,2};
        int[] d = {0,2};

        System.out.println(fourSumCount(a,b,c,d));
    }
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int length = nums1.length;
        int result = 0;
        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                Integer map1Key = nums1[i] + nums2[j];
                Integer map2Key = nums3[i] + nums4[j];
                if (map1.containsKey(map1Key)){
                    Integer intermedia1 = map1.get(map1Key)+1;
                    map1.put(map1Key,intermedia1);
                }else{
                    map1.put(map1Key,1);
                }
                if (map2.containsKey(map2Key)){
                    Integer intermedia2 = map2.get(map2Key)+1;
                    map2.put(map2Key,intermedia2);
                }else{
                    map2.put(map2Key,1);
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            Integer temp = entry.getKey()*-1;
            if (map2.containsKey(temp)){
                result += entry.getValue()*map2.get(temp);
            }
        }
        return result;
    }
}
