package DSA_Array;
import java.util.*;
public class Sliding_window {

    public int solve(ArrayList<Integer> A, int B, int C) {

        int N=A.size(); // lengrth of ArrayList
        // get the sumn from 0 to B-1
        // check sum with B -> if yes return 1 // using if statement
        // calculate sums for the S-> 1 to (B-1) & e=B to (N-1)
        // that's int
        int sum=0;
        for(int i=0;i<B;i++){
            sum = sum + A.get(i);
        }
        if(sum==C){
            return 1;
        }

        int S=1;
        int E=B;

        while(E<N){
            sum= sum - A.get(S-1) + A.get(E);
            if(sum==C){
                return 1;
            }
            S++;
            E++;
        }
        return 0;
    }
}
