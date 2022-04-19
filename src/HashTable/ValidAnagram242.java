package HashTable;

public class ValidAnagram242 {
    public static void main(String[] args) {
        String firstString = "anagram";
        String secondString = "gramana";

        System.out.println(isAnagramWithBaseDataType(firstString,secondString));
    }

    /**
     * 用基础数据类型hashTable实现 时间复杂度O(n)
     * @param s 测试字段1
     * @param t 测试字段2
     * @return 两字段是否为异位字符
     */
    public static boolean isAnagramWithBaseDataType(String s, String t) {

        char[] s_array = s.toCharArray();
        char[] t_array = t.toCharArray();
        if(s_array.length!=t_array.length){
            return false;
        }else{
            int[] s_hash = new int[26];
            int[] t_hash = new int[26];
            for (int i=0;i<s_array.length;i++){
                int s_index = s_array[i]-97;
                s_hash[s_index] = ++s_hash[s_index];
                int t_index = t_array[i]-97;
                t_hash[t_index] = ++t_hash[t_index];
            }
            for (int j=0;j<s_hash.length;j++){
                if (s_hash[j]!=t_hash[j])
                    return false;
            }
            return true;
        }
    }
}
