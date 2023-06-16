package Sorting;
import java.util.*;
public class wave_Array {

    public int[] wave(int[] A) {
        // sort the array
        // apply logic on same array i.e swapping logic

        Arrays.sort(A);
        int P1=0;
        int P2=1;

        while(P1 < A.length && P2 < A.length ){
            int C=A[P1];
            A[P1]=A[P2];
            A[P2]=C;
            P1=P1+2;
            P2=P2+2;
        }

        return A;
    }
}
