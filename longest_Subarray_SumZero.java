package hashMap;
import java.util.*;
public class longest_Subarray_SumZero {
    public int solve(ArrayList<Integer> A) {
        // create prefix Sum
        // Insert the prefix Sum into Hashmap (Logically)

        ArrayList<Long> Prefix = new ArrayList<>();
        Long Sum=0l;
        int maxSize=0;
        for(int i=0;i<A.size();i++){
            Sum=Sum + (long)A.get(i);
            if(Sum==0){
                maxSize=i+1;
            }
            Prefix.add(Sum);
        }
        HashMap<Long,Integer> map = new HashMap<>();

        for(int i=0;i<Prefix.size();i++){
            if(map.containsKey(Prefix.get(i))){
                if(i-map.get(Prefix.get(i))+1 > maxSize){
                    maxSize=i-map.get(Prefix.get(i));
                }
            }
            else{
                map.put(Prefix.get(i),i);
            }
        }

        return maxSize;
    }
}
