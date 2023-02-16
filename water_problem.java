package DSA_Arrays_Questions;
import java.util.*;
public class water_problem {
    int minimum(int A , int B){
        if(A<B){
            return A;
        }
        else if(A==B){
            return 0;
        }
        else{
            return B;
        }
    }

    public int maxArea(int[] A) {
        int P1=0;
        int P2=A.length-1;
        long water=0;
        long ans=0;
        int H=0;
        int W=0;

        while(P1<P2){

            H = minimum(A[P1],A[P2]);
            if(H==0){
                H=A[P1];
                W= P2-P1;
                water =(long) ((long)H * W) ;
            }
            else{
                W = P2-P1;
                water =(long) ((long)H * W) ;
            }

            if(water>ans){
                ans=water;
            }

            if(minimum(A[P1],A[P2])==A[P1]){
                P1++;
            }
            else if(minimum(A[P1],A[P2])==A[P2]){
                P2--;
            }
            else if(A[P1]==A[P2]){
                P1++;
            }


        }
        return (int)ans;
    }

}
