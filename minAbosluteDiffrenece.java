package mergeSort;
import java.util.*;
public class minAbosluteDiffrenece {

    public int solve(int[] A) {
        // Sorting the array
        Arrays.sort(A);

        // min variable
        int min=Integer.MAX_VALUE;

        // iterating over sorted array
        for(int i=1;i<A.length;i++){
            int dif=A[i]-A[i-1];
            if(dif<min)
                min=dif;
        }

        return min;
    }
}
