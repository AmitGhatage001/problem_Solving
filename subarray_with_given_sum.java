package two_and_three_pointers;
import java.util.*;
public class subarray_with_given_sum {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        int P1=0;
        int P2=0;
        int oursum=A.get(0);

// retry the question bcz made logical mistakes while solving with teh approach
        ArrayList<Integer> list = new ArrayList<>();

        while(P2<A.size()-1){

            // if(P1==P2){
            //     oursum = oursum - A.get(P2);
            //     P2++;
            // }

            // oursum=A.get(P1) + A.get(P2);

            if(oursum < B){
                P2++;
                oursum = oursum + A.get(P2);
            }
            if(oursum > B){
                oursum = oursum - A.get(P1);
                P1++;
            }
            if(oursum == B){
                while(P1<=P2){
                    list.add(A.get(P1));
                    P1++;
                }
                return list;
            }
        }
        // System.out.print(P1+" "+P2+" "+oursum);
        list.add(-1);
        return list;

    }
}
