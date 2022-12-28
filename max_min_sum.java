package DSA_Array;
import java.util.*;
public class max_min_sum {

    public int solve(ArrayList<Integer> A) {

        Collections.sort(A);

        int ans=A.get(0) + A.get(A.size()-1);

        return ans;
    }

}
