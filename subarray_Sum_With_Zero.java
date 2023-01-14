package hashsets;
import java.util.*;
public class subarray_Sum_With_Zero {

    public int solve(ArrayList<Integer> A) {
        // Understood approach from instructor (it is optimized)

        // create a prefix array of given array
        // Check if there is a duplicate element in  Prefix array
        // if Duplicate then it means , there is subarray with sum zero
        // PF[i]=PF[i-a]+sum(i-a,i);

        ArrayList<Long> Prefix = new ArrayList<>();
        long Sum=0;
        for(int i=0;i<A.size();i++){
            Sum=Sum + (long)A.get(i);
            Prefix.add(Sum);
        }

        HashSet<Long> hset = new HashSet<>();
        for(int i=0;i<A.size();i++){
            hset.add(Prefix.get(i));  // remember hashset will not take duplicate keys , will store it only once
            // no repeating keys in hashmap
        }
        if(hset.size()<A.size()){
            return 1;
        }
        else if(hset.contains(0l)){
            return 1;
        }
        else{
            return 0;
        }

    }
}
