package hashMap;
import java.util.*;
public class check_Pair_Sum {
    public int solve(int A, ArrayList<Integer> B) {
        // put array elements in hashmap key=array_element and value=index
        // look=A-array[i] // if true in for loop return 1

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<B.size();i++){
            map.put(B.get(i),i);
        }

        for(int i=0;i<B.size();i++){

            int look = A - B.get(i);

            if(map.containsKey(look) && map.get(look)!=i){
                return 1;
            }
        }

        return 0;
    }
}
