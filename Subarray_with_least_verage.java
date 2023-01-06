package sliding_Window;
import java.util.*;
public class Subarray_with_least_verage {

    public int solve(ArrayList<Integer> A, int B) {
        //sliding window
        int S=0;
        int E=B-1;
        int ind=0;

        int ans=Integer.MAX_VALUE;

        // declared prefix sum
        ArrayList<Integer> Prefix = new ArrayList<>();
        int PSum=0;

        for(int i=0;i<A.size();i++){
            PSum = PSum +  A.get(i);
            Prefix.add(PSum);
        }
        while(E < A.size()){
            int average=0;
            int Sum=0;

            if(S==0){
                Sum = Prefix.get(E);
            }
            else{
                Sum = Prefix.get(E) - Prefix.get(S-1);
            }

            average=Sum;

            if(average<ans){
                ans=average;
                ind = S;
            }
            S++;
            E++;
        }
        return ind;
    }
}
