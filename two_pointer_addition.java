package two_and_three_pointers;
import java.util.*;
public class two_pointer_addition {
    public int solve(int[] A, int B) {
// Going through code again to see how duplicate numbers have been handled
        int P1=0;
        int P2=A.length-1;
        long ans=0;
// 2 2 2 2 2 4 4 4 4 4 -> 6
//1 1 3 3 3 3 3 0 0 -> 6
// nCr = n(n-1)/r

        while(P1<P2){

            if(A[P1]+A[P2]==B){
                // if numbers adding up are not equal
                if(A[P1]!=A[P2]){

                    long cnt1=0;
                    long cnt2=0;
                    // handling logic for duplicate numbers in array
                    int X=A[P1];
                    while(A[P1]==X){
                        P1++;
                        cnt1++;
                    }
                    int Y=A[P2];
                    while(A[P2]==Y){
                        P2--;
                        cnt2++;
                    }
                    // P1++;
                    // P2--;
                    // System.out.println(P1+" "+P2+" "+cnt1+" "+cnt2);
                    ans= (ans + (cnt1*cnt2)) % 1000000007;

                }
                // if numbers adding up are equal (This is an edge case in problem) we use nCr here
                else if(A[P1]==A[P2]){
                    long cnt3=0;
                    int X=A[P1];
                    while( P1<A.length && A[P1]==X){
                        cnt3++;
                        P1++;
                    }
                    ans = ( ans + ((cnt3*(cnt3-1))/2) ) % 1000000007;
                }

            }

            else if ((A[P1]+A[P2]) > B){
                P2--;
            }
            else if((A[P1]+A[P2]) < B){
                P1++;
            }


        }

        return (int)ans;
    }
}
