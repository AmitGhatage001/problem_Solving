package Kadans_algorithm;
import java.util.*;
public class Solution {
    public int maxSubArray(final List<Integer> A) {

        int total=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<A.size();i++){
            total = total + A.get(i);
            if(total>maxSum){
                maxSum=total;
            }
            if(total<0){
                total=0;
            }
        }

        return maxSum;
    }
}
