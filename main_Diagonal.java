package DSA_Array;
import java.util.*;
public class main_Diagonal {

    public int solve(final List<ArrayList<Integer>> A) {
        int Sum=0;
        for(int i=0;i<A.size();i++){
            Sum = Sum + A.get(i).get(i);
        }

        return Sum;
    }
    
}
