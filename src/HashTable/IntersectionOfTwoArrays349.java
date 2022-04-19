package HashTable;

import java.util.*;

public class IntersectionOfTwoArrays349 {
    public static void main(String[] args) {
        int[] a = {2,3,45,7,4,6};
        int[] b = {2,45};
        System.out.println(Arrays.toString(intersection(a, b)));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> array = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int k : nums1) {
            set.add(k);
        }
        for (int i : nums2) {
            if (set.contains(i))
                array.add(i);
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
