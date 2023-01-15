package leetcode_problems;
import java.util.*;
public class two_Sum {
    public int[] twoSum(int[] nums, int target) {
        // We will be using hashmap
        // Store all elements in hashmap
        // keys will be index and values will be array values
        // as we know element + X = target
        // so look for (target - element) in hashmap
        // if found return the index of X as well as the index of element for which we were looking for (target - element)

        HashMap <Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        int[] ans= new int[2];
        for(int i=0;i<nums.length;i++){
            int look=target-nums[i];

            if(map.containsKey(look) && map.get(look)!=i){
                ans[0]=i;
                ans[1]=map.get(look);
            }
        }

        return ans;
    }
}
