package Prefix_Sum;
import java.util.*;
public class Pivot_Integer {
    public int pivotInteger(int n) {
        // create prefix array of size of n
        // store prefix Sums
        // for each value in prefix matrix check if the Prefix[i] is equal to the
        // Prefix[N-1]-Prefix[i] (add explicity condition for 0th index)
        int[] Prefix = new int[n];
        int Sum=0;
        for(int i=0;i<n;i++){
            Sum = Sum + i + 1;
            Prefix[i]=Sum;
        }
        int K=0;
        int leftsum=0;
        int rightsum=0;
        int ans=Integer.MIN_VALUE;

        while(K<n){
            if(K==0){
                leftsum=Prefix[0];
            }
            else{
                leftsum=Prefix[K];
            }
            if(K==0){
                rightsum=Prefix[n-1];
            }
            else{
                rightsum=Prefix[n-1]-Prefix[K-1];
            }

            if(leftsum == rightsum){
                ans=K+1;
                break;
            }
            K++;
        }
        if(ans==Integer.MIN_VALUE){
            return -1;
        }
        else{
            return ans;
        }

    }
}
