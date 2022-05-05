package HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum18 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> tempList = new ArrayList<>();
        int length = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (nums[i]-target != 0){
                tempList.add(nums[i]-target);
            }
        }
        int zeroCount = length-tempList.size();
        //若数组全部<=0或>=0时返回空
        if ((nums[0]==0&&nums[3]!=0) || (nums[length-1]==0&&nums[length-4]!=0)){
            return result;
        }
        int[] tempArray = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            tempArray[i] = tempList.get(i);
        }
        if (zeroCount == 0){
            result.addAll(fourWithoutZero(tempArray));
        }else if(zeroCount == 1){
            result.addAll(fourWithoutZero(tempArray));
            result.addAll(threeWithoutZero(tempArray));
        }else if (zeroCount == 2 ||zeroCount == 3){
            result.addAll(fourWithoutZero(tempArray));
            result.addAll(threeWithoutZero(tempArray));
            result.addAll(twoWithoutZero(tempArray));
        }else if (zeroCount > 3){
            result.addAll(fourWithoutZero(tempArray));
            result.addAll(threeWithoutZero(tempArray));
            result.addAll(twoWithoutZero(tempArray));
            result.add(new ArrayList<Integer>(){{add(0);add(0);add(0);add(0);}});
        }
        return result;
    }
    public List<List<Integer>> fourWithoutZero(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length-i-1; j++) {
                List<Integer> subResult = new ArrayList<>();
                int firstLoopTemp = nums[i]+nums[length-i-1];
                if (firstLoopTemp < 0){
                    if (nums[length-j]+nums[length-j-1] < firstLoopTemp){
                        break;
                    }else if(nums[length-j]+nums[length-j-1] == firstLoopTemp){
                        subResult.add(nums[i]);
                        subResult.add(nums[length-j]);
                        subResult.add(nums[length-j-1]);
                        subResult.add(nums[length-i-1]);
                        result.add(subResult);
                        break;
                    }
                }else if (firstLoopTemp > 0){
                    if (nums[j]+nums[j+1] > firstLoopTemp){
                        break;
                    }else if (nums[j]+nums[j+1] == firstLoopTemp){
                        subResult.add(nums[i]);
                        subResult.add(nums[j]);
                        subResult.add(nums[j+1]);
                        subResult.add(nums[length-i-1]);

                        result.add(subResult);
                        break;
                    }
                }else{
                    int k = length-j-1;
                    while(nums[j]+nums[k] < 0){
                        k--;
                    }
                    if (nums[j]+nums[k] ==0){
                        subResult.add(nums[i]);
                        subResult.add(nums[j]);
                        subResult.add(nums[k]);
                        subResult.add(nums[length-i-1]);

                        result.add(subResult);
                    }
                    break;
                }
            }
        }
        return result;
    }

    public List<List<Integer>> threeWithoutZero(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length-1; i++) {
            List<Integer> subResult = new ArrayList<>();
            if (nums[i] > 0 || nums[length-i-1] <0){
                break;
            }
            int firstLoopTemp = nums[i]+nums[length-i-1];
            for (int j = i+1; j < length-i-1; j++) {
                if (nums[j] > 0 || nums[length-j-1] <0){
                    break;
                }
                if (firstLoopTemp > 0){
                    if (firstLoopTemp + nums[j] > 0 ) break;
                    else if (firstLoopTemp + nums[j] ==0){
                        subResult.add(nums[i]);
                        subResult.add(nums[j]);
                        subResult.add(0);
                        subResult.add(nums[length-i-1]);
                        result.add(subResult);
                    }
                }else if (firstLoopTemp < 0){
                    if (firstLoopTemp + nums[length-j-1] < 0) break;
                    else if (firstLoopTemp + nums[length-j-1] == 0){
                        subResult.add(nums[i]);
                        subResult.add(0);
                        subResult.add(nums[length-j-1]);
                        subResult.add(nums[length-i-1]);
                        result.add(subResult);
                    }
                }else{
                    break;
                }
            }
        }
        return result;
    }

    public List<List<Integer>> twoWithoutZero(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int length = nums.length;
        for (int i = 0; i < length-1; i++) {
            if (nums[i]>0){
                break;
            }
            List<Integer> subResult = new ArrayList<>();
            int loopTemp = nums[i]+nums[length-i-1];
            if (loopTemp == 0){
                subResult.add(nums[i]);
                subResult.add(0);
                subResult.add(0);
                subResult.add(nums[length-i-1]);
                result.add(subResult);
            }
            else if(loopTemp > 0){
                int k = i;
                while (loopTemp + nums[k]<0){
                    k++;
                }
                if (loopTemp == nums[k]){
                    subResult.add(nums[k]);
                    subResult.add(0);
                    subResult.add(0);
                    subResult.add(nums[length-i-1]);
                    result.add(subResult);
                }
            }else{
                int k = length-i-1;
                while (loopTemp + nums[k] > 0){
                    k--;
                }
                if (loopTemp == nums[k]){
                    subResult.add(nums[i]);
                    subResult.add(0);
                    subResult.add(0);
                    subResult.add(nums[k]);
                    result.add(subResult);
                }
            }
        }
        return result;
    }

    public List<List<Integer>> fourSumDoublePointer(int[] nums, int target){
        int length = nums.length;
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        if (length < 4){
            return result;
        }

        for (int i = 0; i < length-1; i++) {
            if (nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target){
                break;
            }
            if (nums[i] + nums[length - 3] + nums[length - 2] + nums[length - 1] < target){
                continue;
            }
            for (int j = i+1; j < length-1; j++) {
                if (nums[i]+nums[j]+nums[j+1]+nums[j+2]>target){
                    break;
                }
                if (nums[i] + nums[j] + nums[length - 2] + nums[length - 1] < target){
                    continue;
                }
                int left = j+1; int right = length-1;
                while(left < right){
                    int sum =nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum< target){
                        left++;
                    }else if (sum > target){
                        right--;
                    }else{
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        left++;
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        right--;
                    }
                }
            }
        }
        return result;
    }
}
