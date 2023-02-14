package two_and_three_pointers;
import java.util.*;
public class pair_with_given_Diffrence {
    public int solve(int[] A, int B) {
// keeping pointers at 0tha dn 1st location and then increasing P1 if diffrence is less than intended
// and increasing P2 if diffrence is greater than intended

        int P1=0;
        int P2=1;
        int ans=0;
        Arrays.sort(A); // sorting the array to apply two pointer approach
// 2 2 4 5 6 6 6
// 2 6 8
        while(P1<A.length-1 && P2<A.length){
            int diff=A[P2]-A[P1];
            // System.out.println(P1+" "+P2+" "+ans+" "+A[P1]+" "+A[P2]);
            if(diff==B){
                ans++;
                int X=A[P1];
                while(P1<A.length && A[P1]==X){
                    P1++;
                }
                int Y=A[P2];
                while(P2<A.length && A[P2]==Y){
                    P2++;
                }
            }
            else if(diff<B){
                P2++;
            }
            else if(diff>B){
                P1++;
                if(P1==P2){
                    P2++;
                }
            }
        }
        // System.out.println(P1+" "+P2+" "+ans);

        return ans;
    }
}
