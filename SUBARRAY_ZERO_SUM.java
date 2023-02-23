package hashing;
import java.util.*;
public class SUBARRAY_ZERO_SUM {
    public int solve(int[] A) {

        HashSet<Long> hset = new HashSet<>();

        int N=A.length;
        long sum=0;

        for(int i=0;i<N;i++){
            sum = sum + (long)A[i];
            hset.add(sum);
        }
        // System.out.println(hset.size()+" "+sum+" "+N);
        // System.out.println(hset);

        if(hset.size()<N){
            return 1;  // if Hashset Size is less than the array Size
        }
        else if(hset.contains(0l)){
            return 1; // if hashset contains Zero
        }
        else{
            return 0;
        }
    }
}
