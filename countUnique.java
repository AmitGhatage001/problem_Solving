package hashMAP;
import java.util.*;
public class countUnique {
    public int solve(int[] A) {
        // Inputting elements into hashmap
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                int K=map.get(A[i]);
                K++;
                map.put(A[i],K);
            }
            else{
                map.put(A[i],1);
            }
        }
        int ans=0;

        for(int i=0;i<A.length;i++){
            if(map.get(A[i])==1){
                ans++;
            }
        }

        return ans;

    }
}
