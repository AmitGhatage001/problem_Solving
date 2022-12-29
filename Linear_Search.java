package DSA_Array;
import java.util.*;
public class Linear_Search {

    public class Solution {
        public int solve(ArrayList<Integer> A, int B) {
            int Count=0;
            for(int i=0;i<A.size();i++){
                if(A.get(i).equals(B)){
                    Count++;
                }
            }

            return Count;
        }
    }
    
}
