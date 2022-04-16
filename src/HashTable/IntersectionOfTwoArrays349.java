package HashTable;

import java.util.*;

public class IntersectionOfTwoArrays349 {
    public static void main(String[] args) {
        int[] a = {2,3,45,7,4,6};
        int[] b = {2,45};
        System.out.println(Arrays.toString(intersection(a, b)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        int s1Length = nums1.length;
        int s2Length = nums2.length;
        List<Integer> array = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i=0;i<s1Length;i++){
                set.add(nums1[i]);
        }
        for (int j=0;j<s2Length;j++){
            if (set.contains(nums2[j]))
                    array.add(nums2[j]);
        }
        int[] result = new int[array.size()];
        int count = 0;
        for (Integer subset:array) {
            result[count] = subset;
            count++;
        }
        return result;
    }
}
