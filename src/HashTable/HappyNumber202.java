package HashTable;


import java.util.HashSet;

public class HappyNumber202 {
    public static void main(String[] args) {
        System.out.println(isHappyNumber(19));
    }
    public static boolean isHappyNumber(int input){
        HashSet<Integer> usedNumb = new HashSet<>();
        if (input == 1){
            return true;
        }
        else if (input == 0){
            return false;
        }
        else{
            int intermediate = input;
            int intermediate2 = 0;
            while(intermediate!=1){
                if (usedNumb.contains(intermediate)){
                    return false;
                }else{
                    usedNumb.add(intermediate2);
                    intermediate2 = 0;
                    while(intermediate!=0){
                        int single = intermediate%10;
                        intermediate = intermediate/10;
                        intermediate2 += single*single;
                    }
                    intermediate = intermediate2;
                }
            }
            return true;
        }
    }
}
