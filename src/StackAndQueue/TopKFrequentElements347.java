package StackAndQueue;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements347 {
    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(topKFrequent(nums,k));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        int count = 0;
        PriorityQueue<Map.Entry<Integer,Integer>> priorityQueue = new PriorityQueue<>(11,new Comparator<Map.Entry<Integer, Integer>>(){
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        Map<Integer,Integer> map = new HashMap<>();
        for (int value:nums) {
            if (map.containsKey(value)){
                map.put(value,map.get(value)+1);
            }else{
                map.put(value,1);
            }
        }
        priorityQueue.addAll(map.entrySet());
        while(count<k){
            result[count] = priorityQueue.poll().getKey();
            count++;
        }
        return result;
    }

}


