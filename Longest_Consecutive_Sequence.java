package hashing;
import java.util.*;
public class Longest_Consecutive_Sequence {
    public int longestConsecutive(final int[] A) {

        HashSet<Long> hset = new HashSet<>();

        for(int i=0;i<A.length;i++){// adding elements in hashset
            long arr=(long)A[i];
            hset.add(arr);
        }

        int ans=0;
// Main logic
        for(int i=0;i<A.length;i++){
            long ele=A[i];
            long range=0;
            if(hset.contains(ele-1)){ // optimizing logic here
                continue;
            }
            while(hset.contains(ele)){
                range++;
                ele=ele+1;
            }
            if(range>ans){
                ans=(int)range;
            }
        }
        return ans;
    }
}
