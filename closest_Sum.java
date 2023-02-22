package two_and_three_pointers;
import java.util.*;
public class closest_Sum {
    public int threeSumClosest(int[] A, int B) {
//39,2,64,498,5
// 2 5 39 64 498

        int N=A.length;

        Arrays.sort(A);// sorting array

        int sum=0;

        if(N<=3){ // handling edge Case
            int i=0;

            while(i<N){
                sum += A[i];
                i++;
            }
            return sum;
        }

        else{

            int closestSum=1000000000;
// 2 2 2 3
//39,2,64,498,5
// 2 5 39 64 498
            for(int i=0;i<N-2;i++){
                // duplicate skipping condition
                // if(A[i]==A[i+1]){ no need of this logic
                //     i++;
                // }
                // other 2 pointers logic
                int j=i+1;
                int k=N-1;



                while(j<k){

                    sum = A[i] + A[j] + A[k];

                    if( Math.abs(B-sum) < Math.abs(closestSum-B) ){ // not sure on this liogic yet ?
                        // this logic ensures that we updated closestsum only when we get sum less than previous sum Math.abs(closestSum-sum)
                        closestSum=sum;
                    }

                    if(sum<B){
                        j++;
                    }
                    else{
                        k--;
                    }

                }


            }

            return closestSum;
        }

    }
}
