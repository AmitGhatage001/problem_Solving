package mergeSort;
import java.util.*;
public class magicNumber {

    public int[] solve(int[] A) {
        // Sort the Array
        // Apply logic for Maximum and minimum magic number
        // create array of max,min answer array and return the array
        // Handling edge cases
        // if()
        // Sort the Array
        Arrays.sort(A);

        // 3 11 -1 5
        // -1 3 5 11

        // Apply logic for Maximum and minimum magic number
        long min_magic=0;
        long max_magic=0;

        for(int i=1;i<A.length;i=i+2){
            min_magic = (min_magic + A[i] - A[i-1])%1000000007;
        }
        // 1 2 3 4 5 6 -> 3
        // 0 1 2 3 4 5 -> 2
        int middle=A.length/2;

        for(int i=0;i<middle;i++){
            max_magic = (max_magic + A[A.length-1-i]- A[i])%1000000007;
        }
        int[] ans = new int[2];
        ans[0]=(int)max_magic;
        ans[1]=(int)min_magic;

        return ans;
    }
}
