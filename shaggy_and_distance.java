package hashing;
import java.util.*;
public class shaggy_and_distance {
    public int solve(int[] A) {
        // hashmap on the fly
        HashMap<Integer,Integer> map = new HashMap<>();

        int min=Integer.MAX_VALUE;

        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){

                int dist = i - map.get(A[i]);
                if(dist<min){
                    min=dist;
                }
            }
            else{
                map.put(A[i],i);
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        else
            return min;

    }
}
