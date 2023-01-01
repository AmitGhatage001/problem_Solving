package DSA_Array;
import java.util.*;
public class time_Equality {

    public int solve(ArrayList<Integer> A) {
        int max=A.get(0);

        for(int i=0;i<A.size();i++){
            if(A.get(i) > max)
                max = A.get(i);
        }
        int ans=0;
        for(int i=0;i<A.size();i++){
            int N=A.get(i);
            ans = ans + (max - N);
        }
        return ans;
    }
}
