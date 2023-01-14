package hashsets;

import java.util.ArrayList;
import java.util.HashSet;

public class count_Distinct_elements {

    public int solve(ArrayList<Integer> A) {

        // Can i optimize it furthur ?

        // Currently TC-O(N) SC-O(N)

        // Define HashSet
        // Puut arrray elements in in in
        // return it's size
        HashSet<Integer> hset = new HashSet<Integer>();
        for(int k=0;k<A.size();k++){
            hset.add(A.get(k));
        }
        int ans=hset.size();

        return ans;
    }
}
