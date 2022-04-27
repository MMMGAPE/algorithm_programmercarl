package HashTable;

import java.util.HashMap;
import java.util.Map;

public class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] a = ransomNote.toCharArray();
        char[] b = magazine.toCharArray();
        Map<String,Integer> mapA = new HashMap<>();
        Map<String,Integer> mapB = new HashMap<>();
        for (char subset:a) {
            String subsetString = String.valueOf(subset);
            if (mapA.containsKey(subsetString)){
                mapA.put(subsetString,mapA.get(subsetString)+1);
            }else{
                mapA.put(subsetString,1);
            }
        }
        for (char subset:b) {
            String subsetString = String.valueOf(subset);
            if (mapB.containsKey(subsetString)){
                mapB.put(subsetString,mapB.get(subsetString)+1);
            }else{
                mapB.put(subsetString,1);
            }
        }
        for(Map.Entry<String,Integer> entry:mapA.entrySet()){
            if (!mapB.containsKey(entry.getKey())){
                return false;
            }else if (entry.getValue()>mapB.get(entry.getKey())){
                return false;
            }
        }
        return true;
    }
}
