package DSA_Array;
import java.util.*;
public class second_Largest {

    public int solve(ArrayList<Integer> A) {

        if(A.size()==1){
            return -1;
        }

        int Max=A.get(0);
        int SMax=Integer.MIN_VALUE;

        for(int i=0;i<A.size();i++){
            int N=A.get(i);
            if(N>Max){
                SMax=Max;
                Max=N;
            }
            if(N>SMax && N < Max){
                SMax=N;
            }
        }
        if(SMax==Integer.MIN_VALUE)
            return -1;
        else
            return SMax;
    }
}
