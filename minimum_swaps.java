package DSA_Array;
import java.util.*;
public class minimum_swaps {
    public int solve(ArrayList<Integer> A, int B) {

        // find the number of elements less than equal to B (<=B) let's call it N
        // this will be the size of subarray when all lesser elements are clubbed together
        // now go over the subarrays with sliding window with subarray size now
        // count the number of elements greater than B in that particular subarray let's call it A
        // This will be (A) number of swaps required to make that particular subarray filled with lesser elements together
        // compare A with all the other A's and lowest A is answer

        // getting count of elements <=B which will be size of our subarray which we will iterate
        int N=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)<=B)
                N++;
        }

        // iterate over first subarray of length N t6 find elements greater than B , which are swaps required to bring all lesser elements together
        int ans=0;
        for(int i=0;i<N;i++){
            if(A.get(i)>B)
                ans++;
        }

        // apply sliding window for reducing iterations
        int realans=ans;
        int S=1;
        int E=N;
        while(E<A.size()){
            if(A.get(S-1) > B)
                ans--;
            if(A.get(E)>B)
                ans++;
            if(ans<realans)
                realans=ans;

            S++;
            E++;
        }
        return realans;
        // calculate TC & SC of this particular solution
    }
}
